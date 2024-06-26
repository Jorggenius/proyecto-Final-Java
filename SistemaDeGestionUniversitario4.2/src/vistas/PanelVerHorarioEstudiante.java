/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlPanelVerHorarioEstudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public class PanelVerHorarioEstudiante extends javax.swing.JFrame {

    ControlPanelVerHorarioEstudiante controlPVH;
    Estudiante estudiante;
    ArrayList<Curso> cursosE;

    /**
     * Creates new form VerHorario
     */
    public PanelVerHorarioEstudiante(Estudiante estudiante) {
        initComponents();
        setLocationRelativeTo(this);
        this.estudiante = estudiante;
        controlPVH = new ControlPanelVerHorarioEstudiante(estudiante);
        cursosE = controlPVH.conseguirCursosEstudiante(estudiante);
        llenarTablaCursosLunes();
        llenarTablaCursosMartes();
        llenarTablaCursosMiercoles();
        llenarTablaCursosJueves();
        llenarTablaCursosViernes();
        llenarTablaHorarioLunes();
        llenarTablaHorarioMartes();
        llenarTablaHorarioMiercoles();
        llenarTablaHorarioJueves();
        llenarTablaHorarioViernes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLunes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursosLunes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHorarioCursosMartes = new javax.swing.JTable();
        lblMartes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCursosMartes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaHorarioCursosLunes = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCursosJueves = new javax.swing.JTable();
        lblMiercoles = new javax.swing.JLabel();
        lblJueves = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCursosViernes = new javax.swing.JTable();
        lblViernes = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaCursosMiercoles = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaHorarioCursosViernes = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaHorarioCursosMiercoles = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaHorarioCursosJueves = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLunes.setText("Lunes:");
        getContentPane().add(lblLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        tablaCursosLunes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCursosLunes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 28, 220, 67));

        tablaHorarioCursosMartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHorarioCursosMartes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 123, 250, 66));

        lblMartes.setText("Marters:");
        getContentPane().add(lblMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, -1, -1));

        tablaCursosMartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaCursosMartes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 123, 220, 66));

        tablaHorarioCursosLunes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaHorarioCursosLunes);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 28, 250, 67));

        tablaCursosJueves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaCursosJueves);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 313, 220, 65));

        lblMiercoles.setText("Miercoles:");
        getContentPane().add(lblMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 195, -1, -1));

        lblJueves.setText("Jueves:");
        getContentPane().add(lblJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 291, -1, -1));

        tablaCursosViernes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaCursosViernes);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 406, 220, 68));

        lblViernes.setText("Viernes:");
        getContentPane().add(lblViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 384, -1, -1));

        tablaCursosMiercoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clase"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tablaCursosMiercoles);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 217, 220, 68));

        tablaHorarioCursosViernes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tablaHorarioCursosViernes);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 406, 250, 68));

        tablaHorarioCursosMiercoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tablaHorarioCursosMiercoles);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 217, 250, 68));

        tablaHorarioCursosJueves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora inicio", "Hora final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tablaHorarioCursosJueves);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 313, 250, 65));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 492, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoHorarios.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void llenarTablaCursosLunes() {
        ArrayList<Curso> cursosLunes = controlPVH.cursosLunes(controlPVH.conseguirCursosEstudiante(estudiante));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"", ""}, cursosLunes.size());
        tablaCursosLunes.setModel(modelo);
        TableModel modeloCurso = tablaCursosLunes.getModel();
        for (int i = 0; i < cursosLunes.size(); i++) {
            Curso curso = cursosLunes.get(i);
            modeloCurso.setValueAt(curso.getId(), i, 0);
            modeloCurso.setValueAt(curso.getMaterial(), i, 1);
        }
    }

    private void llenarTablaHorarioLunes() {
        ArrayList<Horario> horarioLunes = controlPVH.conseguirHorarioLunes(controlPVH.cursosLunes(controlPVH.conseguirCursosEstudiante(estudiante)));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Dia", "HoraInicial", "HoraFinal"}, horarioLunes.size());
        tablaHorarioCursosLunes.setModel(modelo);
        TableModel modeloHorarioLunes = tablaHorarioCursosLunes.getModel();
        for (int i = 0; i < horarioLunes.size(); i++) {
            Horario horario = horarioLunes.get(i);
            modeloHorarioLunes.setValueAt(horario.getDia(), i, 0);
            modeloHorarioLunes.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorarioLunes.setValueAt(horario.getHoraFinal(), i, 2);
        }
    }

    private void llenarTablaCursosMartes() {
        ArrayList<Curso> cursosMartes = controlPVH.cursosMartes(controlPVH.conseguirCursosEstudiante(estudiante));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"", ""}, cursosMartes.size());
        tablaCursosMartes.setModel(modelo);
        TableModel modeloCurso = tablaCursosMartes.getModel();
        for (int i = 0; i < cursosMartes.size(); i++) {
            Curso curso = cursosMartes.get(i);
            modeloCurso.setValueAt(curso.getId(), i, 0);
            modeloCurso.setValueAt(curso.getMaterial(), i, 1);
        }
    }

    private void llenarTablaHorarioMartes() {
        ArrayList<Horario> horarioMartes = controlPVH.conseguirHorarioMartes(controlPVH.cursosMartes(controlPVH.conseguirCursosEstudiante(estudiante)));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Dia", "HoraInicial", "HoraFinal"}, horarioMartes.size());
        tablaHorarioCursosMartes.setModel(modelo);
        TableModel modeloHorarioMartes = tablaHorarioCursosMartes.getModel();
        for (int i = 0; i < horarioMartes.size(); i++) {
            Horario horario = horarioMartes.get(i);
            modeloHorarioMartes.setValueAt(horario.getDia(), i, 0);
            modeloHorarioMartes.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorarioMartes.setValueAt(horario.getHoraFinal(), i, 2);
        }
    }

    private void llenarTablaCursosMiercoles() {
        ArrayList<Curso> cursosMiercoles = controlPVH.cursosMiercoles(controlPVH.conseguirCursosEstudiante(estudiante));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"", ""}, cursosMiercoles.size());
        tablaCursosMiercoles.setModel(modelo);
        TableModel modeloCurso = tablaCursosMiercoles.getModel();
        for (int i = 0; i < cursosMiercoles.size(); i++) {
            Curso curso = cursosMiercoles.get(i);
            modeloCurso.setValueAt(curso.getId(), i, 0);
            modeloCurso.setValueAt(curso.getMaterial(), i, 1);
        }
    }

    private void llenarTablaHorarioMiercoles() {
        ArrayList<Horario> horarioMiercoles = controlPVH.conseguirHorarioMiercoles(controlPVH.cursosMiercoles(controlPVH.conseguirCursosEstudiante(estudiante)));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Dia", "HoraInicial", "HoraFinal"}, horarioMiercoles.size());
        tablaHorarioCursosMiercoles.setModel(modelo);
        TableModel modeloHorarioMiercoles = tablaHorarioCursosMiercoles.getModel();
        for (int i = 0; i < horarioMiercoles.size(); i++) {
            Horario horario = horarioMiercoles.get(i);
            modeloHorarioMiercoles.setValueAt(horario.getDia(), i, 0);
            modeloHorarioMiercoles.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorarioMiercoles.setValueAt(horario.getHoraFinal(), i, 2);
        }
    }

    private void llenarTablaCursosJueves() {
        ArrayList<Curso> cursosJueves = controlPVH.cursosJueves(controlPVH.conseguirCursosEstudiante(estudiante));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"", ""}, cursosJueves.size());
        tablaCursosJueves.setModel(modelo);
        TableModel modeloCurso = tablaCursosJueves.getModel();
        for (int i = 0; i < cursosJueves.size(); i++) {
            Curso curso = cursosJueves.get(i);
            modeloCurso.setValueAt(curso.getId(), i, 0);
            modeloCurso.setValueAt(curso.getMaterial(), i, 1);
        }
    }

    private void llenarTablaHorarioJueves() {
        ArrayList<Horario> horarioJueves = controlPVH.conseguirHorarioJueves(controlPVH.cursosJueves(controlPVH.conseguirCursosEstudiante(estudiante)));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Dia", "HoraInicial", "HoraFinal"}, horarioJueves.size());
        tablaHorarioCursosJueves.setModel(modelo);
        TableModel modeloHorarioJueves = tablaHorarioCursosJueves.getModel();
        for (int i = 0; i < horarioJueves.size(); i++) {
            Horario horario = horarioJueves.get(i);
            modeloHorarioJueves.setValueAt(horario.getDia(), i, 0);
            modeloHorarioJueves.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorarioJueves.setValueAt(horario.getHoraFinal(), i, 2);
        }
    }

    private void llenarTablaCursosViernes() {
        ArrayList<Curso> cursosViernes = controlPVH.cursosViernes(controlPVH.conseguirCursosEstudiante(estudiante));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"", ""}, cursosViernes.size());
        tablaCursosViernes.setModel(modelo);
        TableModel modeloCurso = tablaCursosViernes.getModel();
        for (int i = 0; i < cursosViernes.size(); i++) {
            Curso curso = cursosViernes.get(i);
            modeloCurso.setValueAt(curso.getId(), i, 0);
            modeloCurso.setValueAt(curso.getMaterial(), i, 1);
        }
    }

    private void llenarTablaHorarioViernes() {
        ArrayList<Horario> horarioViernes = controlPVH.conseguirHorarioViernes(controlPVH.cursosViernes(controlPVH.conseguirCursosEstudiante(estudiante)));
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Dia", "HoraInicial", "HoraFinal"}, horarioViernes.size());
        tablaHorarioCursosViernes.setModel(modelo);
        TableModel modeloHorarioViernes = tablaHorarioCursosViernes.getModel();
        for (int i = 0; i < horarioViernes.size(); i++) {
            Horario horario = horarioViernes.get(i);
            modeloHorarioViernes.setValueAt(horario.getDia(), i, 0);
            modeloHorarioViernes.setValueAt(horario.getHoraInicio(), i, 1);
            modeloHorarioViernes.setValueAt(horario.getHoraFinal(), i, 2);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblJueves;
    private javax.swing.JLabel lblLunes;
    private javax.swing.JLabel lblMartes;
    private javax.swing.JLabel lblMiercoles;
    private javax.swing.JLabel lblViernes;
    private javax.swing.JTable tablaCursosJueves;
    private javax.swing.JTable tablaCursosLunes;
    private javax.swing.JTable tablaCursosMartes;
    private javax.swing.JTable tablaCursosMiercoles;
    private javax.swing.JTable tablaCursosViernes;
    private javax.swing.JTable tablaHorarioCursosJueves;
    private javax.swing.JTable tablaHorarioCursosLunes;
    private javax.swing.JTable tablaHorarioCursosMartes;
    private javax.swing.JTable tablaHorarioCursosMiercoles;
    private javax.swing.JTable tablaHorarioCursosViernes;
    // End of variables declaration//GEN-END:variables
}
