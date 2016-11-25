/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.modelo;

/**
 *
 * @author aminathamiguel
 */
public class Sms {

    Cliente cli;
    String mensagem;
    int codigo;

    public Sms(Cliente cli, String mensagem, int codigo) {
        this.cli = cli;
        this.mensagem = mensagem;
        this.codigo = codigo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
