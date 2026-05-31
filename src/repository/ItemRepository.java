package repository;

import java.util.ArrayList;
import java.util.List;
import model.Item;
import util.ArquivoUtil;

public class ItemRepository {

    private final String NOME_ARQUIVO = "data/item.csv";

    public ItemRepository() {
    }

    public ArrayList<Item> listar() {
        ArrayList<Item> listaItens = new ArrayList<>();
        List<String> linhas = ArquivoUtil.carregarDados(NOME_ARQUIVO);
        
        for (String linha : linhas) {
            if (linha.trim().isEmpty()) {
                continue;
            }
            
            String[] colunas = linha.split(";");
            int idItem = Integer.parseInt(colunas[0]);
            int seqItem = Integer.parseInt(colunas[1]);
            int idProduto = Integer.parseInt(colunas[2]);
            int qtdItens = Integer.parseInt(colunas[3]);
            float precoUniItem = Float.parseFloat(colunas[4]);
            float precoTotal = Float.parseFloat(colunas[5]);
            
            Item item = new Item(idItem, seqItem, idProduto, qtdItens, precoUniItem, precoTotal);
            listaItens.add(item);
        }
        return listaItens;
    }

    private void atualizarArquivo(ArrayList<Item> listaItens) {
        List<String> linhasFormatoCSV = new ArrayList<>();
        for (Item i : listaItens) {
            String linha = i.getIdPedido() + ";" +
                           i.getSeqItem() + ";" +
                           i.getIdProduto() + ";" +
                           i.getQtdItens() + ";" +
                           i.getPrecoUniItem() + ";" +
                           i.getPrecoTotal();
            linhasFormatoCSV.add(linha);
        }
        ArquivoUtil.salvarDados(NOME_ARQUIVO, linhasFormatoCSV);
    }

    public void incluir(Item item) {
        ArrayList<Item> lista = listar();
        lista.add(item);
        atualizarArquivo(lista);
    }

    public void alterar(Item item) {
        ArrayList<Item> lista = listar();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdPedido() == item.getIdPedido() && lista.get(i).getSeqItem() == item.getSeqItem()) {
                lista.set(i, item);
                break;
            }
        }
        atualizarArquivo(lista);
    }

    public void excluir(int id, int seq) {
        ArrayList<Item> lista = listar();
        lista.removeIf(p -> p.getIdPedido() == id && p.getSeqItem() == seq);
        atualizarArquivo(lista);
    }

    public Item consultar(int id, int seq) {
        ArrayList<Item> lista = listar();
        for (Item i : lista) {
            if (i.getIdPedido() == id && i.getSeqItem() == seq) {
                return i;
            }
        }
        return null;
    }
}