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

    }

}
