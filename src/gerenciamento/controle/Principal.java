package gerenciamento.controle;

import view.TelaPrincipal;
import view.CadastroCliente;
import view.CadastroComputadores;
import view.CadastroAdministrador;
import view.ConsultarVenda;
import view.Sobre;
import view.SACMensagem;
import view.Venda;
import view.CadastroVendedor;
import view.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aminathamiguel
 */
public class Principal implements ActionListener {

    private TelaPrincipal frame1;

    public Principal(TelaPrincipal frame1) {
        this.frame1 = frame1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cliente".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            CadastroCliente cadcli = new CadastroCliente();
            frame1.jdprincipal.add(cadcli);
            cadcli.setVisible(true);

        }

        if ("mensagem".equalsIgnoreCase(e.getActionCommand())) {
            SACMensagem sacmen = new SACMensagem();
            frame1.jdprincipal.add(sacmen);
            sacmen.setVisible(true);
        }
        if ("cadastroComputadores".equalsIgnoreCase(e.getActionCommand()) || "cadastrar_Produto".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores cadcomp = new CadastroComputadores();
            frame1.jdprincipal.add(cadcomp);
            cadcomp.setVisible(true);

        }

        if ("realizarVenda".equalsIgnoreCase(e.getActionCommand()) || "realizar_Venda".equalsIgnoreCase(e.getActionCommand())) {
            Venda v = new Venda();
            frame1.jdprincipal.add(v);
            v.setVisible(true);

        }

        if ("realizarVenda".equalsIgnoreCase(e.getActionCommand())) {
            Venda v = new Venda();
            frame1.jdprincipal.add(v);
            v.setVisible(false);

        }
        if ("consultarVenda".equalsIgnoreCase(e.getActionCommand())) {
            ConsultarVenda cvenda = new ConsultarVenda();
            frame1.jdprincipal.add(cvenda);
            cvenda.setVisible(true);
        }

        if ("cadastroVendedor".equalsIgnoreCase(e.getActionCommand())) {
            CadastroVendedor cadvend = new CadastroVendedor();
            frame1.jdprincipal.add(cadvend);
            cadvend.setVisible(true);
        }

        if ("sobre".equalsIgnoreCase(e.getActionCommand())) {
            Sobre s = new Sobre();
            frame1.jdprincipal.add(s);
            s.setVisible(true);
        }
        if ("cadastroAdministrador".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador cadadm = new CadastroAdministrador();
            frame1.jdprincipal.add(cadadm);
            cadadm.setVisible(true);

        }

        if ("sacMensagem".equalsIgnoreCase(e.getActionCommand()) || "saaC".equalsIgnoreCase(e.getActionCommand())) {
            SACMensagem sacmen = new SACMensagem();
            frame1.jdprincipal.add(sacmen);
            sacmen.setVisible(true);
        }
    }
}
