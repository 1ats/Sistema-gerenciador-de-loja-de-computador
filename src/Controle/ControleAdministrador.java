package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroAdministrador;

public class ControleAdministrador implements ActionListener {

    public static JDesktopPane jdprincipal;
    private CadastroAdministrador cadadmin;

    public ControleAdministrador(CadastroAdministrador cadadmin) {
        this.cadadmin = cadadmin;
    }

    public ControleAdministrador(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void CadastroAdm(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("usuario".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador usuario = new CadastroAdministrador();
            cadadmin.add(usuario);
            usuario.setVisible(true);
        }
        if ("senha".equalsIgnoreCase(e.getActionCommand())){
            CadastroAdministrador senha = new CadastroAdministrador();
            cadadmin.add(senha);
            senha.setVisible(true);  
        }
        if ("confirmarSenha".equalsIgnoreCase(e.getActionCommand())){
            CadastroAdministrador confirmasenha = new CadastroAdministrador();
            cadadmin.add(confirmasenha);
            confirmasenha.setVisible(true);  
        }
        if ("nome".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador nome = new CadastroAdministrador();
            cadadmin.add(nome);
            nome.setVisible(true);
        }
        if ("cpf".equalsIgnoreCase(e.getActionCommand())){
            CadastroAdministrador cpf = new CadastroAdministrador();
            cadadmin.add(cpf);
            cpf.setVisible(true);  
        }
        if ("rg".equalsIgnoreCase(e.getActionCommand())){
            CadastroAdministrador rg = new CadastroAdministrador();
            cadadmin.add(rg);
            rg.setVisible(true);  
        }if ("telefone".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador telefone = new CadastroAdministrador();
            cadadmin.add(telefone);
            telefone.setVisible(true);
        }
        if ("dia".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador dia = new CadastroAdministrador();
            cadadmin.add(dia);
            dia.setVisible(true);
        }if ("mes".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador mes = new CadastroAdministrador();
            cadadmin.add(mes);
            mes.setVisible(true);
        }if ("ano".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador ano = new CadastroAdministrador();
            cadadmin.add(ano);
            ano.setVisible(true);
        }
        if ("sexo".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador sexo = new CadastroAdministrador();
            cadadmin.add(sexo);
            sexo.setVisible(true);
        }if ("estadoCivil".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador estadocivil = new CadastroAdministrador();
            cadadmin.add(estadocivil);
            estadocivil.setVisible(true);
        }
    }
}
