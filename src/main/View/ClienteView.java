package main.View;

import main.Model.Cliente;
import main.Controller.ControllerCliente;

import java.util.*;

public class ClienteView {

    ControllerCliente cc = new ControllerCliente();

    public void cadastrarCliente() {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        Cliente cliente = new Cliente();

        System.out.println("Informe o ID do cliente");
        cliente.setId_cliente(entrada.nextLong());

        System.out.println("Informe o nome do cliente");
        cliente.setNome(entrada.next());

        System.out.println("Informe o CPF do cliente");
        cliente.setCpf(entrada.next());

        System.out.println("Informe o telefone do cliente");
        cliente.setTelefone(entrada.nextInt());

        List<Cliente> listCl = new ArrayList<>();
        listCl.add(cliente);

        cc.cadastrarCl(listCl);

        System.out.println("Cliente Cadastrado!");
    }

    public void mostrarCliente(){

        System.out.println(cc.listarCl());

    }

    public Cliente acessarCliente(){

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Escolha o cliente: ");
        this.mostrarCliente();
        Cliente cliente = cc.getClienteIdSelect(entrada.nextInt());

        System.out.println("Cliente selecionado");
        System.out.println(cliente);

        return cliente;
    }
}
