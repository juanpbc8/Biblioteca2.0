package Formularios;

public class MenuBibliotecario extends javax.swing.JFrame {
    public MenuBibliotecario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        libros = new javax.swing.JPanel();
        btnRegistrarLibro = new javax.swing.JButton();
        btnGestionarLibros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        prestamos = new javax.swing.JPanel();
        btnRealizarPrestamo = new javax.swing.JButton();
        btnHistorialPrestamos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        usuarios = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnGestionarUsuario = new javax.swing.JButton();
        btnVerSanciones = new javax.swing.JButton();
        btnUsuarioNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setText("Menú del bibliotecario");

        libros.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarLibro.setBackground(new java.awt.Color(204, 102, 0));
        btnRegistrarLibro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarLibro.setText("Registrar Libros");
        btnRegistrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        btnGestionarLibros.setBackground(new java.awt.Color(204, 102, 0));
        btnGestionarLibros.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGestionarLibros.setText("Gestionar libros");
        btnGestionarLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarLibrosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Libros");

        javax.swing.GroupLayout librosLayout = new javax.swing.GroupLayout(libros);
        libros.setLayout(librosLayout);
        librosLayout.setHorizontalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosLayout.createSequentialGroup()
                .addGroup(librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(librosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGestionarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(librosLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        librosLayout.setVerticalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, librosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(btnRegistrarLibro)
                .addGap(18, 18, 18)
                .addComponent(btnGestionarLibros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prestamos.setBackground(new java.awt.Color(255, 255, 255));

        btnRealizarPrestamo.setBackground(new java.awt.Color(204, 102, 0));
        btnRealizarPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRealizarPrestamo.setText("Realizar Prestamo");
        btnRealizarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });

        btnHistorialPrestamos.setBackground(new java.awt.Color(204, 102, 0));
        btnHistorialPrestamos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHistorialPrestamos.setText("Historial Prestamos");
        btnHistorialPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorialPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialPrestamosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Prestamos");

        javax.swing.GroupLayout prestamosLayout = new javax.swing.GroupLayout(prestamos);
        prestamos.setLayout(prestamosLayout);
        prestamosLayout.setHorizontalGroup(
            prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosLayout.createSequentialGroup()
                .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestamosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prestamosLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4))
                            .addGroup(prestamosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnHistorialPrestamos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        prestamosLayout.setVerticalGroup(
            prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(btnRealizarPrestamo)
                .addGap(18, 18, 18)
                .addComponent(btnHistorialPrestamos)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        usuarios.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Usuarios");

        btnGestionarUsuario.setBackground(new java.awt.Color(204, 102, 0));
        btnGestionarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGestionarUsuario.setText("Gestionar Usuario");
        btnGestionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuarioActionPerformed(evt);
            }
        });

        btnVerSanciones.setBackground(new java.awt.Color(204, 102, 0));
        btnVerSanciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVerSanciones.setText("Ver Sanciones");
        btnVerSanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerSanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSancionesActionPerformed(evt);
            }
        });

        btnUsuarioNuevo.setBackground(new java.awt.Color(204, 102, 0));
        btnUsuarioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUsuarioNuevo.setText("Usuario nuevo");
        btnUsuarioNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usuariosLayout = new javax.swing.GroupLayout(usuarios);
        usuarios.setLayout(usuariosLayout);
        usuariosLayout.setHorizontalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usuariosLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerSanciones, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        usuariosLayout.setVerticalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(btnGestionarUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnVerSanciones)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarioNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        // TODO add your handling code here:
        RegistrarLibros registrarLibro = new RegistrarLibros();
        registrarLibro.setMenuBibliotecario(this);
        registrarLibro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
        // TODO add your handling code here:
        RealizarPrestamo prestamo = new RealizarPrestamo();
        prestamo.setMenuBibliotecario(this);
        prestamo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    private void btnHistorialPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialPrestamosActionPerformed
        // TODO add your handling code here:
        VerRegistros registros = new VerRegistros();
        registros.setMenuBibliotecario(this);
        registros.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_btnHistorialPrestamosActionPerformed

    private void btnGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarUsuarioActionPerformed

    private void btnVerSancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSancionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSancionesActionPerformed

    private void btnGestionarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarLibrosActionPerformed
        // TODO add your handling code here:
        GestionarLibros mostrarLibros = new GestionarLibros();
        mostrarLibros.setMenuBibliotecario(this);
        mostrarLibros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGestionarLibrosActionPerformed

    private void btnUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioNuevoActionPerformed
        // TODO add your handling code here:
        RegistrarUsuario regisUsu = new RegistrarUsuario();
        regisUsu.setMenuBibliotecario(this);
        regisUsu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUsuarioNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBibliotecario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBibliotecario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionarLibros;
    private javax.swing.JButton btnGestionarUsuario;
    private javax.swing.JButton btnHistorialPrestamos;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JButton btnUsuarioNuevo;
    private javax.swing.JButton btnVerSanciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel libros;
    private javax.swing.JPanel prestamos;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
