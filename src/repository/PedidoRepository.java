package repository;

import util.ArquivoUtil;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Pedido;

public class PedidoRepository {
    private final String NOME_ARQUIVO = "data/pedido.csv";
    
    public ArrayList<Pedido> listar(){
        ArrayList<Pedido> listaPedidos = new ArrayList();
       
        List<String> linhas = ArquivoUtil.carregarDados(NOME_ARQUIVO);
        
        for(String linha : linhas){
            if(linha.trim().isEmpty()){
                continue;
            }          
            
            String[] colunas = linha.split(";");
                
            if (colunas.length == 5) {

                int id_pedido = Integer.parseInt(colunas[0]);
                int id_cliente = Integer.parseInt(colunas[1]);
                LocalDate data_entrega = LocalDate.parse(colunas[2]); 
                LocalDate data_pedido = LocalDate.parse(colunas[3]);  
                float valor_total = Float.parseFloat(colunas[4]);
                Pedido p = new Pedido(id_pedido, id_cliente, data_entrega, data_pedido, valor_total);
                listaPedidos.add(p);
            }
        }
        
        return listaPedidos;
    }
        
    private void atualizarArquivo(ArrayList<Pedido> listaPedidos) {
        List<String> linhasFormatoCSV = new ArrayList<>();
        
        for (Pedido p : listaPedidos) {
            String linha = p.getIdPedido() + ";" +
                           p.getIdCliente() + ";" +
                           p.getDataEntrega().toString() + ";" + 
                           p.getDataPedido().toString() + ";" +
                           p.getValorTotal();
                           
            linhasFormatoCSV.add(linha);
        }
        
        ArquivoUtil.salvarDados(NOME_ARQUIVO, linhasFormatoCSV);
    }       
        
    public void incluir(Pedido p){
        ArrayList<Pedido> lista = listar();
        lista.add(p);
        atualizarArquivo(lista);
    }
    
    public void alterar(Pedido pedido){
        ArrayList<Pedido> lista = listar();
        
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getIdPedido() == pedido.getIdPedido()) {
                    lista.set(i, pedido);
                    break;
            }
        }
        
        atualizarArquivo(lista);
    }
    
    public Pedido consultar(int id){
        ArrayList<Pedido> lista = listar();
        
            for(Pedido p : lista){
                if(p.getIdPedido() == id){
                    return p;
            }
        }
        return null;
    }
    
    public void excluir(int id) {
       ArrayList<Pedido> lista = listar();
               
        lista.removeIf(p -> p.getIdPedido() == id);
    
        atualizarArquivo(lista);
    }
}

