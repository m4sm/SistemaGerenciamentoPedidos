package controller;

import java.util.ArrayList;
import model.Item;
import repository.ItemRepository;

public class ItemController {

    private final ItemRepository itemRepository = new ItemRepository();

    public void incluir(Item item) {
        itemRepository.incluir(item);
    }

    public void alterar(Item item) {
        itemRepository.alterar(item);
    }

    public void excluir(int id, int seq) {
        itemRepository.excluir(id, seq);
    }

    public Item consultar(int id, int seq) {
        return itemRepository.consultar(id, seq);
    }

    public ArrayList<Item> listar() {
        return itemRepository.listar();
    }

    public boolean itemJaExiste(int idItem, int seqItem) {
        ArrayList<Item> lista = itemRepository.listar();
        for (Item i : lista) {
            if (i.getIdItem() == idItem && i.getSeqItem() == seqItem) {
                return true;
            }
        }
        return false;
    }

    public void listarEmTabela(javax.swing.JTable tabela) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        
        ArrayList<Item> listaItens = itemRepository.listar();
        
        for (Item i : listaItens) {
            Object[] linha = new Object[] {
                i.getIdItem(),
                i.getSeqItem(),
                i.getIdProduto(),
                i.getQtdItens(),
                String.format("%.2f", i.getPrecoUniItem()),
                String.format("%.2f", i.getPrecoTotal())
            };
            modelo.addRow(linha);
        }
    }
}