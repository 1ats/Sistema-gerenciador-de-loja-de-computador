
package Dominio;

import java.util.Date;

/**
 *
 * @author aminathamiguel
 */
public class Administrador extends Funcionario {

    public Administrador(String usu, String sen, String confirmarSen, String nom, String sex, int telef, String estadoCiv, int cp, int r, Date DataNasc) {
        super(usu, sen, confirmarSen, nom, sex, telef, estadoCiv, cp, r, DataNasc);
    }
    
}
