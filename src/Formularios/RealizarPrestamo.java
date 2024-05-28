package Formularios;

import Codigos.Biblioteca;
import Codigos.LibroDisponible;
import Codigos.RegistroTransacciones;
import Codigos.Usuario;
import Interfaces.IRegistrable;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RealizarPrestamo extends javax.swing.JFrame {
    private MenuBibliotecario menuBibliotecario;
    DefaultTableModel model = new DefaultTableModel();
    
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
    public void setMenuBibliotecario(MenuBibliotecario menuBibliotecario){
        this.menuBibliotecario = menuBibliotecario;
    }
    public RealizarPrestamo() {
        initComponents();
        mostrarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fldTiempoDias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fldDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarLibros = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnBorrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        fldTiempoDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldTiempoDiasActionPerformed(evt);
            }
        });
        jPanel1.add(fldTiempoDias);
        fldTiempoDias.setBounds(70, 220, 305, 37);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Tiempo (en dias)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 190, 128, 27);

        fldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldDniActionPerformed(evt);
            }
        });
        jPanel1.add(fldDni);
        fldDni.setBounds(70, 130, 305, 34);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("DNI de usuario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 90, 104, 28);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Prestamo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 20, 172, 58);

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
        btnMostrarLibros.setBounds(540, 240, 150, 32);

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(204, 51, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(540, 90, 150, 32);

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
        btnVolver.setBounds(540, 190, 150, 32);

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
        ));
        jScrollPane1.setViewportView(tblSalida);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 310, 730, 250);

        btnBorrar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(204, 51, 0));
        btnBorrar1.setText("Borrar");
        btnBorrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1);
        btnBorrar1.setBounds(540, 140, 150, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldDniActionPerformed

    private void fldTiempoDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldTiempoDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldTiempoDiasActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblSalida.getSelectedRow();
        
        if(filaSeleccionada != -1 && !fldDni.getText().isBlank()){
            
            String dni = fldDni.getText();
            
            if(Biblioteca.existeUsuarioPorDni(dni)){
                int dias = Integer.parseInt(fldTiempoDias.getText());
                Usuario usu = Biblioteca.obtenerUsuarioPorDni(dni);
                LibroDisponible libro = Biblioteca.librosDisponibles.get(filaSeleccionada);
                String telefonoUsuario = usu.getTelefono();
                String fechaPrestamo = LocalDate.now().toString();
                String fechaDevolucion = RegistroTransacciones.calcularFechaDevolucion(dias);
                String nombreCompletoUsuario = usu.getNombreCompleto();
                
                RegistroTransacciones registro = new RegistroTransacciones(libro, nombreCompletoUsuario, dni,
                        telefonoUsuario,fechaPrestamo, fechaDevolucion);
                
                IRegistrable.listaPrestamoLibro.add(registro);
                JOptionPane.showMessageDialog(null, "¡Prestamo exitoso! "+
                                                    "Libro prestado a "+usu.getNombreCompleto().toUpperCase());
                
                libro.setCopias(libro.getCopias()-1);
            }else{
                JOptionPane.showMessageDialog(null, "No existe un usuario con el DNI correspondiente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un libro e ingrese el DNI");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);//Eliminar todas las filas de la tabla
        for(LibroDisponible libro: Biblioteca.librosDisponibles){
            model.addRow(new Object[]{libro.getIdLibro(),libro.getTitulo(),libro.getAñoPublicacion(),
                    libro.getAutor(),libro.getISBN(),libro.getEditorial(),libro.getCopias()});
        }
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        // Mostrar la ventana de MenuBibliotecario
        menuBibliotecario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        // TODO add your handling code here:
        fldDni.setText(null);
        fldTiempoDias.setText(null);
    }//GEN-LAST:event_btnBorrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField fldDni;
    private javax.swing.JTextField fldTiempoDias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalida;
    // End of variables declaration//GEN-END:variables
}
