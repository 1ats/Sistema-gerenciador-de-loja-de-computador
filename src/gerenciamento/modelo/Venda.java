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
public class Venda {
    private Computadores comp;
    private Cliente cli;
    private Funcionario vend;
    private int qtotal;
    private int precoTotal;

    public Venda(Computadores comp, Cliente cli, Funcionario vend, int qtotal, int precoTotal) {
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

    public Funcionario getVend() {
        return vend;
    }

    public void setVend(Funcionario vend) {
        this.vend = vend;
    }

    public int getQtotal() {
        return qtotal;
    }

    public void setQtotal(int qtotal) {
        this.qtotal = qtotal;
    }

    public int getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }
    
   
    
}
