/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author aminathamiguel
 */
public class Vendedor extends Funcionario {

    public Vendedor(Administrador adm,String usu, String sen, String confirmarSen, String nom, String sex, int telef, String estadoCiv, String cp, String r, Date DataNasc) {
        super(usu, sen, confirmarSen, nom, sex, telef, estadoCiv, cp, r, DataNasc);
        
    }
    
}