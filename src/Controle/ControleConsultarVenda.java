package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;
import view.ConsultarVenda;
import view.Venda;

/**
 *
 * @author aminathamiguel
 */
public class ControleConsultarVenda implements ActionListener {

    public static JDesktopPane jdprincipal;
    private ConsultarVenda cvenda;

    public ControleConsultarVenda(ConsultarVenda cvenda) {
        this.cvenda = cvenda;
    }

    public ControleConsultarVenda(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("clienteCodigo".equalsIgnoreCase(e.getActionCommand())) {
            Venda clicod = new Venda();
            cvenda.add(clicod);
            clicod.setVisible(true);
        } else {
            Venda prod = new Venda();
            cvenda.add(prod);
            prod.setVisible(true);
        }
    }
}
