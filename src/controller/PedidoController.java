package controller;

import model.Pedido;
import repository.PedidoRepository;
import java.util.ArrayList;

public class PedidoController {
    
    // O Controller cria uma instância do Repositório para poder usá-lo
    private final PedidoRepository repository;

    public PedidoController() {
        this.repository = new PedidoRepository();
    }
    
    public void incluirPedido(Pedido p){
        // Manda o repositório incluir no arquivo
        repository.incluir(p);
    }
    
    public void alterarPedido(Pedido p){
        // Manda o repositório alterar no arquivo
        repository.alterar(p);
    }
    
    public Pedido consultarPedido(int id){
        // Pede para o repositório buscar o pedido
        return repository.consultar(id);
    }
    
    public void excluirPedido(int id){
        // Manda o repositório excluir
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
}