package Formularios;
import Codigos.RegistroTransacciones;
import Interfaces.IRegistrable;
import javax.swing.table.DefaultTableModel;

public class VerRegistros extends javax.swing.JFrame {
    private MenuBibliotecario menuBibliotecario;
    DefaultTableModel model = new DefaultTableModel();
    
    private void mostrarCabecera(){
        model.addColumn("ID");
        model.addColumn("Libro");
        model.addColumn("Nombre Completo");
        model.addColumn("DNI");
        model.addColumn("Telefono");
        model.addColumn("Fecha Prestamo");
        model.addColumn("Fecha Devolucion");
        tblSalida.setModel(model);
    }
    public VerRegistros() {
        initComponents();
        mostrarCabecera();
    }
    public void setMenuBibliotecario(MenuBibliotecario menuBibliotecario) {
        this.menuBibliotecario = menuBibliotecario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarRegistros = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Ver transacciones");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 20, 300, 58);

        btnMostrarRegistros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostrarRegistros.setForeground(new java.awt.Color(204, 51, 0));
        btnMostrarRegistros.setText("Mostrar registros");
        btnMostrarRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarRegistros);
        btnMostrarRegistros.setBounds(150, 110, 170, 32);

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(204, 51, 0));
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);
        btnVolver.setBounds(630, 110, 90, 32);

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Libro", "Nombre Completo", "DNI", "Telefono", "Fecha Prestamo", "Fecha Devolucion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalida);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 840, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrosActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);//Eliminar las filas de la tabla
        for(RegistroTransacciones regis: IRegistrable.listaPrestamoLibro){
            model.addRow(new Object[]{regis.getIdRegistro(),regis.getLibro().getTitulo(),
                regis.getNombreCompletoUsuario(),regis.getDniUsuario(),regis.getTelefonoUsuario(),
                regis.getFechaPrestamo(),regis.getFechaDevolucion()});
        }
    }//GEN-LAST:event_btnMostrarRegistrosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        // Mostrar la ventana de MenuBibliotecario
        menuBibliotecario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRegistros;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalida;
    // End of variables declaration//GEN-END:variables
}
