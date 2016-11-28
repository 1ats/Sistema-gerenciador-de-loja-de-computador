package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroComputadores;

/**
 *
 * @author aminathamiguel
*/
public class ControleComputador implements ActionListener {

    public static JDesktopPane jdprincipal;

    private CadastroComputadores cadcomputador;

    public ControleComputador(CadastroComputadores cadcomputador) {
        this.cadcomputador = cadcomputador;
    }

    public ControleComputador(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void actionPerformed(ActionEvent e) {
        if ("codigo".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores codigo = new CadastroComputadores();
            cadcomputador.add(codigo);
            codigo.setVisible(true);
        }
        if ("marca".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores marca = new CadastroComputadores();
            cadcomputador.add(marca);
            marca.setVisible(true);
        }
        if ("cor".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores cor = new CadastroComputadores();
            cadcomputador.add(cor);
            cor.setVisible(true);
        }
        if ("modelo".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores modelo = new CadastroComputadores();
            cadcomputador.add(modelo);
            modelo.setVisible(true);
        }
        if ("memoria".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores memoria = new CadastroComputadores();
            cadcomputador.add(memoria);
            memoria.setVisible(true);
        }
        if ("sistema".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores sistema = new CadastroComputadores();
            cadcomputador.add(sistema);
            sistema.setVisible(true);
        }
        if ("garantia".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores garantia = new CadastroComputadores();
            cadcomputador.add(garantia);
            garantia.setVisible(true);
        }
        if ("mes".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores mes = new CadastroComputadores();
            cadcomputador.add(mes);
            mes.setVisible(true);
        }
        if ("ano".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores ano = new CadastroComputadores();
            cadcomputador.add(ano);
            ano.setVisible(true);
        }
        if ("sexo".equalsIgnoreCase(e.getActionCommand())) {
            CadastroComputadores sexo = new CadastroComputadores();
            cadcomputador.add(sexo);
            sexo.setVisible(true);
        }
        /*if ("excluir".equals(e.getActionCommand())) {  //limpa
            cadcomputador.Excluir();
            
        }
        if ("cancelar".equals(e.getActionCommand())) {
            cadcomputador.dispose();
        }
        // excluir excluir um cadastro 
    }*/
   }
}
