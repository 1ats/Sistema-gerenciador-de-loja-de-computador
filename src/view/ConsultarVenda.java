
package view;

/**
 *
 * @author aminathamiguel
 */
public class ConsultarVenda extends javax.swing.JInternalFrame {
    
    private static ConsultarVenda consultarvenda;

    public static ConsultarVenda getInstancia() {
        if (consultarvenda == null) {
            consultarvenda = new ConsultarVenda();

        }
        return consultarvenda;
    }

    /**
     * Creates new form ConsultarVenda
     */
    public ConsultarVenda() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        consultarVenda = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Vendas");

        consultarVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computadores", "Quantidade total", "Cliente", "Vendedor", "Preço total"
            }
        ));
        jScrollPane1.setViewportView(consultarVenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable consultarVenda;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}