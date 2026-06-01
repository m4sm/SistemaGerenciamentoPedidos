package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
import util.ArquivoUtil; // Importando a classe que seus colegas fizeram

public class ProdutoRepository {
    
    private static List<Produto> listaProdutos = new ArrayList<>();
    private static final String NOME_ARQUIVO = "produtos.csv";

    // Bloco estático: Executa uma única vez quando a classe é carregada pelo Java.
    // Serve para ler o arquivo CSV e preencher a lista ao abrir o programa.
    static {
        carregarDoArquivo();
    }

    public int sugerirProximoCodigo() {
        int maiorCodigo = 0;
        for (Produto p : listaProdutos) {
            if (p.getCodProduto() > maiorCodigo) {
                maiorCodigo = p.getCodProduto();
            }
        }
        return maiorCodigo + 1;
    }

    public void salvar(Produto produto) {
        listaProdutos.add(produto);
        salvarNoArquivo(); // Atualiza o arquivo CSV após salvar
    }

    public boolean alterar(Produto produtoAlterado) {
        for (Produto p : listaProdutos) {
            if (p.getCodProduto() == produtoAlterado.getCodProduto()) {
                p.setNome(produtoAlterado.getNome());
                p.setPreco(produtoAlterado.getPreco());
                p.setQuantidadeEstoque(produtoAlterado.getQuantidadeEstoque());
                
                salvarNoArquivo(); // Atualiza o arquivo CSV após alterar
                return true;
            }
        }
        return false;
    }

    public boolean excluir(int codProduto) {
        boolean removido = listaProdutos.removeIf(p -> p.getCodProduto() == codProduto);
        if (removido) {
            salvarNoArquivo(); // Atualiza o arquivo CSV após excluir
        }
        return removido;
    }

    public List<Produto> consultar(String termoBusca) {
        if (termoBusca == null || termoBusca.trim().isEmpty()) {
            return listaProdutos;
        }
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : listaProdutos) {
            String codigoStr = String.valueOf(p.getCodProduto());
            if (codigoStr.equals(termoBusca) || p.getNome().toLowerCase().contains(termoBusca.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    
    // INTEGRAÇÃO COM O ARQUIVO CSV
    

    /**
     * Transforma a lista de produtos em Strings e salva usando o ArquivoUtil
     */
    private static void salvarNoArquivo() {
        List<String> linhas = new ArrayList<>();
        
        // Adiciona o cabeçalho do arquivo CSV (usando ";" como separador)
        linhas.add("codProduto;nome;preco;quantidadeEstoque");
        
        // Converte cada produto em uma linha de texto separada por ";"
        for (Produto p : listaProdutos) {
            String linha = p.getCodProduto() + ";" + 
                           p.getNome() + ";" + 
                           p.getPreco() + ";" + 
                           p.getQuantidadeEstoque();
            linhas.add(linha);
        }
        
        // Chama o método estático que o seu grupo desenvolveu
        ArquivoUtil.salvarDados(NOME_ARQUIVO, linhas);
    }

    /**
     * Lê o arquivo CSV através do ArquivoUtil e reconstrói a lista de produtos
     */
    private static void carregarDoArquivo() {
        List<String> linhas = ArquivoUtil.carregarDados(NOME_ARQUIVO);
        
        // Se o arquivo estiver vazio ou não existir, não faz nada
        if (linhas.isEmpty()) {
            return;
        }
        
        listaProdutos.clear();
        
        // Começa do índice 1 para pular a primeira linha que é o cabeçalho (codProduto;nome...)
        for (int i = 1; i < linhas.size(); i++) {
            String linha = linhas.get(i);
            
            // Separa os dados usando o ponto e vírgula
            String[] dados = linha.split(";");
            
            // Conversão dos tipos de dados puxados do texto
            int codProduto = Integer.parseInt(dados[0]);
            String nome = dados[1];
            double preco = Double.parseDouble(dados[2]);
            int quantidadeEstoque = Integer.parseInt(dados[3]);
            
            // Cria o objeto e adiciona na lista estática
            Produto produto = new Produto();
            produto.setCodProduto(codProduto);
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidadeEstoque(quantidadeEstoque);
            
            listaProdutos.add(produto);
        }
    }
}