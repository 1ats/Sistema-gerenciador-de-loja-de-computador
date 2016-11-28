/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroAdministrador;

/**
 *
 * @author aminathamiguel
 
public class ControleAdministrador implements ActionListener {

    private CadastroAdministrador cadadmin;

    public ControleAdministrador(CadastroAdministrador cadadmin) {
        this.cadadmin = cadadmin;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ("usuario".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador usuario = new CadastroAdministrador();
            cadadmin.add(usuario);
            usuario.setVisible(true);
        }
        if ("senha".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador senha = new CadastroAdministrador();
            cadadmin.add(senha);
            senha.setVisible(true);
        }
        if ("confirmarSenha".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador confirmasenha = new CadastroAdministrador();
            cadadmin.add(confirmasenha);
            confirmasenha.setVisible(true);
        }
        if ("nome".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador nome = new CadastroAdministrador();
            cadadmin.add(nome);
            nome.setVisible(true);
        }
        if ("cpf".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador cpf = new CadastroAdministrador();
            cadadmin.add(cpf);
            cpf.setVisible(true);
        }
        if ("telefone".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador telefone = new CadastroAdministrador();
            cadadmin.add(telefone);
            telefone.setVisible(true);
        }
        if ("dia".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador dia = new CadastroAdministrador();
            cadadmin.add(dia);
            dia.setVisible(true);
        }
        if ("mes".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador mes = new CadastroAdministrador();
            cadadmin.add(mes);
            mes.setVisible(true);
        }
        if ("ano".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador ano = new CadastroAdministrador();
            cadadmin.add(ano);
            ano.setVisible(true);
        }
        if ("sexo".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador sexo = new CadastroAdministrador();
            cadadmin.add(sexo);
            sexo.setVisible(true);
        }
        
    }
}*/
