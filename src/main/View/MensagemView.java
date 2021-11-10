package main.View;

import main.Model.Mensagem;

import java.util.Scanner;

public class MensagemView {

    MensagemController mc = new MensagemController();

    public void cadastrarMsg(long id_cl){

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        Mensagem msg = new Mensagem();

        System.out.println("Digite a mensagem");
        msg.setMensagem(entrada.next());

        msg.setId_cliente(id_cl);

        mc.cadastrarMensagem(msg);

        System.out.println("Mensagem Cadastrada!");
    }

    public void mostrarMsg(){
        System.out.println(mc.listarMsg());
    }
}
