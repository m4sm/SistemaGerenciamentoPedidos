package model;

import repository.ClienteRepository;
import java.util.List;

public class Cliente {
    private int id_cliente;
    private String nome;
    
    // Instância do repositório para a Model conseguir operar os dados
    private static ClienteRepository repository = new ClienteRepository();
//oi
    // Construtores
    public Cliente() {}

    public Cliente(int id_cliente, String nome) {
        this.id_cliente = id_cliente;
        this.nome = nome;
    }

    // Métodos 
    public void incluir() {
        repository.incluir(this); // Passa o próprio cliente para o repositório salvar
    }

    public void alterar() {
        repository.alterar(this);
    }

    public void excluir() {
        repository.excluir(this.id_cliente);
    }

    public static Cliente consultar(int id) {
        return repository.consultar(id);
    }

    public static List<Cliente> listar() {
        return repository.listar();
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