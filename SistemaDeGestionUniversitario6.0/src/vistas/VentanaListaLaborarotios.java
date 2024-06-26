/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaListaLaboratorios;
import excepciones.LabSinMantenimiento;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.AdminLab;
import modelo.Curso;
import modelo.Laboratorio;
import modelo.Notificacion;

/**
 *
 * @author JORGE
 */
public class VentanaListaLaborarotios extends javax.swing.JFrame {
    AdminLab adminlab;
    ControlVentanaListaLaboratorios controVLL;

    /**
     * Creates new form VentanaListaLaborarotios
     */
    public VentanaListaLaborarotios(AdminLab adminlab) {
        initComponents();
        setLocationRelativeTo(this);
        this.adminlab = adminlab;
        controVLL = new ControlVentanaListaLaboratorios();
        llenarTablaLaboratorios();
        llenarComboBoxLaboratorios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLaboratorios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        cbIdCursos = new javax.swing.JComboBox<>();
        btnVerCursosr = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        lblMantenimiento = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCancelarMantenimiento = new javax.swing.JButton();
        btnListaPuestos = new javax.swing.JButton();
        localfechaMantenimiento = new com.toedter.calendar.JDateChooser();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaLaboratorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cupos", "Is mantenimiento"
            }
        ));
        jScrollPane1.setViewportView(tablaLaboratorios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 243));

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente ", "Materia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCursos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 320, 243));

        getContentPane().add(cbIdCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 81, -1));

        btnVerCursosr.setText("ver cursos");
        btnVerCursosr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosrActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerCursosr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 150, -1));

        lblMantenimiento.setText("Mantenimiento______________");
        getContentPane().add(lblMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 170, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, -1, -1));

        jLabel1.setText("Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        btnCancelarMantenimiento.setText("Cancelar M.");
        btnCancelarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMantenimientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 150, -1));

        btnListaPuestos.setText("Puestos");
        btnListaPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPuestosActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));
        getContentPane().add(localfechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 100, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoListaLabs.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsAdminLab ventanaUAL = new VentanaUsAdminLab(adminlab);
        ventanaUAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerCursosrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosrActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt((String) cbIdCursos.getSelectedItem());
        llenarTablaCursos(id);
    }//GEN-LAST:event_btnVerCursosrActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        Date fechaMantenimiento = localfechaMantenimiento.getDate();
        int id = Integer.parseInt((String) cbIdCursos.getSelectedItem());
//////////////////////this is de student's notifications////////////////////////
        LocalDateTime fechaActual = LocalDateTime.now();
        String mensajeNotificacionEstudiante = "Querido Estudiante usted esta recibiendo\n"
                + " la presente notificacion a causa\n de que el laboratorio numero" + id
                + "ha sido programado para mantenimiento \n"
                + "en la fecha " + fechaMantenimiento;
        String motivoNotificacionEstudiante = "Mantenimiento";
        Notificacion notificacionE = new Notificacion(fechaActual, mensajeNotificacionEstudiante, motivoNotificacionEstudiante);
//////////////////////this is the teacher's notifications///////////////////////
        String mensajeNotificacionDocente = "Querido Docente usted esta recibiendo\n"
                + " la presente notificacion a causa\n de que el laboratorio numero" + id
                + "ha sido programado para mantenimiento en la\n"
                + "en la fecha " + fechaMantenimiento;
        String motivoNotificacionDocenete = "Mantenimiento";
        Notificacion notificacionD = new Notificacion(fechaActual, mensajeNotificacionDocente, motivoNotificacionDocenete);

        Laboratorio laboratorio = controVLL.conseguirLaboratorio(id);
        if (controVLL.fechaNotificacion(fechaActual, fechaMantenimiento)) {
            if (!laboratorio.isMantenimiento()) {
//            laboratorio.setMantenimiento(true);
//            laboratorio.setFechaMantenimiento(fechaMantenimiento);
                controVLL.notificarActualizar(laboratorio, notificacionE, notificacionD, fechaMantenimiento);
                llenarTablaLaboratorios();
                //buscar en los usuario con el id cuales usuarios tienen reserva en el laboratorio
                //y asi a estos enviarles una notificacion de mantenimiento
            } else {
                JOptionPane.showMessageDialog(null, "El laboratorio tiene\nMantenimiento");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha deve ser superior a la fecha actual");
        }

    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnCancelarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMantenimientoActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt((String) cbIdCursos.getSelectedItem());
            controVLL.cancelarMantenimiento(id);
            llenarTablaLaboratorios();
        }catch (LabSinMantenimiento ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnCancelarMantenimientoActionPerformed

    private void btnListaPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPuestosActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt((String) cbIdCursos.getSelectedItem());
        VentanaListaPuestos ventanaLP = new VentanaListaPuestos(adminlab,id);
        ventanaLP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaPuestosActionPerformed

    public void llenarTablaLaboratorios() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"id", "Cupos", "Is mantenimiente"}, controVLL.getLabs().size());
        tablaLaboratorios.setModel(modelo);
        TableModel modeloCurso = tablaLaboratorios.getModel();
        for (int i = 0; i < controVLL.getLabs().size(); i++) {
            Laboratorio lab = controVLL.getLabs().get(i);
            modeloCurso.setValueAt(lab.getIdLaboratorio(), i, 0);
            modeloCurso.setValueAt(lab.getNumeroPersonas(), i, 1);
            modeloCurso.setValueAt(lab.isMantenimiento(), i, 2);
        }
    }

    public void llenarComboBoxLaboratorios() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (Laboratorio lab : controVLL.getLabs()) {
            modelo.addElement(String.valueOf(lab.getIdLaboratorio()));
        }
        cbIdCursos.setModel(modelo);
    }

    public void llenarTablaCursos(int id) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Docente", "Materia"}, controVLL.conseguirLaboratorio(id).getCursos().size());
        tablaCursos.setModel(modelo);
        TableModel modeloCurso = tablaCursos.getModel();
        for (int i = 0; i < controVLL.conseguirLaboratorio(id).getCursos().size(); i++) {
            Curso curso = controVLL.conseguirLaboratorio(id).getCursos().get(i);
            modeloCurso.setValueAt(curso.getDocente().getNombre(), i, 0);
            modeloCurso.setValueAt(curso.getMateria(), i, 1);

        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMantenimiento;
    private javax.swing.JButton btnListaPuestos;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerCursosr;
    private javax.swing.JComboBox<String> cbIdCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMantenimiento;
    private com.toedter.calendar.JDateChooser localfechaMantenimiento;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTable tablaLaboratorios;
    // End of variables declaration//GEN-END:variables
}
