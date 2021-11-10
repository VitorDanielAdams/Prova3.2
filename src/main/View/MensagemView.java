package main.View;

import main.Model.Cliente;
import main.Model.Mensagem;
import main.Controller.MensagemController;

import java.util.Scanner;

public class MensagemView {

    MensagemController mc = new MensagemController();

    public void cadastrarMsg(Cliente id_cl){

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        Mensagem msg = new Mensagem();

        System.out.println("Digite a mensagem");
        msg.setMensagem(entrada.next());

        msg.setId_cliente(id_cl.getId_cliente());

        mc.cadastrarMensagem(msg,id_cl);

        System.out.println("Mensagem Cadastrada!");
    }

    public void mostrarMsg(Cliente id_cl){
        System.out.println(mc.listarMsg(id_cl));
    }
}
