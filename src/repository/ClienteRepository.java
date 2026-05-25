package repository;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteRepository {

    private List<Cliente> listaClientes = new ArrayList<>();
    
    private int proximoId = 1; //Criando id e autoincrementando depois
    
    public void incluir(Cliente cliente){
        cliente.setId_cliente(proximoId);
        
        listaClientes.add(cliente);
        
        proximoId++; 
    }
    
    public void alterar(Cliente cliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId_cliente() == cliente.getId_cliente()) {
                listaClientes.set(i, cliente);
                break;
            }
        }
    }
    
    public Cliente consultar(int id) {
        for (Cliente c : listaClientes) {
            if (c.getId_cliente() == id) {
                return c;
            }
        }
        return null;
    }
    
    public void excluir(int id) {
        listaClientes.removeIf(cliente -> cliente.getId_cliente() == id);
    }
    
    public List<Cliente> listar() {
        return listaClientes;
    }
}
