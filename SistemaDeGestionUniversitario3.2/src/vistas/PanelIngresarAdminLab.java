/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;


import controladores.ControladorAdminLab;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.AdminLab;

/**
 *
 * @author JORGE
 */
public class PanelIngresarAdminLab extends javax.swing.JFrame {
    ControladorAdminLab controlAL;
    /**
     * Creates new form PanelIngresarAdminLab
     */
    public PanelIngresarAdminLab() {
        initComponents();
        setLocationRelativeTo(this);
        controlAL = new ControladorAdminLab();
        txtId.setText(controlAL.contadorId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresarAdminLab = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        datebirthDate = new com.toedter.calendar.JDateChooser();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarAdminLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarAdminLab.setText("Ingresar admin Lab");
        getContentPane().add(lblIngresarAdminLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 118, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 118, -1));

        lblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 118, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 120, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, -1));
        getContentPane().add(datebirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 120, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        btnBorrar.setText("Borrar");
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 341, 38, 33));

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
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 6, 41, 46));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        PanelAdministrador panelA = new PanelAdministrador();
        panelA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal();
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        TablaAdminLab tablaAL = new TablaAdminLab();
        tablaAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        int id = Integer.parseInt(txtId.getText());
        Date birthdate = datebirthDate.getDate();
        String contraseña = txtContraseña.getText();
        AdminLab adminlab = new AdminLab(birthdate, nombre, id, contraseña);
        boolean respuesta = controlAL.agregarAdminLab(adminlab);
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
        AdminLab aux = (AdminLab) controlAL.buscarAdminLab(Id);
        if(aux != null){
            txtNombre.setText(aux.getNombre());
            datebirthDate.setDate(aux.getBirthDate());
            txtContraseña.setText(aux.getContraseña());
        }else{
            JOptionPane.showMessageDialog(null, "No encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpiarCampos() {
        txtNombre.setText("");
        txtId.setText(controlAL.contadorId());
        datebirthDate.setDate(null);
        txtContraseña.setText("");

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListar;
    private com.toedter.calendar.JDateChooser datebirthDate;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresarAdminLab;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
