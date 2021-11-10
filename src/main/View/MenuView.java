package main.View;

import main.Model.Cliente;
import main.View.*;

import java.util.Scanner;

public class MenuView {

    ClienteView cv = new ClienteView();
    MensagemView mv = new MensagemView();

    public void menu(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Cadastrar Cliente\n2 - Mostrar Clientes\n3 - Acessar Cliente:");
        switch (entrada.nextInt()){
            case 1:
                cv.cadastrarCliente();
                this.menu();
                break;
            case 2:
                cv.mostrarCliente();
                this.menu();
                break;
            case 3:
                Cliente id = cv.acessarCliente();
                this.menuM(id);
                break;
            default:
                System.out.println("Opção inválida!");
                this.menu();
        }
    }

    public void menuM(Cliente id){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Digitar mensagem\n2 - Mostrar Mensagens do Cliente\n3 - Retornar");
        switch (entrada.nextInt()){
            case 1:
                mv.cadastrarMsg(id);
                this.menuM(id);
                break;
            case 2:
                mv.mostrarMsg(id);
                this.menuM(id);
                break;
            case 3:
                this.menu();
                break;
            default:
                System.out.println("Opção Inválida!");
                this.menuM(id);
        }
    }

}
