/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlTablaAdminLab;
import controladores.ControlTablaAdministrativo;
import controladores.ControlTablaDocente;
import controladores.ControlTablaEstudiante;
import controladores.ControlVentanaAdminLab;
import controladores.ControlVentanaAdministrativo;
import controladores.ControlVentanaDocente;
import controladores.ControlVentanaEstudiante;
import controladores.ControladorAdminLab;
import controladores.ControladorAdministrador;
import controladores.ControladorAdministrativo;
import controladores.ControladorDocente;
import controladores.ControladorEstudiante;
import controladores.ControladorPrincipal;

/**
 *
 * @author JORGE
 */
public class PanelAdministrador extends javax.swing.JFrame {

    ControladorPrincipal controlP;
    ControladorAdministrador controlA;
    ControladorEstudiante controlE;
    ControladorDocente controlD;
    ControladorAdministrativo controlUA;
    ControladorAdminLab controlAL;
    ControlVentanaEstudiante controlVE;
    ControlVentanaDocente controlVD;
    ControlVentanaAdministrativo controlVA;
    ControlVentanaAdminLab controlVAL;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    PanelPrincipal panelP;    
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;

    /**
     * Creates new form PanelAdministardor
     */
    public PanelAdministrador(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL,
            PanelPrincipal panelP, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID,
            PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL, VentanaUsEstudiante ventanaE,
            VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL) {
        initComponents();
        setLocationRelativeTo(this);
        this.controlP = controlP;
        this.controlA = controlA;
        this.controlE = controlE;
        this.controlD = controlD;
        this.controlUA = controlUA;
        this.controlAL = controlAL;
        this.controlVE = controlVE;
        this.controlVD = controlVD;
        this.controlVA = controlVA;
        this.controlVAL = controlVAL;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.panelP = panelP;        
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaE = ventanaE;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        lblAdministrador = new javax.swing.JLabel();
        btnIngresarEstudiante = new javax.swing.JButton();
        btnIngresarDocente = new javax.swing.JButton();
        btnIngresarAdministrativo = new javax.swing.JButton();
        btnIngresarAdminLab = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdministrador.setText("Administrador del sistema");
        getContentPane().add(lblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 33, 216, 26));

        btnIngresarEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar estudiante");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 108, 285, -1));

        btnIngresarDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarDocente.setText("Ingresar docente");
        btnIngresarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 163, 285, -1));

        btnIngresarAdministrativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdministrativo.setText("Ingresar administrativo");
        btnIngresarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdministrativoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 217, 285, -1));

        btnIngresarAdminLab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarAdminLab.setText("Ingresar adminLab");
        btnIngresarAdminLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdminLabActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 272, 285, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 40, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        // TODO add your handling code here:
        PanelIngresarEstudiante panelIE = new PanelIngresarEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, panelP, this, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnIngresarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDocenteActionPerformed
        // TODO add your handling code here:
        PanelIngresarDocente panelID = new PanelIngresarDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, panelP, this, panelIE, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelID.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarDocenteActionPerformed

    private void btnIngresarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdministrativoActionPerformed
        // TODO add your handling code here:
        PanelIngresarAdministrativo panelIA = new PanelIngresarAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, panelP, this, panelIE, panelID, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarAdministrativoActionPerformed

    private void btnIngresarAdminLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdminLabActionPerformed
        // TODO add your handling code here:
        PanelIngresarAdminLab panelIAL = new PanelIngresarAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, panelP, this, panelIE, panelID, panelIA, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarAdminLabActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarAdminLab;
    private javax.swing.JButton btnIngresarAdministrativo;
    private javax.swing.JButton btnIngresarDocente;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
