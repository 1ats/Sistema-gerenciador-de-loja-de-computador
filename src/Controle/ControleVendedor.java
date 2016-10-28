package Controle;

import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroVendedor;

/**
 *
 * @author aminathamiguel
 */
public class ControleVendedor {

    public static JDesktopPane jdprincipal;

    private CadastroVendedor cadvendedor;

    public ControleVendedor(CadastroVendedor frame1) {
        this.cadvendedor = cadvendedor;
    }

    public ControleVendedor(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
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
public void actionPerformed(ActionEvent e) {
         if ("usuario".equalsIgnoreCase(e.getActionCommand())) {
            CadastroVendedor usuario = new CadastroVendedor();
            cadvendedor.add(usuario);
            usuario.setVisible(true);
        }
        if ("senha".equalsIgnoreCase(e.getActionCommand())){
            CadastroVendedor senha = new CadastroVendedor();
            cadvendedor.add(senha);
            senha.setVisible(true);  
        }
        if ("confirmarSenha".equalsIgnoreCase(e.getActionCommand())){
            CadastroVendedor confirmasenha = new CadastroVendedor();
            cadvendedor.add(confirmasenha);
            confirmasenha.setVisible(true);  
        }
        if ("nome".equalsIgnoreCase(e.getActionCommand())) {
            CadastroVendedor nome = new CadastroVendedor();
            cadvendedor.add(nome);
            nome.setVisible(true);
        }
        if ("cpf".equalsIgnoreCase(e.getActionCommand())){
            CadastroVendedor cpf = new CadastroVendedor();
            cadvendedor.add(cpf);
            cpf.setVisible(true);  
        }
        if ("rg".equalsIgnoreCase(e.getActionCommand())){
            CadastroVendedor rg = new CadastroVendedor();
            cadvendedor.add(rg);
            rg.setVisible(true);  
        }if ("telefone".equalsIgnoreCase(e.getActionCommand())) {
            CadastroVendedor telefone = new CadastroVendedor();
            cadvendedor.add(telefone);
            telefone.setVisible(true);
        }
    }
}
