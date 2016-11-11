package controle;

import Dominio.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaLogin;
import view.TelaPrincipal;



public class LoginC implements ActionListener {

    private TelaLogin frame1;

    public LoginC(TelaLogin frame1) {
        this.frame1 = frame1;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Login g = new Login();

        g.setUsuario(frame1.usuario.getText());
        g.setSenha(frame1.senha.getText());

        if ("acessar".equals(ae.getActionCommand())) {

            if ("adm".equals(frame1.usuario.getText()) && "1234".equals(frame1.senha.getText()) || "tuti".equals(frame1.usuario.getText()) && "1234".equals(frame1.senha.getText())) {
                JOptionPane.showMessageDialog(null, "Bem Vindo");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                frame1.usuario.add(frame1.usuario);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }
        }
    }
}

