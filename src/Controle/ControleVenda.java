/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

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

    public ControleVenda(Venda frame1) {
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
    
}
