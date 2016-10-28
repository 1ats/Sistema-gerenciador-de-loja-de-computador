package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.SACMensagem;
import view.Sobre;

/**
 *
 * @author aminathamiguel
 */
public class ControleSobre {

    public static JDesktopPane jdprincipal;

    private Sobre sobreinfo;

    public ControleSobre(SACMensagem frame1) {
        this.sobreinfo = sobreinfo;
    }

    public ControleSobre(JDesktopPane jdprincial) {
        ControleSobre.jdprincipal = jdprincial;
    }

    public void SobreProgram(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

}
