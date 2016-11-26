/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.modelo;

import java.sql.Date;

/**
 *
 * @author aminathamiguel
 */
public class Cliente {
    private int cpf;
    private Funcionario func;
    
    private String nome;
    private String sexo;
    private int telefone;
    private Date dataNascimento;

    public Cliente(int cpf, Funcionario func, String nome, String sexo, int telefone, Date dataNascimento) {
        this.cpf = cpf;
        this.func = func;
        
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }  
}
