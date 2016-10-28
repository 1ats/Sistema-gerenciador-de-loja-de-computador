
package Controle;

import static Controle.ControleAdministrador.jdprincipal;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;

/**
 *
 * @author aminathamiguel
 */
public class ControleCliente {

    public static JDesktopPane jdprincipal;

    private CadastroCliente cadcliente;

    public ControleCliente(CadastroCliente frame1) {
        this.cadcliente = cadcliente;
    }

    public ControleCliente(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
    }

    public void CadastroCl(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

}
