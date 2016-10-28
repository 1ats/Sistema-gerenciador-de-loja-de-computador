package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroAdministrador;

public class ControleAdministrador implements ActionListener {

    public static JDesktopPane jdprincipal;
    private CadastroAdministrador cadadmin;

    public ControleAdministrador(CadastroAdministrador frame1) {
        this.cadadmin = cadadmin;
    }

    public ControleAdministrador(JDesktopPane jdprincial) {
        ControleAdministrador.jdprincipal = jdprincial;
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
        // Falta data, sexo e estado civil
    }
}
