/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import controladores.ControlVentanaLaboratorios;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Curso;
import modelo.Horario;
import modelo.Laboratorio;

/**
 *
 * @author JORGE
 */
public class VentanaLaboratorios extends javax.swing.JFrame {
    ControlVentanaLaboratorios controlVL;
    ArrayList<Curso> cursosLab;
    

    /**
     * Creates new form VentanaLaboratorios
     */
    public VentanaLaboratorios() {
        initComponents();
        setLocationRelativeTo(this);
        controlVL = new ControlVentanaLaboratorios();
        cursosLab = new ArrayList<>();
        txtIdLab.setText(controlVL.contadorIdLabs());
        llenarComboBoxDocentes();
        JComboCursos.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCrearCursos = new javax.swing.JLabel();
        lblIdCurso = new javax.swing.JLabel();
        lblNumeroPersonas = new javax.swing.JLabel();
        lblCursos = new javax.swing.JLabel();
        txtIdLab = new javax.swing.JTextField();
        txtNumeroPersonas = new javax.swing.JTextField();
        JComboCursos = new javax.swing.JComboBox<>();
        btnListaLabs = new javax.swing.JButton();
        btnCrearLab = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAñadirCursos = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCursos.setText("Crear cursos------------------------------------------------------------------------------------");
        getContentPane().add(lblCrearCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        lblIdCurso.setText("Id:");
        getContentPane().add(lblIdCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lblNumeroPersonas.setText("Numero de personas:");
        getContentPane().add(lblNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 132, -1, -1));

        lblCursos.setText("Cursos:");
        getContentPane().add(lblCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 172, -1, -1));
        getContentPane().add(txtIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, -1));
        getContentPane().add(txtNumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 110, -1));

        JComboCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        JComboCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboCursosActionPerformed(evt);
            }
        });
        getContentPane().add(JComboCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, -1));

        btnListaLabs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Listar.png"))); // NOI18N
        btnListaLabs.setBorderPainted(false);
        btnListaLabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaLabsActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaLabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 40, 50));

        btnCrearLab.setText("Validar Lab");
        btnCrearLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLabActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        btnAñadirCursos.setText("Añadir");
        btnAñadirCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCursosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 197, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, -1, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCursosActionPerformed
        // TODO add your handling code here:
        int indiceCurso = JComboCursos.getSelectedIndex();
        if (cursosLab.contains(controlVL.getCursos().get(indiceCurso))) {
            JOptionPane.showMessageDialog(null, "Imposible inscribir\n esta incrito");
            JComboCursos.setSelectedItem(null);
/////////////////////////////////this is proob code///////////////////////////////////////// 
        } else if (verificarHorario()) {
            JOptionPane.showMessageDialog(null, "Imposible inscribir\n Horario ocupado");
            JComboCursos.setSelectedItem(null);
        } else {
            cursosLab.add(controlVL.getCursos().get(indiceCurso));
            JOptionPane.showMessageDialog(null, "Curso inscrito");
            JComboCursos.setSelectedItem(null);
        }
    }//GEN-LAST:event_btnAñadirCursosActionPerformed

    private void btnCrearLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLabActionPerformed
        // TODO add your handling code here:
        int idLaboratorios = Integer.parseInt(txtIdLab.getText());
        int numeroPersonas = Integer.parseInt(txtNumeroPersonas.getText());
        Laboratorio lab = new Laboratorio(idLaboratorios, numeroPersonas);

        lab.setCursos(cursosLab);
        lab.setHoras(integrarHorario());
        lab.setMantenimiento(false);
        boolean aux = controlVL.crearLaboratorio(lab);
        if (aux) {
            JOptionPane.showMessageDialog(null, "Agregado");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "NO agrego");
            limpiarCampos();
        }


    }//GEN-LAST:event_btnCrearLabActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsAdminLab ventanaAL = new VentanaUsAdminLab();
        ventanaAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void JComboCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboCursosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtIdLab.getText());
        Laboratorio lab = controlVL.buscarLaboratorio(id);
        if (lab != null){
            txtIdLab.setText(String.valueOf(lab.getIdLaboratorio()));
            txtNumeroPersonas.setText(String.valueOf(lab.getNumeroPersonas()));
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListaLabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaLabsActionPerformed
        // TODO add your handling code here:
        VentanaListaLaborarotios ventanaLL = new VentanaListaLaborarotios();
        ventanaLL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaLabsActionPerformed

    public ArrayList<Horario> integrarHorario() {
        ArrayList<Horario> horario = new ArrayList<>();
        for (int i = 0; i < cursosLab.size(); i++) {
            horario.add(cursosLab.get(i).getHorario1());
        }
        return horario;
    }
    public void llenarComboBoxDocentes() {
        ArrayList<Curso> cursos = controlVL.getCursos();
        DefaultComboBoxModel<String> modeloCursos = new DefaultComboBoxModel<>();
        for (Curso curso : cursos) {
            modeloCursos.addElement(curso.getMaterial());
        }
        JComboCursos.setModel(modeloCursos);
    }

    public void limpiarCampos() {
        txtIdLab.setText(controlVL.contadorIdLabs());
        txtNumeroPersonas.setText("");
        JComboCursos.setSelectedItem(null);
    }

    public boolean verificarHorario() {
        int indiceCurso = JComboCursos.getSelectedIndex();
        for (int i = 0; i < cursosLab.size(); i++) {
            if (controlVL.getCursos().get(indiceCurso).getHorario1().getHoraInicio()
                    == cursosLab.get(i).getHorario1().getHoraInicio() 
                    && controlVL.getCursos().get(indiceCurso).getHorario1().getDia()
                    == cursosLab.get(i).getHorario1().getDia()) {
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboCursos;
    private javax.swing.JButton btnAñadirCursos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearLab;
    private javax.swing.JButton btnListaLabs;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCrearCursos;
    private javax.swing.JLabel lblCursos;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdCurso;
    private javax.swing.JLabel lblNumeroPersonas;
    private javax.swing.JTextField txtIdLab;
    private javax.swing.JTextField txtNumeroPersonas;
    // End of variables declaration//GEN-END:variables
}
