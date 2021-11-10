package main.Controller;

import main.Dao.ClienteDao;
import main.Dao.MensagemDao;
import main.Model.Cliente;
import main.Model.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    private List<Mensagem> mensagemList = new ArrayList<>();

    public void cadastrarMensagem(Mensagem msg, Cliente id){

        MensagemDao md = new MensagemDao();

        md.gravarMsg(msg, id);
        mensagemList.add(msg);

    }

    public List<Mensagem> listarMsg(Cliente id_cl){

        List<Mensagem> mensagemListCliente = new ArrayList<>();

        for(int i = 0;i < mensagemList.size();i++){
            if(mensagemList.get(i).getId_cliente() == id_cl.getId_cliente()){
                mensagemListCliente.add(mensagemList.get(i));
            }
        }

        return mensagemListCliente;

    }
}
