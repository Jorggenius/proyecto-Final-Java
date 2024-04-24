/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlTablaAdminLab;
import controladores.ControlTablaAdministrativo;
import controladores.ControlTablaDocente;
import controladores.ControlTablaEstudiante;
import controladores.ControlTablaUsuarioDocente;
import controladores.ControlTablaUsuarioEstudiante;
import controladores.ControlVentanaAdminLab;
import controladores.ControlVentanaAdministrativo;
import controladores.ControlVentanaCursos;
import controladores.ControlVentanaDocente;
import controladores.ControlVentanaEstudiante;
import controladores.ControlVentanaLaboratorios;
import controladores.ControladorAdminLab;
import controladores.ControladorAdministrador;
import controladores.ControladorAdministrativo;
import controladores.ControladorDocente;
import controladores.ControladorEstudiante;
import controladores.ControladorPrincipal;
import java.util.Calendar;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class VentanaUsEstudiante extends javax.swing.JFrame {

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
    ControlVentanaCursos controlVC;
    ControlVentanaLaboratorios controlVL;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    ControlTablaUsuarioEstudiante controlTUE;
    ControlTablaUsuarioDocente controlTUD;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;
    VentanaCursos ventanaC;
    VentanaLaboratorios ventanaL;

    /**
     * Creates new form VentanaUsEstudiante
     */
    public VentanaUsEstudiante(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlVentanaCursos controlVC,
            ControlVentanaLaboratorios controlVL, ControlTablaEstudiante controlTE, ControlTablaDocente controlTD,
            ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL, ControlTablaUsuarioEstudiante controlTUE,
            ControlTablaUsuarioDocente controlTUD,PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE,
            PanelIngresarDocente panelID, PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL,
            VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA,
            VentanaUsAdminLab ventanaAL, VentanaCursos ventanaC, VentanaLaboratorios ventanaL) {
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
        this.controlVC = controlVC;
        this.controlVL = controlVL;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.controlTUE = controlTUE;
        this.controlTUD = controlTUD;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
        this.ventanaC = ventanaC;
        this.ventanaL = ventanaL;
        
    }

    public void informacionEstudiante(Estudiante estudiante) {
        Estudiante aux = estudiante;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(aux.getBirthDate());
        lblNombreEstudiante.setText(aux.getNombre());
        lblBirthDateEstudiante.setText(String.valueOf(calendar.get(Calendar.YEAR)));
        lblEdadEstudiante.setText(String.valueOf(2024-calendar.get(Calendar.YEAR)));
        lblProgramaEstudiante.setText(aux.getPrograma());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrarSecion = new javax.swing.JButton();
        lblPrograma = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        LblBirthDate = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        lblProgramaEstudiante = new javax.swing.JLabel();
        lblEdadEstudiante = new javax.swing.JLabel();
        lblBirthDateEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblInformacionUsuario = new javax.swing.JLabel();
        lblLineaDeLimite = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSecion.setText("Cerrar secion");
        btnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSecionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 471, -1, -1));

        lblPrograma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrograma.setText("Programa:");
        getContentPane().add(lblPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 124, 118, -1));

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdad.setText("Edad:");
        getContentPane().add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, -1, -1));

        LblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(LblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, -1));

        lblEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstudiante.setText("Estudiante:");
        getContentPane().add(lblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, -1));
        getContentPane().add(lblProgramaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 124, 120, 20));
        getContentPane().add(lblEdadEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 92, 120, 20));
        getContentPane().add(lblBirthDateEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 60, 120, 20));

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 28, 120, 20));

        lblInformacionUsuario.setText("Informacion de usuario-------------------------------------------------------------------------------------");
        getContentPane().add(lblInformacionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 451, -1));

        lblLineaDeLimite.setText("__________________________________________________________________________________________");
        getContentPane().add(lblLineaDeLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 450, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSecionActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, panelA, panelIE, panelID, panelIA, panelIAL, this, ventanaD, ventanaA, ventanaAL, ventanaC, ventanaL);
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSecionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBirthDate;
    private javax.swing.JButton btnCerrarSecion;
    private javax.swing.JLabel lblBirthDateEstudiante;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadEstudiante;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInformacionUsuario;
    private javax.swing.JLabel lblLineaDeLimite;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblProgramaEstudiante;
    // End of variables declaration//GEN-END:variables
}
