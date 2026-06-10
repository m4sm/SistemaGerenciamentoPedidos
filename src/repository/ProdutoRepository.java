package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;
import util.ArquivoUtil;

public class ProdutoRepository {
    
    private static List<Produto> listaProdutos = new ArrayList<>();
    
    
    private static final String NOME_ARQUIVO = "data/produtos.csv";

    
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
        salvarNoArquivo(); 
    }

    public boolean alterar(Produto produtoAlterado) {
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
        boolean removido = listaProdutos.removeIf(p -> p.getCodProduto() == codProduto);
        if (removido) {
            salvarNoArquivo(); 
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
        List<String> linhas = ArquivoUtil.carregarDados(NOME_ARQUIVO);

        if (linhas == null || linhas.isEmpty()) {
            return;
        }

        listaProdutos.clear();

        
        for (int i = 1; i < linhas.size(); i++) {
            String linha = linhas.get(i);
            String[] dados = linha.split(";");

            if (dados.length >= 4) {
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
                } catch (Exception e) {
                    System.out.println("Erro ao processar linha do CSV de produtos: " + linha);
                }
            }
        }
    }
}