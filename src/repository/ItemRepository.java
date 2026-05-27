package repository;

import model.Item;
import java.util.ArrayList;
import java.util.List;


public class ItemRepository {
    private List<Item> listaItem = new ArrayList();
    
    public void incluir(Item item){
        listaItem.add(item);
    }
    
    public void alterar(Item item){
        for(Item i : listaItem){
            if(i.getIdItem() == item.getIdItem()){
                i.setIdItem(item.getIdItem());
                i.setSeqItem(item.getSeqItem());
                i.setIdProduto(item.getIdProduto());
                i.setQtdItens(item.getQtdItens());
                i.setPrecoUniItem(item.getPrecoUniItem());
                i.setPrecoTotal(item.getPrecoTotal());
            }
            break;
        }
    }
    
    public void excluir(int idItem, int seqItem){
        listaItem.removeIf(i->i.getIdItem() == idItem && i.getSeqItem() == seqItem);
    }
    
    public Item consultar(int id, int seqItem){
        for( Item i : listaItem){
            if(i.getIdItem() == id && i.getSeqItem() == seqItem){
                return i;
            }
        }
        return null;
    }
    
    public List<Item> listar(){
        return listaItem;
    }
}
