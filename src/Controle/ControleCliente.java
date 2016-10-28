
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
        if ("nome".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente nome = new CadastroCliente();
            cadcliente.add(nome);
            nome.setVisible(true);
        }
        if ("cpf".equalsIgnoreCase(e.getActionCommand())){
            CadastroCliente cpf = new CadastroCliente();
            cadcliente.add(cpf);
            cpf.setVisible(true);
        }
        if ("rg".equalsIgnoreCase(e.getActionCommand())){
            CadastroCliente rg = new CadastroCliente();
            cadcliente.add(rg);
            rg.setVisible(true);
        }if ("telefone".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente telefone = new CadastroCliente();
            cadcliente.add(telefone);
            telefone.setVisible(true);
        }
        // Falta data, sexo e estado civil
    }

}


