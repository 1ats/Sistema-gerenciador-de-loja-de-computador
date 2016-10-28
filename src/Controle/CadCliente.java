/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import static Controle.CadAdmin.jdprincipal;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroCliente;

/**
 *
 * @author aminathamiguel
 */
public class CadCliente {
    
    public static JDesktopPane jdprincipal;
    
    private CadastroCliente cadcliente;
    
    public  CadCliente(CadastroCliente frame1) {
        this.cadcliente = cadcliente;
    }
    
    public  CadCliente(JDesktopPane jdprincial) {
        CadCliente.jdprincipal = jdprincial;
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
    
}
