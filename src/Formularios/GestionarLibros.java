package Formularios;

import Codigos.Biblioteca;
import Codigos.LibroDisponible;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionarLibros extends javax.swing.JFrame {
    private MenuBibliotecario menuBibliotecario;
    DefaultTableModel model = new DefaultTableModel();
    
    public void setMenuBibliotecario(MenuBibliotecario menuBibliotecario){
        this.menuBibliotecario = menuBibliotecario;
    }
    private void mostrarCabecera(){
        model.addColumn("ID");
        model.addColumn("Titulo");
        model.addColumn("Año");
        model.addColumn("Autor");
        model.addColumn("ISBN");
        model.addColumn("Editorial");
        model.addColumn("Copias");
        tblSalida.setModel(model);
    }
    
    public GestionarLibros() {
        initComponents();
        mostrarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarLibros = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Gestion de libros");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 30, 290, 58);

        btnMostrarLibros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMostrarLibros.setForeground(new java.awt.Color(204, 51, 0));
        btnMostrarLibros.setText("Mostrar libros");
        btnMostrarLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarLibros);
        btnMostrarLibros.setBounds(110, 120, 150, 32);

        btnEliminarLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarLibro.setForeground(new java.awt.Color(204, 51, 0));
        btnEliminarLibro.setText("Eliminar libro");
        btnEliminarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarLibro);
        btnEliminarLibro.setBounds(420, 120, 150, 32);

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Año", "Autor", "ISBN", "Editorial", "Copias"
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
        jScrollPane1.setBounds(30, 220, 940, 350);

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
        btnVolver.setBounds(740, 120, 150, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblSalida.getSelectedRow();
        if (filaSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una fila del registro");
        }else{
            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Esta seguro que desea eliminar el libro? Esta accion es irreversible",
                    "Confimar eliminacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if(confirmacion == JOptionPane.YES_OPTION){
               Biblioteca.librosDisponibles.remove(filaSeleccionada);
                model.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "Libro eliminado"); 
            }
            
        }
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        for(LibroDisponible libro: Biblioteca.librosDisponibles){
            model.addRow(new Object[]{libro.getIdLibro(),libro.getTitulo(),
                libro.getAñoPublicacion(),libro.getAutor(),libro.getISBN(),
                libro.getEditorial(),libro.getCopias()});
        }
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalida;
    // End of variables declaration//GEN-END:variables
}
