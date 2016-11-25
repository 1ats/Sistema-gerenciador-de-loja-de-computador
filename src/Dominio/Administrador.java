package Dominio;

import java.util.Date;
import Modelo.AdminDao;

/**
 *
 * @author aminathamiguel
 */
public class Administrador{
    private String usuario;
    private String senha;
    private String nome;
    private String sexo;
    private String telefone;
    private String estadoCivil;
    private String cpf;
    private String rg;
    private Date DataNascimento;

    public Administrador(String usuario, String senha, String nome, String sexo, String telefone, String estadoCivil, String cpf, String rg, Date DataNascimento) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.rg = rg;
        this.DataNascimento = DataNascimento;
    }

    public Administrador() {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
