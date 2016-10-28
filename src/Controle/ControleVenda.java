
package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;
import view.ConsultarVenda;

/**
 *
 * @author aminathamiguel
 */
public class ControleVenda {
    public static JDesktopPane jdprincipal;
    
    private ConsultarVenda cadvenda;
    
    public  ControleVenda(ConsultarVenda frame1) {
        this.cadvenda = cadvenda;
    }
    
    public  ControleVenda(JDesktopPane jdprincial) {
        ControleVenda.jdprincipal = jdprincial;
    }

    public void CadastroVen(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
    
}
