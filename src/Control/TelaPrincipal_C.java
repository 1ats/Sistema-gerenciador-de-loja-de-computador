/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interface.TelaPrincipal;
import Interface.Cliente;
import Interface.Computadores;
import Interface.Administrador;
import Interface.REalizarVenda;
import Interface.AjudaSobre;
import Interface.SACmensagem;
import Interface.Consultar;
import Interface.Vendedor;
import Interface.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class TelaPrincipal_C implements ActionListener {

    private TelaPrincipal frame1;

    public TelaPrincipal_C(TelaPrincipal frame1) {
        this.frame1 = frame1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cliente".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            Cliente tela1 = new Cliente();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }

        if ("mensagem".equalsIgnoreCase(e.getActionCommand())) {
            SACmensagem tela1 = new SACmensagem();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }
        if ("computador".equalsIgnoreCase(e.getActionCommand()) || "cadastrar_Produto".equalsIgnoreCase(e.getActionCommand())) {
            Computadores tela1 = new Computadores();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }

        if ("realizarVenda".equalsIgnoreCase(e.getActionCommand()) || "realizar_Venda".equalsIgnoreCase(e.getActionCommand())) {
            REalizarVenda tela1 = new REalizarVenda();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }

        if ("realizarVenda".equalsIgnoreCase(e.getActionCommand())) {
            REalizarVenda tela1 = new REalizarVenda();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }
        if ("consultar".equalsIgnoreCase(e.getActionCommand())) {
            Consultar tela1 = new Consultar();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);
        }

        if ("vendedorr".equalsIgnoreCase(e.getActionCommand())) {
            Vendedor tela1 = new Vendedor();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);
        }

        if ("sobre".equalsIgnoreCase(e.getActionCommand())) {
            AjudaSobre tela1 = new AjudaSobre();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);
        }
        if ("administrador".equalsIgnoreCase(e.getActionCommand())) {
            Administrador tela1 = new Administrador();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);

        }

        if ("sac".equalsIgnoreCase(e.getActionCommand()) || "saaC".equalsIgnoreCase(e.getActionCommand())) {
            SACmensagem tela1 = new SACmensagem();
            frame1.jDesktopPane1.add(tela1);
            tela1.setVisible(true);
        }

    }
}
