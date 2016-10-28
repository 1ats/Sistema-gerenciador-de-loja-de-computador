/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.Venda;

/**
 *
 * @author aminathamiguel
 */
public class ControleVenda {
    
    public static JDesktopPane jdprincipal;

    private Venda venda;

    public ControleVenda(Venda venda) {
        this.venda = venda;
    }

    public ControleVenda(JDesktopPane jdprincial) {
        ControleVenda.jdprincipal = jdprincial;
    }

    public void Vendas(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if ("clienteCodigo".equalsIgnoreCase(e.getActionCommand())) {
            Venda clicod = new Venda();
            venda.add(clicod);
            clicod.setVisible(true);
        }
        if ("modoPagamento".equalsIgnoreCase(e.getActionCommand())){
            Venda modpag = new Venda();
            venda.add(modpag);
            modpag.setVisible(true);
        }
        else{
            Venda prod = new Venda();
            venda.add(prod);
            prod.setVisible(true);  
        }
    }
}
