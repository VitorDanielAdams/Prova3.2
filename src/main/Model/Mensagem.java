package main.Model;

public class Mensagem {

    private long id_msg;
    private String mensagem;
    private long id_cliente;

    public Mensagem() {
    }

    public long getId_msg() {
        return id_msg;
    }

    public void setId_msg(long id_msg) {
        this.id_msg = id_msg;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return ""+ id_msg +
                "mensagem='" + mensagem + '\n';
    }
}
