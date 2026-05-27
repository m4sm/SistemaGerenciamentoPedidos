package controller;

import java.util.List;
import model.Cliente;

public class ClienteController {
    public void incluirCliente(Cliente cliente) {
        cliente.incluir(); // Dispara o incluir da Model
    }

    public void alterarCliente(Cliente cliente) {
        cliente.alterar();
    }
//oi
    public void excluirCliente(int id) {
        // Como não temos o objeto completo, criamos um temporário
        Cliente c = new Cliente();
        c.setId_cliente(id);
        c.excluir();
    }

    public Cliente consultarCliente(int id) {
        return Cliente.consultar(id);
    }

    public List<Cliente> listarClientes() {
        return Cliente.listar();
    }
}
