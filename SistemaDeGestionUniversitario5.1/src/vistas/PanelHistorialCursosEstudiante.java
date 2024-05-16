/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlPanelHistorialCursosEstudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Curso;
import modelo.DetalleNota;
import modelo.Estudiante;
import modelo.Nota;

/**
 *
 * @author JORGE
 */
public class PanelHistorialCursosEstudiante extends javax.swing.JFrame {

    ControlPanelHistorialCursosEstudiante controlPHE;
    Estudiante estudiante;
    ArrayList<Nota> notas;
    ArrayList<DetalleNota> detalles;

    /**
     * Creates new form HistorialCursos
     */
    public PanelHistorialCursosEstudiante(Estudiante estudiante) {
        initComponents();
        setLocationRelativeTo(this);
        controlPHE = new ControlPanelHistorialCursosEstudiante(estudiante);
        this.estudiante = estudiante;
        
        llenarTablaHistorial();
        llenarTablaNota();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNota = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursosAnterioresEstudiante = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 271, -1, -1));

        tablaNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaNota);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 120, 200));

        tablaCursosAnterioresEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Periodo", "Materia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCursosAnterioresEstudiante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 199));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoHistorial.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 500, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsEstudiante ventanUE = new VentanaUsEstudiante(estudiante);
        ventanUE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void llenarTablaHistorial() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Id", "Periodo", "Materia"}, controlPHE.getCursosHistorial().size());
        System.out.println(controlPHE.conseguirCursosHistorial().size());
        tablaCursosAnterioresEstudiante.setModel(modelo);
        TableModel modeloCursosHistorial = tablaCursosAnterioresEstudiante.getModel();
        for (int i = 0; i < controlPHE.getCursosHistorial().size(); i++) {
            Curso curso = controlPHE.conseguirCursosHistorial().get(i);
            modeloCursosHistorial.setValueAt(curso.getId(), i, 0);
            modeloCursosHistorial.setValueAt(curso.getPeriodo(), i, 1);
            modeloCursosHistorial.setValueAt(curso.getMaterial(), i, 2);
        }

    }
    
    public void llenarTablaNota(){
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Nota"},controlPHE.notasEstudiante(estudiante).size());
        System.out.println("Este es el size del array float " +controlPHE.notasEstudiante(estudiante).size());
        tablaNota.setModel(modelo);
        TableModel modeloNota = tablaNota.getModel();
        for (int i = 0; i < controlPHE.notasEstudiante(estudiante).size(); i++) {
            float nota = controlPHE.notasEstudiante(estudiante).get(i);
            modeloNota.setValueAt(nota, i, 0);
        }
    }

    public ArrayList<DetalleNota> consegirDetalle(Estudiante estudiante) {
        ArrayList<DetalleNota> detalles = new ArrayList<>();
        for (Nota nota : notas) {
            for (DetalleNota detalle : nota.getDetalles()) {
                if (detalle.getEstudiante().getNombre().equals(estudiante.getNombre())) {
                    detalles.add(detalle);
                }
            }
        }
        return detalles;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tablaCursosAnterioresEstudiante;
    private javax.swing.JTable tablaNota;
    // End of variables declaration//GEN-END:variables
}