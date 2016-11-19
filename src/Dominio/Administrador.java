package Dominio;

import java.util.Date;
import Modelo.AdminDao;

/**
 *
 * @author aminathamiguel
 */
public class Administrador extends Funcionario {

    public Administrador(String usuario, String senha, String nome, String sexo, String estadoCivil, int telefone, int cpf, int rg, Date DataNascimento) {
        super(usuario, senha, nome, sexo, telefone, estadoCivil, cpf, rg, DataNascimento);
    }

}
