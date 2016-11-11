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
public class Computadores {
    private String marca;
    private String cor;
    private String modelo;
    private String velocidade;
    private String sitemaOpercional;
    private String cache;
    private String memoria;
    private String garantiaFornecedor;

    public Computadores(String marca, String cor, String modelo, String velocidade, String sitemaOpercional, String cache, String memoria, String garantiaFornecedor) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.sitemaOpercional = sitemaOpercional;
        this.cache = cache;
        this.memoria = memoria;
        this.garantiaFornecedor = garantiaFornecedor;
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

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getSitemaOpercional() {
        return sitemaOpercional;
    }

    public void setSitemaOpercional(String sitemaOpercional) {
        this.sitemaOpercional = sitemaOpercional;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
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
    
    
}
