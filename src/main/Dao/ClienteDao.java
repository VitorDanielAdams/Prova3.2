package main.Dao;

import main.Model.Cliente;

import java.io.*;

public class ClienteDao {

    public void gravarCliente(Cliente cliente){

        try {
            File arquivo = new File("log.txt");

            if(arquivo.isFile() ==  false){
                arquivo.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(arquivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Cliente "+ cliente.getNome() +" Cadastrado com sucesso! ");

            printWriter.flush();
            printWriter.close();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
