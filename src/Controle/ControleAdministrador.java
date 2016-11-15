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
        if("excluir".equals(e.getActionCommand())){  //limpa
            cadadmin.limpar();
        }
        if("cancelar".equals(e.getActionCommand())){
            cadadmin.dispose();
        }
        // excluir excluir um cadastro 
        }
}
