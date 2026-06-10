package controller;

import model.Pedido;
import repository.PedidoRepository;
import java.util.ArrayList;

public class PedidoController {

    private final PedidoRepository repository;

    public PedidoController() {
        this.repository = new PedidoRepository();
    }
    
    public void incluirPedido(Pedido p){
        repository.incluir(p);
    }
    
    public void alterarPedido(Pedido p){
        repository.alterar(p);
    }
    
    public Pedido consultarPedido(int id){
        return repository.consultar(id);
    }
    
    public void excluirPedido(int id){
        repository.excluir(id);
    }
    
    public ArrayList<Pedido> listarPedido(){
        return repository.listar();
    }

    public void listarEmTabela(javax.swing.JTable tabela) {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();

    modelo.setRowCount(0);

    java.util.ArrayList<model.Pedido> listaPedidos = repository.listar();

    java.time.format.DateTimeFormatter fmtBR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

    for (model.Pedido p : listaPedidos) {
        Object[] linha = new Object[] {
            p.getIdPedido(),
            p.getIdCliente(),
            p.getDataPedido().format(fmtBR),   
            p.getDataEntrega().format(fmtBR),  
            String.format("%.2f", p.getValorTotal()) 
        };
            modelo.addRow(linha);
        }
    }
    
    public boolean idPedidoJaExiste(int idPedido) {
    java.util.ArrayList<model.Pedido> lista = repository.listar();

        for (model.Pedido p : lista) {
            if (p.getIdPedido() == idPedido) {
                return true;
        }
    }
    return false;
}
    public void atualizarValorTotalPedido(int idPedido) {
        model.Pedido pedido = repository.consultar(idPedido);
        
        if (pedido != null) {
            controller.ItemController itemController = new controller.ItemController();
            java.util.ArrayList<model.Item> todosItens = itemController.listar();
            
            float novoValorTotal = 0.0f;
            
            for (model.Item item : todosItens) {
                if (item.getIdPedido() == idPedido) { 
                    novoValorTotal += item.getPrecoTotal();
                }
            }

            pedido.setValorTotal(novoValorTotal); 
            repository.alterar(pedido);
        }
    }

    public java.util.List<model.Pedido> consultarPorCliente(int idCliente) {
        PedidoRepository repository = new PedidoRepository();
        
        java.util.List<model.Pedido> todosPedidos = repository.listar();
        java.util.List<model.Pedido> filtrados = new java.util.ArrayList<>();
 
        for (model.Pedido p : todosPedidos) {
            if (p.getIdCliente() == idCliente) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
    public java.util.List<model.Pedido> consultarPorDatas(String dataInicio, String dataFim) {
        PedidoRepository repository = new PedidoRepository();
        java.util.List<model.Pedido> filtrados = new java.util.ArrayList<>();
        
        try {

            java.time.format.DateTimeFormatter fmtBR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

            java.time.LocalDate inicio = java.time.LocalDate.parse(dataInicio, fmtBR);
            java.time.LocalDate fim = java.time.LocalDate.parse(dataFim, fmtBR);
            
            java.util.List<model.Pedido> todosPedidos = repository.listar();

            for (model.Pedido p : todosPedidos) {
                java.time.LocalDate dataPedido = p.getDataPedido();
 
                if (!dataPedido.isBefore(inicio) && !dataPedido.isAfter(fim)) {
                    filtrados.add(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao converter datas: " + e.getMessage());
        }
        
        return filtrados;
    }
}
