package vistas;

import controladores.ControladorPrincipal;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class PanelIngresarEstudiante extends javax.swing.JFrame {

    ControladorPrincipal controladorPrincipal;

    public PanelIngresarEstudiante(ControladorPrincipal controladorPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorPrincipal = controladorPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresarEstudiante = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarEstudiante.setText("Ingresar Estudiante");
        getContentPane().add(lblIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 26, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 69, 118, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 103, 118, -1));

        lblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 137, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 171, 118, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 69, 160, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 103, 162, -1));
        getContentPane().add(txtBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 137, 162, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 171, 162, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 205, -1, -1));

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 234, -1, -1));

        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 205, -1, -1));

        btnBorrar.setText("Borrar");
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 234, -1, -1));

        btnTable.setText("Table");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });
        getContentPane().add(btnTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 205, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 63, 35));

        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        BtnInicio.setBorderPainted(false);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, 40, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        int birthDate = Integer.parseInt(txtBirthDate.getText());
        String contraseña = txtContraseña.getText();
        Estudiante estudiante = new Estudiante(nombre, id, birthDate, contraseña);
        controladorPrincipal.agregarEstudiante(estudiante);
        limpiarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
      Table table = new Table(controladorPrincipal);
      table.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnTableActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelPrincipal = new PanelPrincipal(controladorPrincipal);
        panelPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnInicioActionPerformed

    public void limpiarCampos(){
        txtNombre.setText("");
        txtId.setText("");
        txtBirthDate.setText("");
        txtContraseña.setText("");
    }
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IngresarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IngresarEstudiante().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresarEstudiante;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
