package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroVendedor;

/**
 *
 * @author aminathamiguel
 */
public class ControleVendedor implements ActionListener {

    public static JDesktopPane jdprincipal;
    private CadastroVendedor cadvendedor;

    public ControleVendedor(CadastroVendedor cadvendedor) {
        this.cadvendedor = cadvendedor;
    }

    public ControleVendedor(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
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

    @Override
    public void actionPerformed(ActionEvent e) {
       if("excluir".equals(e.getActionCommand())){  //limpa
            cadvendedor.limpar();
        }
        if("cancelar".equals(e.getActionCommand())){
            cadvendedor.dispose();
        }
        // excluir excluir um cadastro 
        }
}
