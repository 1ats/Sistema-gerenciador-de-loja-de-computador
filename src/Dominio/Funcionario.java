package Dominio;

import java.util.Date;

/**
 *
 * @author aminathamiguel
 */
public class Funcionario {

    protected String usuario;
    protected String senha;
    protected String confirmarSenha;
    protected String nome;
    protected String sexo;
    protected int telefone;
    protected String estadoCivil;
    protected String cpf;
    protected String rg;
    protected Date DataNascimento;

    public Funcionario(String usuario, String senha, String confirmarSenha, String nome, String sexo, int telefone, String estadoCivil, String cpf, String rg, Date DataNascimento) {
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.rg = rg;
        this.DataNascimento = DataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

}
