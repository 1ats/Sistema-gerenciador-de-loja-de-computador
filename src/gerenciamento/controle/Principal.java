package gerenciamento.controle;

import gerenciamento.conexao.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroAdministrador;
import view.CadastroCliente;
import view.CadastroComputadores;
import view.Sobre;
import view.TelaPrincipal;

/**
 *
 * @author aminathamiguel
 */
public class Principal implements ActionListener {

    Conexao conecta = new Conexao();
    private TelaPrincipal frame1;

    public Principal(TelaPrincipal frame1) {

        conecta.conexao();
        this.frame1 = frame1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cadastrardministrador".equalsIgnoreCase(e.getActionCommand()) || "administradores".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador cadadmin = new CadastroAdministrador();
            frame1.jdprincipal.add(cadadmin);
            cadadmin.setVisible(true);
        }
        if ("cadastrarCliente".equalsIgnoreCase(e.getActionCommand()) || "clientes".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente cadcliente = new CadastroCliente();
            frame1.jdprincipal.add(cadcliente);
            cadcliente.setVisible(true);
        }
        if ("cadastrarComputadores".equalsIgnoreCase(e.getActionCommand()) || "computadores".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores cadcomputador = new CadastroComputadores();
            frame1.jdprincipal.add(cadcomputador);
            cadcomputador.setVisible(true);

        }
        if ("sobre".equalsIgnoreCase(e.getActionCommand())) {
            Sobre sobre = new Sobre();
            frame1.jdprincipal.add(sobre);
            sobre.setVisible(true);
        }
        /*if ("cadastroAdministrador".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador cadadmin = new CadastroAdministrador();
            frame1.jdprincipal.add(cadadmin);
            cadadmin.setVisible(true);

        }*/
    }
}
