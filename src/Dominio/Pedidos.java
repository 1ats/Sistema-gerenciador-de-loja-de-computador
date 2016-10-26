/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author aminathamiguel
 */
public class Pedidos {

    int clienteCodigo;
    String produto;
    Cliente cli;
    /*private pesquisarCliente pesCli;
    private adicionarProduto addP;
    private modoPagamento modoP;*/

    public Pedidos(int clienteCodigo, String produto, Cliente cli) {
        this.clienteCodigo = clienteCodigo;
        this.produto = produto;
        this.cli = cli;
    }

    public int getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    

}
