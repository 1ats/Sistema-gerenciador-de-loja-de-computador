package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroComputadores;

/**
 *
 * @author aminathamiguel
 */
public class ControleComputador implements ActionListener {

    public static JDesktopPane jdprincipal;

    private CadastroComputadores cadcomputador;

    public ControleComputador(CadastroComputadores cadcomputador) {
        this.cadcomputador = cadcomputador;
    }

    public ControleComputador(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void CadastroComp(JInternalFrame jInternalFrame) {
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
            cadcomputador.limpar();
        }
        if("cancelar".equals(e.getActionCommand())){
            cadcomputador.dispose();
        }
        // excluir excluir um cadastro 
        }
}
