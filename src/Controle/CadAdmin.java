package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroAdministrador;

public class CadAdmin implements ActionListener {

    private CadastroAdministrador cadadmin;

    public CadAdmin(CadastroAdministrador frame1) {
        this.cadadmin = cadadmin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("usuario".equalsIgnoreCase(e.getActionCommand()) || "cadastrarCliente".equalsIgnoreCase(e.getActionCommand())) {
            CadastroAdministrador usuario = new CadastroAdministrador();
            cadadmin.add(usuario);
            usuario.setVisible(true);

        }
    }

}