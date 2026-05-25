package model;

import repository.ItemRepository;
import java.util.List;
import java.util.ArrayList;

public class Item{
    public int id_item;
    public int seq_item;
    public int id_produto;
    public int qtd_itens;
    public float preco_uni_item;
    public float preco_total;
    
    private static ItemRepository repository = new ItemRepository();
    
    public Item(int id_item, int seq_item, int id_produto, int qtd_itens, float preco_uni_item, float preco_total){
        this.id_item = id_item;
        this.seq_item = seq_item;
        this.id_produto = id_produto;
        this.qtd_itens = qtd_itens;
        this.preco_uni_item = preco_uni_item;
        this.preco_total = preco_total;
    }
    
    //Getters
    
    public int getIdItem(){
        return id_item;
    }
    
    public int getSeqItem(){
        return seq_item;
    }
    
    public int getIdProduto(){
        return id_produto;
    }
    
    public int getQtdItens(){
        return qtd_itens;
    }
    
    public float getPrecoUniItem(){
        return preco_uni_item;
    }
    
    public float getPrecoTotal(){
        return preco_total;
    }
    
    //Setters
     public void setIdItem(int id_item) {
        this.id_item = id_item;
    }

    public void setSeqItem(int seq_item) {
        this.seq_item = seq_item;
    }

    public void setIdProduto(int id_produto) {
        this.id_produto = id_produto;
    }

    public void setQtdItens(int qtd_itens) {
        this.qtd_itens = qtd_itens;
    }

    public void setPrecoUniItem(float preco_uni_item) {
        this.preco_uni_item = preco_uni_item;
    }

    public void setPrecoTotal(float preco_total) {
        this.preco_total = preco_total;
    }
    
    //Funções
    
    public void incluir(){
        repository.incluir(this);
    }
    
    public void alterar(){
        repository.alterar(this);
    }
    
    public static void excluir(int id, int seq){
        repository.excluir(id, seq);
    }
    
    public static Item consultar(int id, int seq){
      return repository.consultar(id, seq);
    }
    
    public static List<Item> listar(){
        return repository.listar();
    }
}