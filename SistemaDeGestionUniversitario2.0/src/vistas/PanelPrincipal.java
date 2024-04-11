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
public class PanelPrincipal extends javax.swing.JFrame {

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
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        controlP = new ControladorPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlA = new ControladorAdministrador(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlE = new ControladorEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlD = new ControladorDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlUA = new ControladorAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlAL = new ControladorAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlVE = new ControlVentanaEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlVD = new ControlVentanaDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlVA = new ControlVentanaAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlVAL = new ControlVentanaAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlTE = new ControlTablaEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlTD = new ControlTablaDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlTA = new ControlTablaAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        controlTAL = new ControlTablaAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelA = new PanelAdministrador(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIE = new PanelIngresarEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelID = new PanelIngresarDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIA = new PanelIngresarAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
        panelIAL = new PanelIngresarAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, ventanaE, ventanaD, ventanaA, ventanaAL);
        ventanaE = new VentanaUsEstudiante(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaD, ventanaA, ventanaAL);
        ventanaD = new VentanaUsDocente(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaA, ventanaAL);
        ventanaA = new VentanaUsAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaAL);
        ventanaAL = new VentanaUsAdminLab(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA);
    }

    public PanelPrincipal(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL,
            PanelAdministrador panelA, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID,
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
        this.panelA = panelA;
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

        jPasswordField1 = new javax.swing.JPasswordField();
        lblSistemaDeGestionUniversitario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSistemaDeGestionUniversitario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSistemaDeGestionUniversitario.setText("Sistema de gestion universitario");
        getContentPane().add(lblSistemaDeGestionUniversitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 30, 260, 31));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 147, 80, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 100, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 181, 80, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 147, 100, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 229, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        if ("".equals(usuario) && "".equals(contraseña)) {
            PanelAdministrador panelAdministrador = new PanelAdministrador(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, this, panelIE, panelID, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL);
            panelAdministrador.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblSistemaDeGestionUniversitario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
