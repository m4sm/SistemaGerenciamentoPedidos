package controller;

import model.Pedido;
import java.util.ArrayList;

public class PedidoController {
    
    public void incluirPedido(Pedido p){
        p.incluir();
    }
    
    public void alterarPedido(Pedido p){
        p.alterar();
    }
    
    public Pedido consultarPedido(int id){
        return Pedido.consultar(id);
    }
    
    public void excluirPedido(int id){
        Pedido.excluir(id);
    }
    
    public ArrayList<Pedido> listarPedido(){
        return Pedido.listar();
    }
}
