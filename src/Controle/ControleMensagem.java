
package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.SACMensagem;

/**
 *
 * @author aminathamiguel
 */
public class ControleMensagem {
    public static JDesktopPane jdprincipal;
    
    private SACMensagem  smensagem;
    
    public  ControleMensagem(SACMensagem frame1) {
        this.smensagem = smensagem;
    }
    
    public  ControleMensagem(JDesktopPane jdprincial) {
        ControleMensagem.jdprincipal = jdprincial;
    }

    public void SACMens(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
    
    
}
