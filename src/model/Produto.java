package model;

public class Produto {
    private int codProduto;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor Vazio
    public Produto() {
    }

    // Construtor Completo (Corrigido para o Controller usar)
    public Produto(int codProduto, String nome, double preco, int quantidadeEstoque) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos Getters e Setters
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", nome=" + nome + ", preco=" + preco + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
}