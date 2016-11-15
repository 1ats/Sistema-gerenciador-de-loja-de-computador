
package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;

/**
 *
 * @author aminathamiguel
 */
public class ControleCliente implements ActionListener{

    public static JDesktopPane jdprincipal;

    private CadastroCliente cadcliente;

    public ControleCliente(CadastroCliente cadcliente) {
        this.cadcliente = cadcliente;
    }

    public ControleCliente(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void CadastroCl(JInternalFrame jInternalFrame) {
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
            cadcliente.limpar();
        }
        if("cancelar".equals(e.getActionCommand())){
            cadcliente.dispose();
        }
        // excluir excluir um cadastro 
        }
}


