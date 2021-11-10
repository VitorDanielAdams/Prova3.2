package main.Controller;

import main.Dao.ClienteDao;
import main.Model.Cliente;

import java.util.*;

public class ControllerCliente {

    private List<Cliente> listClientes = new ArrayList<>();

    public void cadastrarCl(List<Cliente> cliente){

        ClienteDao cd = new ClienteDao();

        for(int i = 0;i < cliente.size();i++){
            if(cliente.get(i).getId_cliente() != (cliente.get(i).getId_cliente()+1)){
                cliente.get(i).setId_cliente(Long.valueOf(i)+1);
                cd.gravarCliente(cliente.get(i));
                listClientes.add(cliente.get(i));
            }
        }

    }

    public List<Cliente> listarCl(){

        return listClientes;

    }

    public Cliente getClienteIdSelect(int index){

        return listClientes.get(index-1);

    }
}
