/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Pedido;

public class PedidoRepository {
    private ArrayList<Pedido> listaPedidos = new ArrayList();
    
    
    public void incluir(Pedido p){
        listaPedidos.add(p);
    }
    
    public void alterar(Pedido pedido){
        for(Pedido p : listaPedidos){
            if(p.getIdPedido() == pedido.getIdPedido()){
                p.setIdPedido(pedido.getIdPedido());
                p.setIdCliente(pedido.getIdCliente());
                p.setDataEntrega(pedido.getDataEntrega());
                p.setDataPedido(pedido.getDataPedido());
                break;
            }
        }
    }
    
    public Pedido consultar(int id){
        for(Pedido p : listaPedidos){
            if(p.getIdPedido() == id){
                return p;
            }
        }
        return null;
    }
    
    public void excluir(int id) {
    listaPedidos.removeIf(p -> p.getIdPedido() == id);
    }
    
    public ArrayList<Pedido> listar(){
        return listaPedidos;
    }
}
