package controller;

import java.util.ArrayList;
import java.util.List;
import model.Item;

public class ItemController {
    
    public void incluirItem(Item i){
        i.incluir();
    }
    
    public void alterarItem(Item i){
        i.alterar();
    }
    
    public void excluirItem(int id, int seq){
        Item.excluir(id, seq);
    }
    
    public Item consultarItem(int id, int seq){
        return Item.consultar(id, seq);
    }
    
    public List<Item> listarItem(){
        return Item.listar();
    }
}
