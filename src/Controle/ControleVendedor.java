package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroVendedor;

/**
 *
 * @author aminathamiguel
 */
public class ControleVendedor {

    public static JDesktopPane jdprincipal;

    private CadastroVendedor cadvendedor;

    public ControleVendedor(CadastroVendedor frame1) {
        this.cadvendedor = cadvendedor;
    }

    public ControleVendedor(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
    }

    public void CadastroVended(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

}
