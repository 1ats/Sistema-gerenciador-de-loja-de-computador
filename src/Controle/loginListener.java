
package Controle;

import Visao.NossaTelaPrincipal;
import javax.swing.JOptionPane;
import Visao.Telalogin;

public class loginListener {
    
    private String jTextFieldUsuario;
     private String jPasswordFieldSenha;
     
     if (jTextFieldUsuario.getText().equals("tuti") && jPasswordFieldSenha.getText().equals("1234")){
           NossaTelaPrincipal tela = new NossaTelaPrincipal();
           tela.setVisible(true);
          // dispose();
           } else {
                JOptionPane.showMessageDialog(rootPane, "Senha ou Usuario invalidos");
            }
}
