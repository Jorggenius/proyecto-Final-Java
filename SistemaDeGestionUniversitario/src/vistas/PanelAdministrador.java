/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author JORGE
 */
public class PanelAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form PanelAdministrador
     */
    public PanelAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAdministrador = new javax.swing.JPanel();
        lblAdmiSystem = new javax.swing.JLabel();
        btnIngresarEstudiante = new javax.swing.JButton();
        btnIngresarDocente = new javax.swing.JButton();
        btnIngresarAdmLab = new javax.swing.JButton();
        btnIngresarAdmi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdmiSystem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdmiSystem.setText("Administrador del sistema");
        PanelAdministrador.add(lblAdmiSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 230, 30));

        btnIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar estudiante");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 300, -1));

        btnIngresarDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarDocente.setText("Ingresar docente");
        btnIngresarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDocenteActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnIngresarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 300, -1));

        btnIngresarAdmLab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdmLab.setText("Ingresar administrador lab");
        btnIngresarAdmLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdmLabActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnIngresarAdmLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, -1));

        btnIngresarAdmi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdmi.setText("Ingresar administrativo");
        btnIngresarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdmiActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnIngresarAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fongo.png"))); // NOI18N
        PanelAdministrador.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAgregarEstudiante().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnIngresarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDocenteActionPerformed
        // TODO add your handling code here:
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAgregarDocente().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarDocenteActionPerformed

    private void btnIngresarAdmLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdmLabActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAgregarAdminLab().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarAdmLabActionPerformed

    private void btnIngresarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdmiActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAgregarAdministrativo().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarAdmiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdministrador;
    private javax.swing.JButton btnIngresarAdmLab;
    private javax.swing.JButton btnIngresarAdmi;
    private javax.swing.JButton btnIngresarDocente;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdmiSystem;
    // End of variables declaration//GEN-END:variables
}
