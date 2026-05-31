package model;

import java.time.LocalDate;
import repository.PedidoRepository;
import java.util.ArrayList;

public class Pedido {
    public int id_pedido;
    public int id_cliente;
    public LocalDate data_entrega;
    public LocalDate data_pedido;
    public float valor_total;
    
    private static PedidoRepository repository = new PedidoRepository();
    
    //Construtores
    public Pedido(int id_pedido, int id_cliente, LocalDate data_entrega, LocalDate data_pedido, float valor_total){
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.data_entrega = data_entrega;
        this.data_pedido = data_pedido;
        this.valor_total = valor_total;
    }
    
    //Getters
    public int getIdPedido(){
        return id_pedido;
    }
    
    public int getIdCliente(){
        return id_cliente;
    }
    
    public LocalDate getDataEntrega(){
        return data_entrega;
    }
    
    public LocalDate getDataPedido(){
        return data_pedido;
    }
    
    public float getValorTotal(){
        return valor_total;
    }
    
    //Setters
    public void setIdPedido(int id_pedido){
        this.id_pedido = id_pedido;
    }
    
    public void setIdCliente(int id_cliente){
        this.id_cliente = id_cliente;
    }
    
    public void setDataEntrega(LocalDate data_entrega){
        this.data_entrega = data_entrega;
    }
    
    public void setDataPedido(LocalDate data_pedido){
        this.data_pedido = data_pedido;
    }
    
    public void setValorTotal(float valor_total){
        this.valor_total = valor_total;
    }
    
    //Funções
    public void incluir(){
        repository.incluir(this);
    }
    
    public void alterar(){
        repository.alterar(this);
    }
    
    public static Pedido consultar(int id){
       return repository.consultar(id);
    }
    
    public static void excluir(int id){
        repository.excluir(id);
    }
    
    public static ArrayList<Pedido> listar(){
        return repository.listar();
    }
}
