package Control;

import java.awt.event.ActionListener;
import gets_Sets.TelaLogin_GS;
import Interface.TelaLogin;
import Interface.TelaPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class TelaLogin_C implements ActionListener {

    private TelaLogin frame1;

    public TelaLogin_C(TelaLogin frame1) {
        this.frame1 = frame1;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        TelaLogin_GS g = new TelaLogin_GS();

        g.setUsuario(frame1.Usuario.getText());
        g.setSenha(frame1.Senha.getText());

        if ("login".equals(ae.getActionCommand())) {

            if ("adm".equals(frame1.Usuario.getText()) && "1234".equals(frame1.Senha.getText())|| "tuti".equals(frame1.Usuario.getText()) && "1234".equals(frame1.Senha.getText()) ) {
                JOptionPane.showMessageDialog(null, "Bem Vindo");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
            }

        }

    }

}

