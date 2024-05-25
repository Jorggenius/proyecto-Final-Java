/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaListaPuestos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.AdminLab;
import modelo.Puesto;
import modelo.Reserva;

/**
 *
 * @author JORGE
 */
public class VentanaListaPuestos extends javax.swing.JFrame {

    AdminLab adminLab;
    int idLab;
    ControlVentanaListaPuestos controlVLP;

    /**
     * Creates new form VentanaGestionarLaboratorio
     */
    public VentanaListaPuestos(AdminLab adminLab, int idLab) {
        initComponents();
        setLocationRelativeTo(this);
        this.adminLab = adminLab;
        this.idLab = idLab;
        controlVLP = new ControlVentanaListaPuestos();
        llenarTablaPuestos();
        llenarComboBoxIdPuesto();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuestos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabalReservas = new javax.swing.JTable();
        cbIdpuestos = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        btnVerReservas = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 471, -1, -1));

        tablaPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "№ reservas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPuestos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 230));

        tabalReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Estudiante", "Fecha", "idLab", "Hora reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabalReservas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 300, 230));

        getContentPane().add(cbIdpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 261, -1, -1));

        lblId.setText("Id puestos");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 236, -1, -1));

        btnVerReservas.setText("Ver reservas");
        btnVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 261, 128, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoGestionCursos.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaPuestos() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Id", "№ reserva"}, controlVLP.conseguirLab(idLab).getPuestos().size());
        tablaPuestos.setModel(model);
        TableModel modeloPuesto = tablaPuestos.getModel();
        for (int i = 0; i < controlVLP.conseguirLab(idLab).getPuestos().size(); i++) {
            Puesto puesto = controlVLP.conseguirLab(idLab).getPuestos().get(i);
            modeloPuesto.setValueAt(puesto.getIdPuesto(), i, 0);
            modeloPuesto.setValueAt(puesto.getReservas().size(), i, 1);

        }
    }

    public void llenarTablaReservas(int idPuesto) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Estudiante", "Fecha", "IdLab", "HoraReserva"}, controlVLP.conseguirPuesto(idLab, idPuesto).getReservas().size());
        tabalReservas.setModel(model);
        TableModel modelReserva = tabalReservas.getModel();
        for (int i = 0; i < controlVLP.conseguirPuesto(idLab, idPuesto).getReservas().size(); i++) {
            for (int j = 0; j < controlVLP.conseguirPuesto(idLab, idPuesto).getReservas().size(); j++) {
                Reserva reserva = controlVLP.conseguirPuesto(idLab, idPuesto).getReservas().get(i);
                modelReserva.setValueAt(reserva.getEstudiante().getNombre(), i, 0);
                modelReserva.setValueAt(reserva.getDiaReserva(), i, 1);
                modelReserva.setValueAt(reserva.getIdLab(), i, 2);
                modelReserva.setValueAt(reserva.getHoraInicio(), i, 3);
            }
        }
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaListaLaborarotios ventanaLL = new VentanaListaLaborarotios(adminLab);
        ventanaLL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed
        // TODO add your handling code here:
        int idPuesto = Integer.parseInt(String.valueOf(cbIdpuestos.getSelectedItem()));
        llenarTablaReservas(idPuesto);
    }//GEN-LAST:event_btnVerReservasActionPerformed

    public void llenarComboBoxIdPuesto() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Puesto puesto : controlVLP.conseguirLab(idLab).getPuestos()) {
            model.addElement(String.valueOf(puesto.getIdPuesto()));
        }
        cbIdpuestos.setModel(model);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerReservas;
    private javax.swing.JComboBox<String> cbIdpuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tabalReservas;
    private javax.swing.JTable tablaPuestos;
    // End of variables declaration//GEN-END:variables
}
