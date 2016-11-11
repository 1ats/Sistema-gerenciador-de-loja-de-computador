package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.SACMensagem;
import view.Sobre;

/**
 *
 * @author aminathamiguel
 */
public class ControleSobre implements ActionListener {

    public static JDesktopPane jdprincipal;

    private Sobre sobreinfo;

    public ControleSobre(SACMensagem sobreinfo1) {
        this.sobreinfo = sobreinfo;
    }

    public ControleSobre(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("sobre".equalsIgnoreCase(e.getActionCommand())) {
            Sobre s = new Sobre();
            s.setVisible(true);

        }

    }
}
