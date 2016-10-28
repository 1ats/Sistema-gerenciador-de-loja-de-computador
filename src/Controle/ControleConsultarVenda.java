
package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;
import view.ConsultarVenda;

/**
 *
 * @author aminathamiguel
 */
public class ControleConsultarVenda {
    public static JDesktopPane jdprincipal;
    
    private ConsultarVenda cvenda;
    
    public  ControleConsultarVenda(ConsultarVenda frame1) {
        this.cvenda = cvenda;
    }
    
    public  ControleConsultarVenda(JDesktopPane jdprincial) {
        ControleConsultarVenda.jdprincipal = jdprincial;
    }

    public void CadastroConsulVend(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
    
}
