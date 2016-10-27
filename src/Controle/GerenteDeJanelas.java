/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author aminathamiguel
 */
public class GerenteDeJanelas {
    
    private static JDesktopPane jdprincipal;
    
    public GerenteDeJanelas(JDesktopPane jdprincial){
        GerenteDeJanelas.jdprincipal = jdprincial;
    }
    
    public void CadastroAdministrador(JInternalFrame jInternalFrame){
        if(jInternalFrame.isVisible()){
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
            
        }else{
            jdprincipal.add(jInternalFrame);
        }
    }
    
}
