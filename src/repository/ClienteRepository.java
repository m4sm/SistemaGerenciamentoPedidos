package repository;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import util.ArquivoUtil;

public class ClienteRepository {
    
    public ClienteRepository() {
        carregarDoArquivo();
    }

    private List<Cliente> listaClientes = new ArrayList<>();
    
    private int proximoId = 1; //Criando id e autoincrementando depois

    
    private void carregarDoArquivo(){
       List<String> linhas = ArquivoUtil.carregarDados("data/clientes.csv");
       
       int maiorId = 0;
       
       for(String linha : linhas){
           String[] dados = linha.split(";");
           
           if(dados.length == 2){
               int id = Integer.parseInt(dados[0]);
               String nome = dados[1];
               
               model.Cliente c = new Cliente(id,nome);
               listaClientes.add(c);
               
               //Monitorando o maior id pro autoincremento não se perder
               if(id > maiorId){
                   maiorId = id;
               }
           }
       }
       //O próximo id disponíevel será o maior encontrado + 1
       this.proximoId = maiorId + 1;
    }
    
    private void salvarNoArquivo(){
        List<String> linhas = new ArrayList<>();
        
        for(Cliente c : listaClientes){
            String linha = c.getId_cliente() + ";" + c.getNome();
            linhas.add(linha);
        }
        
        ArquivoUtil.salvarDados("data/clientes.csv", linhas);
    }
    
    public void incluir(Cliente cliente){
        cliente.setId_cliente(proximoId);
     
        listaClientes.add(cliente);
        
        proximoId++; 
        
        salvarNoArquivo();
    }
    //oi
    public void alterar(Cliente cliente) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId_cliente() == cliente.getId_cliente()) {
                listaClientes.set(i, cliente);
                break;
            }
        }
        salvarNoArquivo();
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
        
        salvarNoArquivo();
    }
    
    public List<Cliente> listar() {
        return listaClientes;
    }
}
