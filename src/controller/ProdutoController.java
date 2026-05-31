package controller;

import java.util.List;
import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController {
    
    private ProdutoRepository repository;

    public ProdutoController() {
        this.repository = new ProdutoRepository();
    }

    //Obter sugestão de próximo código para mandar para a tela
    public int obterProximoCodigo() {
        return repository.sugerirProximoCodigo();
    }

    //Cadastrar Produto com validações básicas de negócio
    public boolean cadastrarProduto(int codigo, String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty() || preco <= 0 || quantidade < 0) {
            return false; // Retorna falso se os dados forem inválidos
        }
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        repository.salvar(produto);
        return true;
    }

    //Atualizar Produto existente
    public boolean atualizarProduto(int codigo, String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty() || preco <= 0 || quantidade < 0) {
            return false;
        }
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        return repository.alterar(produto);
    }

    //Remover Produto por código
    public boolean removerProduto(int codigo) {
        return repository.excluir(codigo);
    }

    //Listar e filtrar produtos para a tabela da View
    public List<Produto> listarProdutos(String termoBusca) {
        return repository.consultar(termoBusca);
    }
}