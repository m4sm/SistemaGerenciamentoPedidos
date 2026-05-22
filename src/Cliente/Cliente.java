package Cliente;
import java.util.ArrayList;

public class Cliente {
    private int id_cliente;
    private String nome;
    private ArrayList<Cliente> listaClientes;
    
    //+ incluir() + alterar() + excluir() + consultar() + listar()
    
    public void incluir(Cliente c){
        listaClientes.add(c);
    }
    
    public Cliente(int id_cliente, String nome) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        listaClientes = new ArrayList<>();
    }
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    
}
