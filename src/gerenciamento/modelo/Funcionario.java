package gerenciamento.modelo;

import java.util.Date;

/**
 *
 * @author aminathamiguel
 */
public class Funcionario {

    private Integer codFuncionario;
    private String usuarioFuncionario;
    private String senhaFuncionario;
    private String tipoFuncionario;
    private String pesquisaFuncionario;

    public Funcionario() {

    }

    public Funcionario(Integer codFuncionario, String usuarioFuncionario, String senhaFuncionario, String tipoFuncionario) {
        this.codFuncionario = codFuncionario;
        this.usuarioFuncionario = usuarioFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getUsuarioFuncionario() {
        return usuarioFuncionario;
    }

    public void setUsuarioFuncionario(String usuarioFuncionario) {
        this.usuarioFuncionario = usuarioFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    /**
     * @return the pesquisaFuncionario
     */
    public String getPesquisaFuncionario() {
        return pesquisaFuncionario;
    }

    /**
     * @param pesquisaFuncionario the pesquisaFuncionario to set
     */
    public void setPesquisaFuncionario(String pesquisaFuncionario) {
        this.pesquisaFuncionario = pesquisaFuncionario;
    }

}
