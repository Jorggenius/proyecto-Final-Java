/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaGestionarReservasAdminLab;
import excepciones.NoTieneReserva;
import excepciones.ReservaActiva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.AdminLab;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Puesto;
import modelo.Reserva;

/**
 *
 * @author JORGE
 */
public class VentanaGestionarReservaAdminLab extends javax.swing.JFrame {

    AdminLab adminLab;
    ControlVentanaGestionarReservasAdminLab controlVGR;

    /**
     * Creates new form VentanaGestionarReservaAdminLab
     */
    public VentanaGestionarReservaAdminLab(AdminLab adminLab) {
        initComponents();
        setLocationRelativeTo(this);
        this.adminLab = adminLab;
        
        controlVGR = new ControlVentanaGestionarReservasAdminLab();
         cbLabs.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLabsActionPerformed(evt);
            }
        });
        llenarComboEstudiantes();
        llenarCombolabs();
        cbPuestos.setSelectedItem(null);
        cbLabs.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateReserva = new com.toedter.calendar.JDateChooser();
        lblFechaReserva = new javax.swing.JLabel();
        cbLabs = new javax.swing.JComboBox<>();
        lblLaboratorios = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        txtHoraFinal = new javax.swing.JTextField();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFinal = new javax.swing.JLabel();
        btnCacelarReserva = new javax.swing.JButton();
        btnHacerReserva = new javax.swing.JButton();
        lblPuestos = new javax.swing.JLabel();
        cbPuestos = new javax.swing.JComboBox<>();
        lblEstudiante = new javax.swing.JLabel();
        cbEstudiantes = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Agendar reservas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 6, 145, 32));
        getContentPane().add(dateReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 96, 100, -1));

        lblFechaReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaReserva.setText("Fecha:");
        getContentPane().add(lblFechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        getContentPane().add(cbLabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 136, 100, -1));

        lblLaboratorios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLaboratorios.setText("Labs:");
        getContentPane().add(lblLaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        getContentPane().add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 100, -1));
        getContentPane().add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 100, -1));

        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraInicio.setText("Hora inicio:");
        getContentPane().add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        lblHoraFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraFinal.setText("Hora final:");
        getContentPane().add(lblHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        btnCacelarReserva.setText("Cancelar reserva");
        btnCacelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacelarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCacelarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 120, -1));

        btnHacerReserva.setText("Generar reserva");
        btnHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHacerReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, -1));

        lblPuestos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPuestos.setText("Puesto:");
        getContentPane().add(lblPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        cbPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 100, -1));

        lblEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstudiante.setText("Estudiante:");
        getContentPane().add(lblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        getContentPane().add(cbEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCacelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacelarReservaActionPerformed
        VentanaEliminarReserva ventanER = new VentanaEliminarReserva(adminLab);
        ventanER.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCacelarReservaActionPerformed

    private void btnHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerReservaActionPerformed
        // TODO add your handling code here:
        try{
            LocalDate fechaReserva = dateReserva.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int idLaboratorio = Integer.parseInt(String.valueOf(cbLabs.getSelectedItem()));
            int idPuesto = Integer.parseInt(String.valueOf(cbPuestos.getSelectedItem()));
            Estudiante estudiante = controlVGR.conseguirEstudiante(cbEstudiantes.getSelectedIndex());    
            LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
            LocalTime horaFinal = LocalTime.parse(txtHoraFinal.getText());
            Reserva reserva = new Reserva(fechaReserva, idLaboratorio, horaInicio, horaFinal, estudiante);

      
            controlVGR.generarReserva(idLaboratorio, reserva, estudiante.getId(), idPuesto);
            limpiarCampos();
        }catch(ReservaActiva ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            limpiarCampos();
        }
    }//GEN-LAST:event_btnHacerReservaActionPerformed

    public void llenarComboEstudiantes() {
        ArrayList<Estudiante> ests = controlVGR.listaUsuarioEsts();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Estudiante est : ests) {
            model.addElement(est.getNombre());
        }
        cbEstudiantes.setModel(model);
    }

      private void cbLabsActionPerformed(java.awt.event.ActionEvent evt) {
        if (cbLabs.getSelectedItem() != null) {
            int idLaboratorio = Integer.parseInt(String.valueOf(cbLabs.getSelectedIndex()));
            llenarComboBoxPuestos(idLaboratorio);
        }
    }
    
    public void llenarCombolabs() {
        ArrayList<Laboratorio> labs = controlVGR.getLabs();
         DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Laboratorio lab: labs) {
            model.addElement(String.valueOf(lab.getIdLaboratorio()));
        }
        cbLabs.setModel(model);
    }
    
   public void llenarComboBoxPuestos(int idLaboratorio) {
        DefaultComboBoxModel<String> modelPuesto = new DefaultComboBoxModel<>();
        for (Puesto puesto : controlVGR.getLabs().get(idLaboratorio).getPuestos()) {
            modelPuesto.addElement(String.valueOf(puesto.getIdPuesto()));
        }
        cbPuestos.setModel(modelPuesto);
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsAdminLab ventanUAL = new VentanaUsAdminLab(adminLab);
        ventanUAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void limpiarCampos(){
        dateReserva.setDate(null);
        cbLabs.setSelectedItem(null);
        cbEstudiantes.setSelectedItem(null);
        txtHoraInicio.setText("");
        txtHoraFinal.setText("");
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCacelarReserva;
    private javax.swing.JButton btnHacerReserva;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbEstudiantes;
    private javax.swing.JComboBox<String> cbLabs;
    private javax.swing.JComboBox<String> cbPuestos;
    private com.toedter.calendar.JDateChooser dateReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblFechaReserva;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHoraFinal;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblLaboratorios;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    // End of variables declaration//GEN-END:variables
}
