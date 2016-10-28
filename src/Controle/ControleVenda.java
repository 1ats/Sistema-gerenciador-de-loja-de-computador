package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.Venda;

/**
 *
 * @author aminathamiguel
 */
public class ControleVenda implements ActionListener {

    public static JDesktopPane jdprincipal;

    private Venda venda;

    public ControleVenda(Venda venda) {
        this.venda = venda;
    }

    public ControleVenda(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void Vendas(JInternalFrame jInternalFrame) {
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
            venda.add(clicod);
            clicod.setVisible(true);
        } else {
            Venda prod = new Venda();
            venda.add(prod);
            prod.setVisible(true);
        }
    }
}
