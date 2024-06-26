/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorPrincipal;

/**
 *
 * @author JORGE
 */
public class PanelIngresarDocente extends javax.swing.JFrame {

    ControladorPrincipal controladorPrincipal;

    /**
     * Creates new form IngresarDocente
     */
    public PanelIngresarDocente(ControladorPrincipal controladorPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorPrincipal =  controladorPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresarDocnte = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        lblBirdData = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtAsignatura = new javax.swing.JTextField();
        txtBirdData = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnAsignarDocente = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarDocnte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarDocnte.setText("Ingresar docente");
        getContentPane().add(lblIngresarDocnte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 143, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 64, 71, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 98, 71, -1));

        lblAsignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsignatura.setText("Asignatura:");
        getContentPane().add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 132, -1, -1));

        lblBirdData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBirdData.setText("Año de nacimiento:");
        getContentPane().add(lblBirdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 166, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 200, 83, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 64, 122, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 98, 122, -1));
        getContentPane().add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 132, 122, -1));
        getContentPane().add(txtBirdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 166, 122, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 200, 122, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 58, 35));

        btnAsignarDocente.setText("Asignar");
        getContentPane().add(btnAsignarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 234, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        panelPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        PanelAdministrador panelAdministrador = new PanelAdministrador(controladorPrincipal);
        panelAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(IngresarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IngresarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IngresarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IngresarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IngresarDocente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarDocente;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblBirdData;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresarDocnte;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBirdData;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
