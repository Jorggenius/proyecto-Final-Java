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
public class PanelAdministrador extends javax.swing.JFrame {
ControladorPrincipal controladorPrincipal;
    /**
     * Creates new form PanelAdministrador
     */
    public PanelAdministrador(ControladorPrincipal controladorPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        this.controladorPrincipal = controladorPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdministradorSistema = new javax.swing.JLabel();
        btnIngresarEstudiante = new javax.swing.JButton();
        btnIngresarDoncente = new javax.swing.JButton();
        btnIngrsarAdmiLab = new javax.swing.JButton();
        btnIngresarAdministrador = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdministradorSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdministradorSistema.setText("Administrador del sistema");
        getContentPane().add(lblAdministradorSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 28));

        btnIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar estudiante");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 78, 216, -1));

        btnIngresarDoncente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarDoncente.setText("Ingresar docente");
        btnIngresarDoncente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDoncenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarDoncente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 117, 216, -1));

        btnIngrsarAdmiLab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngrsarAdmiLab.setText("Ingresar administrador Lab");
        btnIngrsarAdmiLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngrsarAdmiLabActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngrsarAdmiLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 156, 216, -1));

        btnIngresarAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdministrador.setText("Administrador");
        btnIngresarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 195, 216, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        // TODO add your handling code here:
        PanelIngresarEstudiante panelEstudiante = new PanelIngresarEstudiante(controladorPrincipal );
        panelEstudiante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnIngresarDoncenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDoncenteActionPerformed
        // TODO add your handling code here:
        PanelIngresarDocente panelDocente = new PanelIngresarDocente(controladorPrincipal);
        panelDocente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarDoncenteActionPerformed

    private void btnIngrsarAdmiLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngrsarAdmiLabActionPerformed
        // TODO add your handling code here:
        PanelIngresarAdminLab panelIngresarAdminLab = new PanelIngresarAdminLab();
        panelIngresarAdminLab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngrsarAdmiLabActionPerformed

    private void btnIngresarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdministradorActionPerformed
        // TODO add your handling code here:
       PanelIngresarAdministrador panelIngresarAdministrador = new PanelIngresarAdministrador();
       panelIngresarAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarAdministradorActionPerformed

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
//            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PanelAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarAdministrador;
    private javax.swing.JButton btnIngresarDoncente;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JButton btnIngrsarAdmiLab;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdministradorSistema;
    // End of variables declaration//GEN-END:variables
}
