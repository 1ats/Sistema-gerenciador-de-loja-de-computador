/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ArquivoLog.Arquivo;
import controle.LoginC;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author aminathamiguel
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin1
     */
    private LoginC listener = new LoginC(this);

    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        acessar = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("Tela Login"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        Usuario.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuário:");
        getContentPane().add(Usuario);
        Usuario.setBounds(50, 30, 66, 21);

        Senha.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha:");
        getContentPane().add(Senha);
        Senha.setBounds(60, 80, 55, 21);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(140, 20, 230, 38);

        acessar.setText("Acessar");
        acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarActionPerformed(evt);
            }
        });
        getContentPane().add(acessar);
        acessar.setBounds(200, 130, 110, 23);

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha);
        senha.setBounds(140, 70, 230, 40);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Redes.jpg"))); // NOI18N
        getContentPane().add(imagem);
        imagem.setBounds(0, 0, 430, 170);

        setSize(new java.awt.Dimension(430, 191));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarActionPerformed
        // TODO add your handling code here:

        if (usuario.getText().equals("tuti") && senha.getText().equals("1234")) {
             try {
            Arquivo.escrever("tuti", "log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
            JOptionPane.showMessageDialog(null, "Bem Vindo");
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha Inválida");
        }
    }//GEN-LAST:event_acessarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton acessar;
    private javax.swing.JLabel imagem;
    public javax.swing.JPasswordField senha;
    public javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
