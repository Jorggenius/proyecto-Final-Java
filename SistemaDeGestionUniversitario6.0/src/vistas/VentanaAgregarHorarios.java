/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaAgregarHorarios;
import excepciones.HorarioNoAdmitido;
import excepciones.HorarioNoExiste;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Administrativo;
import modelo.Curso;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public class VentanaAgregarHorarios extends javax.swing.JFrame {

    ControlVentanaAgregarHorarios controlVAH;
    Administrativo administrativo;
    int idCurso;
    Curso curso;

    /**
     * Creates new form VentanaAgregarHorarios
     */
    public VentanaAgregarHorarios(Administrativo administrativo, int idCurso) {
        initComponents();
        setLocationRelativeTo(this);
        controlVAH = new ControlVentanaAgregarHorarios();
        this.administrativo = administrativo;
        this.idCurso = idCurso;
        curso = controlVAH.conseguirCurso(idCurso);
        lblCurso.setText(String.valueOf(curso.getId()));
        lblCurso.setText("Curso № " + curso.getId());
        lblDocenteCurso.setText(curso.getDocente().getNombre());
        txtIdHorarios.setText(contadorIdHorarios());
        llenarTablaHorario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHoraInicio = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        lblHoraFinal = new javax.swing.JLabel();
        jComboDias = new javax.swing.JComboBox<>();
        txtHoraFinal = new javax.swing.JTextField();
        btnAgregarHorario = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();
        lblCurso = new javax.swing.JLabel();
        lblDocenteCurso = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdHorarios = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHoraInicio.setText("Hora inicio:");
        getContentPane().add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        getContentPane().add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));

        lblHoraFinal.setText("Hora final:");
        getContentPane().add(lblHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jComboDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        getContentPane().add(jComboDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, -1));
        getContentPane().add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 80, -1));

        btnAgregarHorario.setText("Agregar");
        btnAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 321, -1, -1));

        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Horario", "Hora inicio", "Hora final", "Dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaHorario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 0, -1, 276));

        lblCurso.setText("Curso №");
        getContentPane().add(lblCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 118, -1));

        lblDocenteCurso.setText("Docente:");
        getContentPane().add(lblDocenteCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 29, 119, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel1.setText("Id horario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txtIdHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAgregarHorarios.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 800, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHorarioActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(txtIdHorarios.getText());
        String dia = String.valueOf(jComboDias.getSelectedItem());
        LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
        LocalTime horaFinal = LocalTime.parse(txtHoraFinal.getText());
        Horario horario = new Horario(horaInicio, horaFinal, dia, id);
        if (controlVAH.validarHorarios(idCurso, horario)) {
            if (controlVAH.validarHorarioDocente(curso.getDocente().getId(), horario)) {
                controlVAH.agregarHorario(curso.getId(), horario);
                llenarTablaHorario();
                txtIdHorarios.setText(contadorIdHorarios());
            } else {
                JOptionPane.showMessageDialog(null, "No se puede agregar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El horario se crusa con el \n horario de algun estudiante");
        }

    }//GEN-LAST:event_btnAgregarHorarioActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaCursos ventanaC = new VentanaCursos(administrativo);
        ventanaC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int idHorario = Integer.parseInt(txtIdHorarios.getText());
            controlVAH.eliminarHorario(idHorario, curso.getId());
            llenarTablaHorario();
        } catch (HorarioNoExiste ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void llenarTablaHorario() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Id horario", "Hora inicio", "Hora final", "Dia"}, curso.getHorarios().size());
        tablaHorario.setModel(modelo);
        TableModel modeloHorario = tablaHorario.getModel();
        for (int i = 0; i < curso.getHorarios().size(); i++) {
            Horario horario = curso.getHorarios().get(i);
            modeloHorario.setValueAt(horario.getIdHorario(), i, 0);
            modeloHorario.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorario.setValueAt(horario.getHoraFinal(), i, 2);
            modeloHorario.setValueAt(horario.getDia(), i, 3);
        }
    }

    public String contadorIdHorarios() {
        String contador = "0" + (curso.getHorarios().size() + 1);
//        contIdsCursos++;
        return contador;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHorario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jComboDias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDocenteCurso;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHoraFinal;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JTable tablaHorario;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtIdHorarios;
    // End of variables declaration//GEN-END:variables
}
