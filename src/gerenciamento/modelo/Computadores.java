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
public class Computadores {
    
    private int codComputador;
    private String marca;
    private String cor;
    private String modelo;
    private String sitemaOpercional;
    private String memoria;
    private String garantiaFornecedor;
    private String pesquisa;

    public Computadores(String marca, String cor, String modelo, String sitemaOpercional,String memoria, String garantiaFornecedor) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.sitemaOpercional = sitemaOpercional;
        this.memoria = memoria;
        this.garantiaFornecedor = garantiaFornecedor;
    }
    
    public Computadores(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSitemaOpercional() {
        return sitemaOpercional;
    }

    public void setSitemaOpercional(String sitemaOpercional) {
        this.sitemaOpercional = sitemaOpercional;
    }
    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getGarantiaFornecedor() {
        return garantiaFornecedor;
    }

    public void setGarantiaFornecedor(String garantiaFornecedor) {
        this.garantiaFornecedor = garantiaFornecedor;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the codComputador
     */
    public int getCodComputador() {
        return codComputador;
    }

    /**
     * @param codComputador the codComputador to set
     */
    public void setCodComputador(int codComputador) {
        this.codComputador = codComputador;
    }
    
    
}
