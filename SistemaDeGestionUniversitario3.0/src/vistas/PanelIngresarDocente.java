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
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Docente;

/**
 *
 * @author JORGE
 */
public class PanelIngresarDocente extends javax.swing.JFrame {

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
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;
    VentanaCursos ventanaC;
    VentanaLaboratorios ventanaL;

    /**
     * Creates new form PanelIngresarDocente
     */
    public PanelIngresarDocente(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlVentanaCursos controlVC,
            ControlVentanaLaboratorios controlVL, ControlTablaEstudiante controlTE, ControlTablaDocente controlTD,
            ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL, ControlTablaUsuarioEstudiante controlTUE,
            ControlTablaUsuarioDocente controlTUD,PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE,
            PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL,
            VentanaUsEstudiante ventanaE, VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA,
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
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaE = ventanaE;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
        this.ventanaC = ventanaC;
        this.ventanaL = ventanaL;
        txtId.setText(controlP.contadorId());
//        txtId.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresarDocente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        datebirthDate = new com.toedter.calendar.JDateChooser();
        btnInicio = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarDocente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarDocente.setText("Ingresar docente");
        getContentPane().add(lblIngresarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 69, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 112, 118, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 146, 118, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 100, -1));

        lblAsignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAsignatura.setText("Asignatura:");
        getContentPane().add(lblAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 180, 118, -1));
        getContentPane().add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 100, -1));

        lblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 214, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 248, 118, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 282, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 282, -1, -1));

        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 282, -1, -1));

        btnDelete.setText("Borrar");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 282, -1, -1));
        getContentPane().add(datebirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 342, 34, 32));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 65, 36));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Listar.png"))); // NOI18N
        btnListar.setBorderPainted(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 6, 43, 45));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        PanelAdministrador panelA = new PanelAdministrador(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, panelP, panelIE, this, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL, ventanaC, ventanaL);
        panelA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, panelA, panelIE, this, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL, ventanaC, ventanaL);
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        TablaDocentes tablaD = new TablaDocentes(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, panelP, panelA, panelIE, this, panelIA, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL, ventanaC, ventanaL);
        tablaD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        String asignatura = txtAsignatura.getText();
        Date birthDate = datebirthDate.getDate();
        String contraseña = txtContraseña.getText();
        Docente docente = new Docente(asignatura, birthDate, nombre, id, contraseña);
        boolean respuesta = controlD.agregarDocente(docente);
        if (respuesta) {
            JOptionPane.showMessageDialog(null, "Ingresado \n ");
        } else {
            JOptionPane.showMessageDialog(null, "No ingresado \n Id existente");
        }

        limpiarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int Id = Integer.parseInt(txtId.getText());
        Docente aux = (Docente) controlD.buscarDocente(Id);
        if(aux != null){
            txtNombre.setText(aux.getNombre());
            txtAsignatura.setText(aux.getAsignatura());
            datebirthDate.setDate(aux.getBirthDate());
            txtContraseña.setText(aux.getContraseña());
        }else{
            JOptionPane.showMessageDialog(null, "No encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpiarCampos() {
        txtNombre.setText("");
        txtId.setText(controlP.contadorId());
        txtAsignatura.setText("");
        datebirthDate.setDate(null);
        txtContraseña.setText("");

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListar;
    private com.toedter.calendar.JDateChooser datebirthDate;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresarDocente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
