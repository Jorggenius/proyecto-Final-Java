
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdministradorSistema = new javax.swing.JLabel();
        btnIngresarEstudiante = new javax.swing.JButton();
        btnIngresarDocente = new javax.swing.JButton();
        btnAdministradorLab = new javax.swing.JButton();
        btnIngresarAdministrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdministradorSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdministradorSistema.setText("Administrador del sistema");
        getContentPane().add(lblAdministradorSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 25, -1, 27));

        btnIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar estudiante");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 195, -1));

        btnIngresarDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarDocente.setText("Ingresar Docente");
        getContentPane().add(btnIngresarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 109, 195, -1));

        btnAdministradorLab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdministradorLab.setText("Ingresar administrador Lab");
        getContentPane().add(btnAdministradorLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 148, -1, -1));

        btnIngresarAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdministrador.setText("Ingresar Administrador");
        getContentPane().add(btnIngresarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 187, 195, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        PanelIngresarEstudiante panelIngresarEstudiante = new PanelIngresarEstudiante(controladorPrincipal);
        panelIngresarEstudiante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

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
    private javax.swing.JButton btnAdministradorLab;
    private javax.swing.JButton btnIngresarAdministrador;
    private javax.swing.JButton btnIngresarDocente;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdministradorSistema;
    // End of variables declaration//GEN-END:variables
}
