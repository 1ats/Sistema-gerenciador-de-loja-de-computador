
package Controle;

import static Controle.ControleAdministrador.jdprincipal;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;

/**
 *
 * @author aminathamiguel
 */
public class ControleCliente {

    public static JDesktopPane jdprincipal;

    private CadastroCliente cadcliente;

    public ControleCliente(CadastroCliente cadcliente) {
        this.cadcliente = cadcliente;
    }

    public ControleCliente(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
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
        if ("dia".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente dia = new CadastroCliente();
            cadcliente.add(dia);
            dia.setVisible(true);
        }if ("mes".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente mes = new CadastroCliente();
            cadcliente.add(mes);
            mes.setVisible(true);
        }if ("ano".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente ano = new CadastroCliente();
            cadcliente.add(ano);
            ano.setVisible(true);
        }
        if ("sexo".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente sexo = new CadastroCliente();
            cadcliente.add(sexo);
            sexo.setVisible(true);
        }if ("estadoCivil".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente estadocivil = new CadastroCliente();
            cadcliente.add(estadocivil);
            estadocivil.setVisible(true);
        }
    }
}


