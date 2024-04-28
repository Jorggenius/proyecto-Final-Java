/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlGestionCursos;
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
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Docente;
import modelo.Curso;

/**
 *
 * @author JORGE
 */
public class VentanaUsDocente extends javax.swing.JFrame {

    ArrayList<Curso> cursosA;
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
    ControlGestionCursos controlGC;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;
    VentanaCursos ventanaC;
    VentanaLaboratorios ventanaL;

    /**
     * Creates new form VentanaUsDocente
     */
    public VentanaUsDocente(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlVentanaCursos controlVC,
            ControlVentanaLaboratorios controlVL, ControlTablaEstudiante controlTE, ControlTablaDocente controlTD,
            ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL, ControlTablaUsuarioEstudiante controlTUE,
            ControlTablaUsuarioDocente controlTUD,ControlGestionCursos controlGC, PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE,
            PanelIngresarDocente panelID, PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL,
            VentanaUsEstudiante ventanaE, VentanaUsAdministrativo ventanaA,
            VentanaUsAdminLab ventanaAL, VentanaCursos ventanaC, VentanaLaboratorios ventanaL) {
        initComponents();
        setLocationRelativeTo(this);
        cursosA = new ArrayList<>();
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
        this.controlGC = controlGC;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaE = ventanaE;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
        this.ventanaC = ventanaC;
        this.ventanaL = ventanaL;
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
        lblNombreDocente = new javax.swing.JLabel();
        lblBirthDateDocente = new javax.swing.JLabel();
        lblEdadDocente = new javax.swing.JLabel();
        lblAsignaturaDocente = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        LblBirthDate = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        btnCalificar = new javax.swing.JButton();
        btnGestionCursos = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnNotificaciones = new javax.swing.JButton();
        btnHistorialCursos = new javax.swing.JButton();
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
        getContentPane().add(lblNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 34, 111, 20));
        getContentPane().add(lblBirthDateDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 60, 109, 20));
        getContentPane().add(lblEdadDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 86, 109, 20));
        getContentPane().add(lblAsignaturaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 115, 111, 20));

        lblDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDocente.setText("Docente:");
        getContentPane().add(lblDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, 29));

        LblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(LblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, -1, -1));

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdad.setText("Edad:");
        getContentPane().add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        lblAsignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsignatura.setText("Asignatura:");
        getContentPane().add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, -1, -1));

        btnCalificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalificar.setText("Calificar");
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, -1));

        btnGestionCursos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGestionCursos.setText("Gestion cursos");
        btnGestionCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCursosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 170, -1));

        btnHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHorario.setText("Horario");
        getContentPane().add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, -1));

        btnNotificaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNotificaciones.setText("Notificaciones");
        getContentPane().add(btnNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, -1));

        btnHistorialCursos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHistorialCursos.setText("Historial cursos");
        getContentPane().add(btnHistorialCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, -1));

        lblInformacionUsuario.setText("Informacion de usuario----------------------------------------------------------------");
        getContentPane().add(lblInformacionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 450, -1));

        lblLineaDeLimite.setText("__________________________________________________________________________________");
        getContentPane().add(lblLineaDeLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 460, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSecionActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, controlGC, panelA, panelIE, panelID, panelIA, panelIAL, ventanaE, this, ventanaA, ventanaAL, ventanaC, ventanaL);
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSecionActionPerformed

    private void btnGestionCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCursosActionPerformed
        // TODO add your handling code here:
        GestionCursos gestionC = new GestionCursos(cursosA, controlGC);
        gestionC.setVisible(true);
    }//GEN-LAST:event_btnGestionCursosActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        // TODO add your handling code here:
        Calificaciones calificaciones = new Calificaciones();
        calificaciones.setVisible(true);
    }//GEN-LAST:event_btnCalificarActionPerformed
    public void informacionDocente(Docente docente) {
        Docente aux = docente;
        conseguirCursosEstudiante(docente);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(aux.getBirthDate());
        lblNombreDocente.setText(aux.getNombre());
        lblBirthDateDocente.setText(String.valueOf(calendar.get(Calendar.YEAR)));
        lblEdadDocente.setText(String.valueOf(2024 - calendar.get(Calendar.YEAR)));
        lblAsignaturaDocente.setText(aux.getAsignatura());
    }

    public void conseguirCursosEstudiante(Docente docente) {
        for (int i = 0; i < controlP.getCursos().size(); i++) {
            if (controlP.getCursos().get(i).getDocente().equals(docente)) {
                cursosA.add(controlP.getCursos().get(i));
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBirthDate;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnCerrarSecion;
    private javax.swing.JButton btnGestionCursos;
    private javax.swing.JButton btnHistorialCursos;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblAsignaturaDocente;
    private javax.swing.JLabel lblBirthDateDocente;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadDocente;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInformacionUsuario;
    private javax.swing.JLabel lblLineaDeLimite;
    private javax.swing.JLabel lblNombreDocente;
    // End of variables declaration//GEN-END:variables
}
