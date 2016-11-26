package gerenciamento.modelo;

import java.util.Date;
import gerenciamento.dao.AdministradorDAO;

/**
 *
 * @author aminathamiguel
 */
public class Administrador {

    private String usuario;
    private String senha;
    private String nome;
    private String sexo;
    private int telefone;
    private int cpf;
    private Date DataNascimento;
    private String pesquisa;
    

    public Administrador(String usuario, String senha, String nome, String sexo, int telefone, int cpf, Date DataNascimento) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;

        this.cpf = cpf;

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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
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

}
