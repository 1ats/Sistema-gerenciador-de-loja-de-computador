package Controle;

import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroComputadores;

/**
 *
 * @author aminathamiguel
 */
public class ControleComputador {

    public static JDesktopPane jdprincipal;

    private CadastroComputadores cadcomputador;

    public ControleComputador(CadastroComputadores cadcomputador) {
        this.cadcomputador = cadcomputador;
    }

    public ControleComputador(JDesktopPane jdprincial) {
        ControleCliente.jdprincipal = jdprincial;
    }

    public void CadastroComp(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if ("marca".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores marca = new CadastroComputadores();
            cadcomputador.add(marca);
            marca.setVisible(true);
        }
        if ("cor".equalsIgnoreCase(e.getActionCommand())){
            CadastroComputadores cor = new CadastroComputadores();
            cadcomputador.add(cor);
            cor.setVisible(true);  
        }
        if ("modelo".equalsIgnoreCase(e.getActionCommand())){
            CadastroComputadores modelo = new CadastroComputadores();
            cadcomputador.add(modelo);
            modelo.setVisible(true);  
        }if ("velocidade".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores velocidade = new CadastroComputadores();
            cadcomputador.add(velocidade);
            velocidade.setVisible(true);
        }
        if ("sistemaOperacional".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores sistemaop = new CadastroComputadores();
            cadcomputador.add(sistemaop);
            sistemaop.setVisible(true);
        }
        if ("cache".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores cache = new CadastroComputadores();
            cadcomputador.add(cache);
            cache.setVisible(true);
        }
        if ("memoria".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores memoria = new CadastroComputadores();
            cadcomputador.add(memoria);
            memoria.setVisible(true);
        }
        if ("garantiaFornecedor".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores garantia = new CadastroComputadores();
            cadcomputador.add(garantia);
            garantia.setVisible(true);
        }
    }
}


