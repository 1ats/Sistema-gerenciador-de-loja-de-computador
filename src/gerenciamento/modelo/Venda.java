/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aminathamiguel
 */
public class Venda extends AbstractTableModel{
    
    private ArrayList linhas =  null;
    private String[] colunas = null;
    
public Venda(ArrayList lin,String[] col){
    setLinhas(lin);
    setColunas(col);
}
   /* 
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
*/
    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount(){ //contagem colunas
        return colunas.length;
    }
    public int getRowCount(){  //contagem linhas
        return linhas.size();
        
    }
    public String getColumnName(int numCol){ //pegar o nome da coluna
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){ //receber a quantidade de linhas
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
   
    
}
