package main.Dao;

import main.Model.Cliente;
import main.Model.Mensagem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MensagemDao {

    public void gravarMsg(Mensagem msg, Cliente id){

        try {
            File arquivo = new File("log.txt");

            if(arquivo.isFile() ==  false){
                arquivo.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(arquivo, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Mensagem do Cliente " + id.getNome() + ": "+ '"' +msg.getMensagem() + '"'
                    +" cadastrada com sucesso! ");

            printWriter.flush();
            printWriter.close();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
