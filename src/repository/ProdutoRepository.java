package repository;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

// Certifique-se de que o nome aqui está IDÊNTICO ao nome do arquivo:
public class ProdutoRepository {
    
    private static List<Produto> listaProdutos = new ArrayList<>();

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
    }

    public boolean alterar(Produto produtoAlterado) {
        for (Produto p : listaProdutos) {
            if (p.getCodProduto() == produtoAlterado.getCodProduto()) {
                p.setNome(produtoAlterado.getNome());
                p.setPreco(produtoAlterado.getPreco());
                p.setQuantidadeEstoque(produtoAlterado.getQuantidadeEstoque());
                return true;
            }
        }
        return false;
    }

    public boolean excluir(int codProduto) {
        return listaProdutos.removeIf(p -> p.getCodProduto() == codProduto);
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
}