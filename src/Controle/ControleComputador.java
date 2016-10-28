package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroComputadores;

/**
 *
 * @author aminathamiguel
 */
public class ControleComputador {

    public static JDesktopPane jdprincipal;

    private CadastroComputadores cadcomputador;

    public ControleComputador(CadastroComputadores frame1) {
        this.cadcomputador = cadcomputador;
    }

    public ControleComputador(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
    }

    public void CadastroComp(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

}
