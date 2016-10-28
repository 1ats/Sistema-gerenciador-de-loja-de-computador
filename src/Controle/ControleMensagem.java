package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.SACMensagem;

/**
 *
 * @author aminathamiguel
 */
public class ControleMensagem implements ActionListener {

    public static JDesktopPane jdprincipal;

    private SACMensagem smensagem;

    public ControleMensagem(SACMensagem smensagem) {
        this.smensagem = smensagem;
    }

    public ControleMensagem(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cliente".equalsIgnoreCase(e.getActionCommand())) {
            SACMensagem cliente = new SACMensagem();
            smensagem.add(cliente);
            cliente.setVisible(true);
        } else {
            SACMensagem mensagem = new SACMensagem();
            smensagem.add(mensagem);
            mensagem.setVisible(true);
        }
    }
}
