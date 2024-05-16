/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaCursos;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Administrativo;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Horario;
import modelo.Notificacion;

/**
 *
 * @author JORGE
 */
public class VentanaCursos extends javax.swing.JFrame {

    ControlVentanaCursos controlVC;
    ArrayList<Estudiante> estsCurso;
    Administrativo administrativo;

    /**
     * Creates new form VentanaCursos
     */
    public VentanaCursos(Administrativo administrativo) {
        initComponents();
        setLocationRelativeTo(this);
        this.administrativo = administrativo;
        controlVC = new ControlVentanaCursos();
        estsCurso = new ArrayList<>();
        txtId.setText(controlVC.contadorIdCursos());
//        txtId.setEnabled(false);
        llenarComboBoxDocentes();
        llenarComboBoxEstudiante();
        comboBoxPeriodo();
        comboJornada.setSelectedItem(null);
        comboPeriodo.setSelectedItem(null);
        JComboEstudiantes.setSelectedItem(null);
        JComboDocentes.setSelectedItem(null);
        jComboDias.setSelectedItem(null);
        jComboDias2.setSelectedItem(null);
        comboPeriodo.setSelectedItem(String.valueOf(controlVC.validacionPeriodo()));

    }

    public ArrayList<Estudiante> getEstsCurso() {
        return estsCurso;
    }

    public void setEstsCurso(ArrayList<Estudiante> estsCurso) {
        this.estsCurso = estsCurso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblCrearCursos = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        btnListaDocentes = new javax.swing.JButton();
        lblPrograma = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        lblMateria = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        lblJornada = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblHoraInicio = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        lblHoraFinal = new javax.swing.JLabel();
        jComboDias = new javax.swing.JComboBox<>();
        JComboEstudiantes = new javax.swing.JComboBox<>();
        txtHoraFinal = new javax.swing.JTextField();
        txtHoraInicio2 = new javax.swing.JTextField();
        txtHoraFinal2 = new javax.swing.JTextField();
        jComboDias2 = new javax.swing.JComboBox<>();
        JComboDocentes = new javax.swing.JComboBox<>();
        lblLineaLimite1 = new javax.swing.JLabel();
        lblLineaLimite2 = new javax.swing.JLabel();
        lblIdEstudiantes = new javax.swing.JLabel();
        comboPeriodo = new javax.swing.JComboBox<>();
        btnInscribirEstudiante = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        comboJornada = new javax.swing.JComboBox<>();
        lblLineaLimite3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCursos.setText("Crear curso----------------------------------------------------------------------------");
        getContentPane().add(lblCrearCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblDocente.setText("Id docente:");
        getContentPane().add(lblDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 22));

        btnListaDocentes.setText("Docentes");
        btnListaDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDocentesActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, -1));

        lblPrograma.setText("Programa:");
        getContentPane().add(lblPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, -1, -1));
        getContentPane().add(txtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 98, -1));

        lblMateria.setText("Materia:");
        getContentPane().add(lblMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 98, -1));

        lblJornada.setText("Jornada:");
        getContentPane().add(lblJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblPeriodo.setText("Periodo:");
        getContentPane().add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lblId.setText("Id:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, -1));

        lblHoraInicio.setText("Hora inicio:");
        getContentPane().add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        getContentPane().add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, -1));

        lblHoraFinal.setText("Hora final:");
        getContentPane().add(lblHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jComboDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        getContentPane().add(jComboDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 80, -1));

        getContentPane().add(JComboEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 100, -1));
        getContentPane().add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, -1));
        getContentPane().add(txtHoraInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 70, -1));
        getContentPane().add(txtHoraFinal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 70, -1));

        jComboDias2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        getContentPane().add(jComboDias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 80, -1));
        getContentPane().add(JComboDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));

        lblLineaLimite1.setText("__________________________________________________________________________________");
        getContentPane().add(lblLineaLimite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, -1));

        lblLineaLimite2.setText("Ingresar estudiante---------------------------------------------------------------");
        getContentPane().add(lblLineaLimite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 420, -1));

        lblIdEstudiantes.setText("Id estudiante:");
        getContentPane().add(lblIdEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        comboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        getContentPane().add(comboPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 100, -1));

        btnInscribirEstudiante.setText("Inscribir");
        btnInscribirEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnInscribirEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        btnEditar.setText("Editar");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        btnBorrar.setText("Borrar");
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        comboJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurna", "Nocturna" }));
        getContentPane().add(comboJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));

        lblLineaLimite3.setText("__________________________________________________________________________________");
        getContentPane().add(lblLineaLimite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 420, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 471, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsAdministrativo ventanUA = new VentanaUsAdministrativo(administrativo);
        ventanUA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnListaDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDocentesActionPerformed
        // TODO add your handling code here:
        TablaUsuarioDocente tablaUD = new TablaUsuarioDocente();
        tablaUD.setVisible(true);

    }//GEN-LAST:event_btnListaDocentesActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        // TODO add your handling code here:
        TablaUsuarioEstudiante tablaUE = new TablaUsuarioEstudiante();
        tablaUE.setVisible(true);
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        String programa = txtPrograma.getText();
        int id = Integer.parseInt(txtId.getText());
        String materia = txtMateria.getText();
        String jornada = comboJornada.getSelectedItem().toString();
        int periodo = Integer.parseInt(comboPeriodo.getSelectedItem().toString());
        int nombreDocen = JComboDocentes.getSelectedIndex();
        // here is the notification for students
        LocalDateTime fechaActual = LocalDateTime.now();
        String mensajeNotificacionEstudiante = "Querido Estudiante usted ha sido\n inscrito en el curso de "
                + materia + "\n en la jornada " + jornada + "\n la cual sera dictada por el docente "
                + JComboDocentes.getSelectedItem();
        String motivoNotificacionEstudiante = "Notificacion nuevo curso";
        Notificacion notificacion = new Notificacion(fechaActual, mensajeNotificacionEstudiante, motivoNotificacionEstudiante);

        // here is the notificatio for teacher
        String mensajeNotificacionDocente = "Querido docente " + JComboDocentes.getSelectedItem()
                + "usted ha\n sido seleccionado para dictar el curso\n de " + materia + " en la jornada " + jornada + " felicitaciones";
        String motivoNotificacionDocenete = "Notificacion asignacion nuevo curso";
        Notificacion notificacionDocente = new Notificacion(fechaActual, mensajeNotificacionDocente, motivoNotificacionDocenete);

        // here is de code for the schedule 1
        String dia = String.valueOf(jComboDias.getSelectedItem());
        LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
        LocalTime horaFinal = LocalTime.parse(txtHoraFinal.getText());
        Horario horario1 = new Horario(horaInicio, horaFinal, dia);
        // here is the code for the schedule 2
        String dia2 = String.valueOf(jComboDias2.getSelectedItem());
        LocalTime horaInicio2 = LocalTime.parse(txtHoraInicio2.getText());
        LocalTime horaFinal2 = LocalTime.parse(txtHoraFinal2.getText());
        Horario horario2 = new Horario(horaInicio2, horaFinal2, dia2);

        ArrayList<Estudiante> eCurso = new ArrayList<>();
        Curso curso = new Curso(controlVC.listaUsuarioDocens().get(nombreDocen), materia, horario1, horario2, jornada, periodo, programa, id);
        curso.getDocente().getNotificaciones().add(notificacionDocente);
        curso.setEstudiantes(estsCurso);
        añadirNotificacionEstudiante(notificacion);
        if (controlVC.validarHorarioDocente(curso)) {
            System.out.println(controlVC.validarHorarioDocente(curso));
            if (!curso.getHorario1().getDia().equals(curso.getHorario2().getDia())) {
                boolean cursoAbierto = controlVC.agregarCurso(curso);
                if (cursoAbierto) {
                    JOptionPane.showMessageDialog(null, "Curso abierto");
                    System.out.println(curso.getDocente().getNombre());
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Curso desaprobado");
                    limpiarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERROR \n los Horarios deben de \n programarce en\ndias diferentes");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El docente no esta disponible \n en el horario establecido");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnInscribirEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirEstudianteActionPerformed
                // here is de code for the schedule 1
        String dia = String.valueOf(jComboDias.getSelectedItem());
        LocalTime horaInicio = LocalTime.parse(txtHoraInicio.getText());
        LocalTime horaFinal = LocalTime.parse(txtHoraFinal.getText());
        Horario horario1 = new Horario(horaInicio, horaFinal, dia);
         // here is the code for the schedule 2
        String dia2 = String.valueOf(jComboDias2.getSelectedItem());
        LocalTime horaInicio2 = LocalTime.parse(txtHoraInicio2.getText());
        LocalTime horaFinal2 = LocalTime.parse(txtHoraFinal2.getText());
        Horario horario2 = new Horario(horaInicio2, horaFinal2, dia2);
        
        int nombreEstu = JComboEstudiantes.getSelectedIndex();
        if (estsCurso.contains(controlVC.listaUsuarioEsts().get(nombreEstu))) {
            JOptionPane.showMessageDialog(null, "Imposible el estudiante\n esta incrito");
        } else {
            if (txtPrograma.getText().equals(controlVC.listaUsuarioEsts().get(nombreEstu).getPrograma())) {
                if (controlVC.validarHorariosEstudiante(horario1, horario2,controlVC.listaUsuarioEsts().get(nombreEstu) )) {
                    estsCurso.add(controlVC.listaUsuarioEsts().get(nombreEstu));

                    JOptionPane.showMessageDialog(null, "Estudiante inscrito");
                    JComboEstudiantes.setSelectedItem(null);
                } else {
                    JOptionPane.showMessageDialog(null, "El estudiante tiene \n este horario ocupado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Es estudiante no \npertenese a este programa");
            }
        }

    }//GEN-LAST:event_btnInscribirEstudianteActionPerformed

    private void limpiarCampos() {
        txtPrograma.setText("");
        txtId.setText(controlVC.contadorIdCursos());
        txtMateria.setText("");
        comboJornada.setSelectedItem(null);
        comboPeriodo.setSelectedItem(String.valueOf(controlVC.validacionPeriodo()));
        txtHoraInicio.setText("");
        txtHoraFinal.setText("");
        txtHoraInicio2.setText("");
        txtHoraFinal2.setText("");
        JComboDocentes.setSelectedItem(null);
        JComboEstudiantes.setSelectedItem(null);
        jComboDias.setSelectedItem(null);
        jComboDias2.setSelectedItem(null);
        resetArrayEstCursos();
    }

    public void llenarComboBoxDocentes() {
        ArrayList<Docente> docens = controlVC.listaUsuarioDocens();
        DefaultComboBoxModel<String> modeloDocentes = new DefaultComboBoxModel<>();
        for (Docente docente : docens) {
            modeloDocentes.addElement(docente.getNombre());
        }
        JComboDocentes.setModel(modeloDocentes);
    }

    public void llenarComboBoxEstudiante() {
        ArrayList<Estudiante> ests = controlVC.listaUsuarioEsts();
        DefaultComboBoxModel<String> modeloEsts = new DefaultComboBoxModel<>();
        for (Estudiante estudiante : ests) {
            modeloEsts.addElement(estudiante.getNombre());
        }
        JComboEstudiantes.setModel(modeloEsts);
    }

    public void resetArrayEstCursos() {
        ArrayList<Estudiante> reset = new ArrayList<>();
        estsCurso = reset;
    }

    private void añadirNotificacionEstudiante(Notificacion notificacion) {
        for (int i = 0; i < estsCurso.size(); i++) {
            estsCurso.get(i).getNotificaciones().add(notificacion);
        }
    }

    public void comboBoxPeriodo() {
        comboPeriodo.setSelectedItem(String.valueOf(controlVC.validacionPeriodo()));
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboDocentes;
    private javax.swing.JComboBox<String> JComboEstudiantes;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnInscribirEstudiante;
    private javax.swing.JButton btnListaDocentes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboJornada;
    private javax.swing.JComboBox<String> comboPeriodo;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboDias;
    private javax.swing.JComboBox<String> jComboDias2;
    private javax.swing.JLabel lblCrearCursos;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHoraFinal;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdEstudiantes;
    private javax.swing.JLabel lblJornada;
    private javax.swing.JLabel lblLineaLimite1;
    private javax.swing.JLabel lblLineaLimite2;
    private javax.swing.JLabel lblLineaLimite3;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraFinal2;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtHoraInicio2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtPrograma;
    // End of variables declaration//GEN-END:variables
}