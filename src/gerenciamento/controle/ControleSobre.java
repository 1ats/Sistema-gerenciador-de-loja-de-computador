package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import view.Sobre;

/**
 *
 * @author aminathamiguel
 */
public class ControleSobre implements ActionListener {

    public static JDesktopPane jdprincipal;

    private Sobre sobreinfo;

    public ControleSobre(Sobre sobreinfo1) {
        this.sobreinfo = sobreinfo;
    }
    public ControleSobre(JDesktopPane jdprincial) {
        ControleSobre.jdprincipal = jdprincial;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("sobre".equalsIgnoreCase(e.getActionCommand())) {
            Sobre s = new Sobre();
            s.setVisible(true);

        }

    }
}
