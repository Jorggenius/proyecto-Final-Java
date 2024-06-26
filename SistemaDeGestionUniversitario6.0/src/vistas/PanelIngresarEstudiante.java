/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorEstudiante;
import excepciones.ImposibleBorrar;
import excepciones.ImposibleEditar;
import excepciones.NoEncuentra;
import excepciones.NoIngresadoIdExistenteException;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Administrativo;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class PanelIngresarEstudiante extends javax.swing.JFrame {

    Administrativo administrativo;
    ControladorEstudiante controlE;

    /**
     * Creates new form PanelIngresarEstudiante
     */
    public PanelIngresarEstudiante(Administrativo administrativo) {
        initComponents();
        setLocationRelativeTo(this);
        controlE = new ControladorEstudiante();
        txtId.setText(controlE.contadorId());
        this.administrativo = administrativo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIngresarEstudianate = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblPrograma = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        datebirthDate = new com.toedter.calendar.JDateChooser();
        txtContraseña = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarEstudianate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIngresarEstudianate.setText("Ingresar estudiante");
        getContentPane().add(lblIngresarEstudianate, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 68, 164, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 118, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 118, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, -1));

        lblPrograma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrograma.setText("Programa:");
        getContentPane().add(lblPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        lblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBirthDate.setText("Año de nacimiento:");
        getContentPane().add(lblBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        getContentPane().add(txtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 118, -1));
        getContentPane().add(datebirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 64, 43));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Listar.png"))); // NOI18N
        btnListar.setBorderPainted(false);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 6, 43, 43));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        PanelAdministrador panelA = new PanelAdministrador(administrativo);
        panelA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        TablaEstudiantes tablaE = new TablaEstudiantes(administrativo);
        tablaE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            String nombre = txtNombre.getText();
            String idText = txtId.getText();
            String programa = txtPrograma.getText();
            Date birthDate = datebirthDate.getDate();
            String contraseña = txtContraseña.getText();
            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || idText.isEmpty() || programa.isEmpty() || birthDate == null || contraseña.isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }
            // Validar que el ID sea un número válido
            int id;
            try {
                id = Integer.parseInt(idText);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("El ID debe ser un número válido.");
            }
            // Crear el objeto Estudiante
            Estudiante estudiante = new Estudiante(birthDate, nombre, id, contraseña, programa);

            // Intentar agregar el objeto Estudiante
            controlE.agregarEstudiante(estudiante);
            // Limpiar los campos si todo es exitoso
            limpiarCampos();
        } catch (IllegalArgumentException ex) {
            // Mostrar mensaje de error si falta algún campo o el ID no es válido
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NoIngresadoIdExistenteException ex) {
            // Manejar la excepción específica para IDs existentes
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
//        try {
//            String nombre = txtNombre.getText();
//            int id = Integer.parseInt(txtId.getText());
//            String programa = txtPrograma.getText();
//            Date birthDate = datebirthDate.getDate();
//            String contraseña = txtContraseña.getText();
//            Estudiante estudiante = new Estudiante(birthDate, nombre, id, contraseña, programa);
//            controlE.agregarEstudiante(estudiante);
//        } catch (NoIngresadoIdExistenteException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//
//        limpiarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int Id = Integer.parseInt(txtId.getText());
            Estudiante aux = (Estudiante) controlE.buscarEstudiante(Id);
            txtNombre.setText(aux.getNombre());
            txtPrograma.setText(aux.getPrograma());
            datebirthDate.setDate(aux.getBirthDate());
            txtContraseña.setText(aux.getContraseña());
        } catch (NoEncuentra ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String programa = txtPrograma.getText();
            Date birdDate = datebirthDate.getDate();
            String contraseña = txtContraseña.getText();
            controlE.editarEstudiante(id, nombre, programa, birdDate, contraseña);
        } catch (ImposibleEditar ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            limpiarCampos();
        }
        limpiarCampos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtId.getText());
            controlE.borrarEstudiante(id);
            limpiarCampos();
        } catch (ImposibleBorrar ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void limpiarCampos() {
        txtNombre.setText("");
        txtId.setText(controlE.contadorId());
        txtPrograma.setText("");
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
    private javax.swing.JButton btnListar;
    private com.toedter.calendar.JDateChooser datebirthDate;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIngresarEstudianate;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrograma;
    // End of variables declaration//GEN-END:variables
}
