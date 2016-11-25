package view;

import static Controle.ControleAdministrador.jdprincipal;
import controle.Principal;
import java.awt.Color;
import static java.awt.SystemColor.menu;

/**
 *
 * @author aminathamiguel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    CadastroAdministrador cadadmin;
    CadastroCliente cadcliente;
    CadastroVendedor cadvendedor;
    CadastroComputadores cadcomputador;
    ConsultarVenda cvenda;
    SACMensagem smensagem;
    Sobre sobre;
    Venda venda;
    // Creates new form NossaTelaPrincipal
    Principal listener = new Principal(this);

    public TelaPrincipal() {
        initComponents();
        /*cadadmin = new ControleAdministrador(jdprincipal);
         cadcliente = new ControleCliente(jdprincipal);
         cadcomputador = new ControleComputador(jdprincipal);
         cadvendedor = new ControleVendedor(jdprincipal);
         cvenda = new ControleConsultarVenda(jdprincipal);
         venda = new ControleVenda(jdprincipal);
         sobreinfo = new ControleSobre(jdprincipal);
         smensagem = new ControleMensagem(jdprincipal);
         */
        getContentPane().setBackground(Color.WHITE);  //YELLOW
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cadastrarCliente = new javax.swing.JButton();
        cadastrarProduto = new javax.swing.JButton();
        realizarVenda = new javax.swing.JButton();
        sac = new javax.swing.JButton();
        finalizarPrograma = new javax.swing.JButton();
        jdprincipal = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        jMenuItemFinalizarPrograma = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemComputadores = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        jMenuItemRealizar = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        menuSAC = new javax.swing.JMenu();
        jMenuItemMensagens = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Menu Rápido", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        cadastrarCliente.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });

        cadastrarProduto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cadastrarProduto.setText("Cadastrar Produto");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });

        realizarVenda.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        realizarVenda.setText("Realizar Venda");
        realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVendaActionPerformed(evt);
            }
        });

        sac.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        sac.setText("SAC");
        sac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacActionPerformed(evt);
            }
        });

        finalizarPrograma.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        finalizarPrograma.setText("Filanizar o Programa");
        finalizarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(realizarVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finalizarPrograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(realizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sac, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalizarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdprincipal))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jdprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        menu.setMaximumSize(new java.awt.Dimension(321, 32768));
        menu.setPreferredSize(new java.awt.Dimension(321, 22));

        menuUsuario.setText("Usuario");

        jMenuItemFinalizarPrograma.setText("Finalizar Programa");
        jMenuItemFinalizarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinalizarProgramaActionPerformed(evt);
            }
        });
        menuUsuario.add(jMenuItemFinalizarPrograma);

        menu.add(menuUsuario);

        menuCadastro.setText("Cadastro");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuItemCliente);

        jMenuItemComputadores.setText("Computadores");
        jMenuItemComputadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComputadoresActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuItemComputadores);

        jMenu1.setText("Funcionario ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Vendedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuCadastro.add(jMenu1);

        menu.add(menuCadastro);

        menuVenda.setText("Venda");

        jMenuItemRealizar.setText("Realizar");
        jMenuItemRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarActionPerformed(evt);
            }
        });
        menuVenda.add(jMenuItemRealizar);

        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarActionPerformed(evt);
            }
        });
        menuVenda.add(jMenuItemConsultar);

        menu.add(menuVenda);

        menuSAC.setText("SAC");

        jMenuItemMensagens.setText("Mensagens");
        jMenuItemMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMensagensActionPerformed(evt);
            }
        });
        menuSAC.add(jMenuItemMensagens);

        menu.add(menuSAC);

        menuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItemSobre);

        menu.add(menuAjuda);

        setJMenuBar(menu);

        setSize(new java.awt.Dimension(906, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        //cadcliente.CadastroCl(CadastroCliente.getInstancia());
        if (cadcliente == null) {
            cadcliente = new CadastroCliente();
            jdprincipal.add(cadcliente);;
        }
        cadcliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarActionPerformed
        // TODO add your handling code here:
        //cvenda.CadastroConsulVend(ConsultarVenda.getInstancia());
        if (cvenda == null) {
            cvenda = new ConsultarVenda();
            jdprincipal.add(cvenda);
        }
        cvenda.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarActionPerformed

    private void jMenuItemFinalizarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinalizarProgramaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemFinalizarProgramaActionPerformed

    private void jMenuItemComputadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComputadoresActionPerformed
        // TODO add your handling code here:
        //cadcomputador.CadastroComp(CadastroComputadores.getInstancia());
        if (cadcomputador == null) {
            cadcomputador = new CadastroComputadores();
            jdprincipal.add(cadcomputador);
        }
        cadcomputador.setVisible(true);
    }//GEN-LAST:event_jMenuItemComputadoresActionPerformed

    private void jMenuItemRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarActionPerformed
        // TODO add your handling code here:
       // venda.Vendas(Venda.getInstancia());
        if (venda == null) {
            venda = new Venda();
            jdprincipal.add(venda);
        }
        venda.setVisible(true);
    }//GEN-LAST:event_jMenuItemRealizarActionPerformed

    private void jMenuItemMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMensagensActionPerformed
        // TODO add your handling code here:
       // smensagem.SACMens(SACMensagem.getInstancia());
        if (smensagem == null) {
            smensagem = new SACMensagem();
            jdprincipal.add(smensagem);;
        }
        smensagem.setVisible(true);
    }//GEN-LAST:event_jMenuItemMensagensActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (cadadmin == null) {
            cadadmin = new CadastroAdministrador();
            jdprincipal.add(cadadmin);
        }
        cadadmin.setVisible(true);
        //cadadmin.CadastroAdm(CadastroAdministrador.getInstancia());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       if (cadvendedor == null) {
            cadvendedor = new CadastroVendedor();
            jdprincipal.add(cadvendedor);;
        }
        cadvendedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // TODO add your handling code here:
      //  sobreinfo.SobreProgram(Sobre.getInstancia());
        if (sobre == null) {
            sobre = new Sobre();
            jdprincipal.add(sobre);;
        }
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void finalizarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarProgramaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_finalizarProgramaActionPerformed

    private void sacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacActionPerformed
        // TODO add your handling code here:
        //smensagem.SACMens(SACMensagem.getInstancia());
        if (smensagem == null) {
            smensagem = new SACMensagem();
            jdprincipal.add(smensagem);;
        }
        smensagem.setVisible(true);
    }//GEN-LAST:event_sacActionPerformed

    private void realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVendaActionPerformed
        // TODO add your handling code here:
        //venda.Vendas(Venda.getInstancia());
        if (venda == null) {
            venda = new Venda();
            jdprincipal.add(venda);
        }
        venda.setVisible(true);
    }//GEN-LAST:event_realizarVendaActionPerformed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        // TODO add your handling code here:
        //cadcomputador.CadastroComp(CadastroComputadores.getInstancia());
        if (cadcomputador == null) {
            cadcomputador = new CadastroComputadores();
            jdprincipal.add(cadcomputador);
        }
        cadcomputador.setVisible(true);
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        //cadcliente.CadastroCl(CadastroCliente.getInstancia());
        if (cadcliente == null) {
            cadcliente = new CadastroCliente();
            jdprincipal.add(cadcliente);;
        }
        cadcliente.setVisible(true);
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        if (cadadmin == null) {
            cadadmin = new CadastroAdministrador();
            jdprincipal.add(cadadmin);
        }
        cadadmin.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarCliente;
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JButton finalizarPrograma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemComputadores;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFinalizarPrograma;
    private javax.swing.JMenuItem jMenuItemMensagens;
    private javax.swing.JMenuItem jMenuItemRealizar;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JDesktopPane jdprincipal;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuSAC;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JButton realizarVenda;
    private javax.swing.JButton sac;
    // End of variables declaration//GEN-END:variables
}
