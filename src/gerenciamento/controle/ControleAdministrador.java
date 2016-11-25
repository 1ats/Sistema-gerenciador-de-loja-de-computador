package gerenciamento.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import view.CadastroAdministrador;

public class ControleAdministrador implements ActionListener {
     /*private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JPasswordField senha;
    public javax.swing.JComboBox<String> sexo;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField usuario;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField confirmarSenha;
    private javax.swing.JTextField cpf;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> estadoCivil;*/

    public static JDesktopPane jdprincipal;
    private CadastroAdministrador cadadmin;

    public ControleAdministrador(CadastroAdministrador cadadmin) {
        this.cadadmin = cadadmin;
    }

    public ControleAdministrador(JDesktopPane jdprincial) {
        this.jdprincipal = jdprincial;
    }

    public void CadastroAdm(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();

        } else {
            jdprincipal.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if("excluir".equals(e.getActionCommand())){  //limpa
            cadadmin.limpar();
        }
        if("cancelar".equals(e.getActionCommand())){
            cadadmin.dispose();
        }
        // excluir excluir um cadastro 
        }
   /* public void cancelar(){
        usuario.setText("");
        senha.setText("");
        confirmarSenha.setText("");
        nome.setText("");
        cpf.setText("");
        rg.setText("");
        telefone.setText("");
        dia.setActionCommand("1");
        mes.setActionCommand("Janeiro");
        ano.setActionCommand("1900");
        sexo.setActionCommand("Masculino");
    }*/

}
