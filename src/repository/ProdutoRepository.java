package repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.Produto;
import util.ArquivoUtil;

public class ProdutoRepository {
    
    private static List<Produto> listaProdutos = new ArrayList<>();
    
    // CAMINHO DINÂMICO: Descobre onde a pasta do projeto está rodando em qualquer PC
    private static final String NOME_ARQUIVO = System.getProperty("user.dir") 
            + File.separator + "data" + File.separator + "produtos.csv";

    // O bloco static continua aqui para a primeira carga do sistema
    static {
        carregarDoArquivo();
    }

    public int sugerirProximoCodigo() {
        // Força ler o arquivo antes de sugerir o ID para evitar duplicados entre PCs
        carregarDoArquivo(); 
        int maiorCodigo = 0;
        for (Produto p : listaProdutos) {
            if (p.getCodProduto() > maiorCodigo) {
                maiorCodigo = p.getCodProduto();
            }
        }
        return maiorCodigo + 1;
    }

    public void salvar(Produto produto) {
        carregarDoArquivo(); // Puxa os dados atualizados antes de inserir um novo
        listaProdutos.add(produto);
        salvarNoArquivo(); 
    }

    public boolean alterar(Produto produtoAlterado) {
        carregarDoArquivo(); // Garante que está alterando a lista mais recente
        for (Produto p : listaProdutos) {
            if (p.getCodProduto() == produtoAlterado.getCodProduto()) {
                p.setNome(produtoAlterado.getNome());
                p.setPreco(produtoAlterado.getPreco());
                p.setQuantidadeEstoque(produtoAlterado.getQuantidadeEstoque());
                
                salvarNoArquivo(); 
                return true;
            }
        }
        return false;
    }

    public boolean excluir(int codProduto) {
        carregarDoArquivo(); // Garante que está excluindo da lista mais recente
        boolean removido = listaProdutos.removeIf(p -> p.getCodProduto() == codProduto);
        if (removido) {
            salvarNoArquivo(); 
        }
        return removido;
    }

    public List<Produto> consultar(String termoBusca) {

    System.out.println("TESTE CONSULTAR EXECUTADO");
    System.out.println("Arquivo esperado: " + NOME_ARQUIVO);

    carregarDoArquivo();

    if (termoBusca == null || termoBusca.trim().isEmpty()) {
        return listaProdutos;
    }

    List<Produto> resultado = new ArrayList<>();

    for (Produto p : listaProdutos) {
        String codigoStr = String.valueOf(p.getCodProduto());

        if (codigoStr.equals(termoBusca)
                || p.getNome().toLowerCase().contains(termoBusca.toLowerCase())) {
            resultado.add(p);
        }
    }

    return resultado;
}

    private static void salvarNoArquivo() {
        List<String> linhas = new ArrayList<>();
        linhas.add("codProduto;nome;preco;quantidadeEstoque");
        
        for (Produto p : listaProdutos) {
            String linha = p.getCodProduto() + ";" + 
                           p.getNome() + ";" + 
                           p.getPreco() + ";" + 
                           p.getQuantidadeEstoque();
            linhas.add(linha);
        }
        
        ArquivoUtil.salvarDados(NOME_ARQUIVO, linhas);
    }

    private static void carregarDoArquivo() {

    System.out.println("=================================");
    System.out.println("Lendo arquivo: " + NOME_ARQUIVO);
    System.out.println("=================================");

    List<String> linhas = ArquivoUtil.carregarDados(NOME_ARQUIVO);

    if (linhas == null) {
        System.out.println("ERRO: Arquivo não encontrado ou retorno nulo.");
        return;
    }

    System.out.println("Quantidade de linhas lidas: " + linhas.size());

    if (linhas.isEmpty()) {
        System.out.println("Arquivo vazio.");
        return;
    }

    listaProdutos.clear();

    for (int i = 1; i < linhas.size(); i++) {

        String linha = linhas.get(i);
        System.out.println("Linha lida: " + linha);

        String[] dados = linha.split(";");

        if (dados.length < 4) {
            System.out.println("Linha ignorada (menos de 4 colunas): " + linha);
            continue;
        }

        try {
            int codProduto = Integer.parseInt(dados[0]);
            String nome = dados[1];
            double preco = Double.parseDouble(dados[2]);
            int quantidadeEstoque = Integer.parseInt(dados[3]);

            Produto produto = new Produto();
            produto.setCodProduto(codProduto);
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidadeEstoque(quantidadeEstoque);

            listaProdutos.add(produto);

            System.out.println(
                "Produto carregado -> ID: " + codProduto +
                " | Nome: " + nome +
                " | Preço: " + preco +
                " | Estoque: " + quantidadeEstoque
            );

        } catch (Exception e) {
            System.out.println("Erro ao processar linha: " + linha);
            e.printStackTrace();
        }
    }

    System.out.println("Total de produtos carregados: " + listaProdutos.size());
}
}