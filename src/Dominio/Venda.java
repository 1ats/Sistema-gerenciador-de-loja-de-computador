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
public class Venda {
    private Computadores comp;
    private Cliente cli;
    private Vendedor vend;
    private int qtotal;
    private String precoTotal;

    public Venda(Computadores comp, Cliente cli, Vendedor vend, int qtotal, String precoTotal) {
        this.comp = comp;
        this.cli = cli;
        this.vend = vend;
        this.qtotal = qtotal;
        this.precoTotal = precoTotal;
    }

    public Computadores getComp() {
        return comp;
    }

    public void setComp(Computadores comp) {
        this.comp = comp;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Vendedor getVend() {
        return vend;
    }

    public void setVend(Vendedor vend) {
        this.vend = vend;
    }

    public int getQtotal() {
        return qtotal;
    }

    public void setQtotal(int qtotal) {
        this.qtotal = qtotal;
    }

    public String getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }
    
   
    
}
