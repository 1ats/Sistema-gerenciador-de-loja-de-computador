package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import view.CadastroCliente;
import gerenciamento.dao.ClienteDAO;
import gerenciamento.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author aminathamiguel
 */
public class ControleCliente implements ActionListener {

    public static JDesktopPane jdprincipal;
    Cliente cli = new Cliente();
    ClienteDAO cliente = new ClienteDAO();
    int resposta = 0;

    private CadastroCliente cadcliente;

    public ControleCliente(CadastroCliente cadcliente) {
        this.cadcliente = cadcliente;
    }

    public void excluirActionPerformed(ActionEvent evt) {
        resposta = JOptionPane.showConfirmDialog(jdprincipal, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            cli.setCodCliente(resposta);
            cliente.Excluir(cli);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            cadcliente.dispose();
        }
        if ("cadastrar".equals(e.getActionCommand())) {
            cadcliente.add(cadcliente);
        }
    }

}
