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

    private ControladorPrincipal controladorPrincipal;

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
        btnIngresarDocente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdministradorSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdministradorSistema.setText("Administrador del sistema");
        getContentPane().add(lblAdministradorSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 22, 216, -1));

        btnIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar estudiante");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, 220, -1));

        btnIngresarDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarDocente.setText("Ingresar docente");
        btnIngresarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        // TODO add your handling code here:
        PanelIngresarEstudiante panelIngresarEstudiante = new PanelIngresarEstudiante(controladorPrincipal);
        panelIngresarEstudiante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnIngresarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDocenteActionPerformed
        // TODO add your handling code here:
         PanelIngresarDocente panelIngresarDocente = new PanelIngresarDocente(controladorPrincipal);
         panelIngresarDocente.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnIngresarDocenteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarDocente;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdministradorSistema;
    // End of variables declaration//GEN-END:variables
}
