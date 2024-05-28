package Formularios;

import Codigos.Biblioteca;
import Codigos.LibroDisponible;
import javax.swing.JOptionPane;

public class RegistrarLibros extends javax.swing.JFrame {
    private MenuBibliotecario menuBibliotecario;
    
    public RegistrarLibros() {
        initComponents();
    }
    public void setMenuBibliotecario(MenuBibliotecario menuBibliotecario) {
        this.menuBibliotecario = menuBibliotecario;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Derecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        copiasField = new javax.swing.JTextField();
        isbnField = new javax.swing.JTextField();
        editorialField = new javax.swing.JTextField();
        tituloField = new javax.swing.JTextField();
        autorField = new javax.swing.JTextField();
        borrarBtn = new javax.swing.JButton();
        registrarBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        añoField = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        Izquierda = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Derecha.setMinimumSize(new java.awt.Dimension(900, 701));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Copias:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Registrar Libro Nuevo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Titulo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("Autor:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("ISBN:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setText("Año de");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setText("Publicacion:");

        copiasField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        isbnField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        editorialField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tituloField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        autorField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        borrarBtn.setBackground(new java.awt.Color(204, 102, 0));
        borrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        borrarBtn.setText("Borrar Datos");
        borrarBtn.setToolTipText("");
        borrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });

        registrarBtn.setBackground(new java.awt.Color(204, 102, 0));
        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registrarBtn.setText("Registrar Libro");
        registrarBtn.setToolTipText("");
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setText("Editorial:");

        añoField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnVolver.setBackground(new java.awt.Color(204, 102, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(108, 108, 108)
                        .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(111, 111, 111)
                        .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(122, 122, 122)
                        .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(72, 72, 72)
                        .addComponent(editorialField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addComponent(añoField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98)
                        .addComponent(copiasField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(registrarBtn)
                        .addGap(34, 34, 34)
                        .addComponent(borrarBtn))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnVolver)))
                .addGap(431, 431, 431))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(editorialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(añoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(copiasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn)
                    .addComponent(borrarBtn))
                .addGap(41, 41, 41)
                .addComponent(btnVolver)
                .addGap(50, 50, 50))
        );

        Izquierda.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Derecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        // TODO add your handling code here:
        tituloField.setText(null);
        autorField.setText(null);
        isbnField.setText(null);
        editorialField.setText(null);
        añoField.setText(null);
        copiasField.setText(null);
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        // TODO add your handling code here:

        if(tituloField.getText().isBlank()||autorField.getText().isBlank()||
                añoField.getText().isBlank()||isbnField.getText().isBlank()
            ||editorialField.getText().isBlank()||copiasField.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Faltan datos");
        }else{
            String titulo = tituloField.getText();
            String autor = autorField.getText();
            String isbn = isbnField.getText();
            String editorial = editorialField.getText();
            int añoPublicacion = Integer.parseInt(añoField.getText());
            int copias = Integer.parseInt(copiasField.getText());
            //Al registrar se guarda en un ArrayList los datos
            Biblioteca.librosDisponibles.add(new LibroDisponible(añoPublicacion, titulo,
                    autor, isbn, editorial, copias));
            JOptionPane.showMessageDialog(null, "Libro registrado a la biblioteca correctamente");
        }  
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        // Mostrar la ventana de MenuBibliotecario
        menuBibliotecario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JTextField autorField;
    private javax.swing.JTextField añoField;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField copiasField;
    private javax.swing.JTextField editorialField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTextField tituloField;
    // End of variables declaration//GEN-END:variables

}
