/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlGestionCursos;
import controladores.ControlTablaAdminLab;
import controladores.ControlTablaAdministrativo;
import controladores.ControlTablaDocente;
import controladores.ControlTablaEstudiante;
import controladores.ControlTablaUsuarioDocente;
import controladores.ControlTablaUsuarioEstudiante;
import controladores.ControlVentanaAdminLab;
import controladores.ControlVentanaAdministrativo;
import controladores.ControlVentanaCursos;
import controladores.ControlVentanaDocente;
import controladores.ControlVentanaEstudiante;
import controladores.ControlVentanaLaboratorios;
import controladores.ControladorAdminLab;
import controladores.ControladorAdministrador;
import controladores.ControladorAdministrativo;
import controladores.ControladorDocente;
import controladores.ControladorEstudiante;
import controladores.ControladorPrincipal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Administrativo;

/**
 *
 * @author JORGE
 */
public class TablaAdministrativo extends javax.swing.JFrame {

    ControladorPrincipal controlP;
    ControladorAdministrador controlA;
    ControladorEstudiante controlE;
    ControladorDocente controlD;
    ControladorAdministrativo controlUA;
    ControladorAdminLab controlAL;
    ControlVentanaEstudiante controlVE;
    ControlVentanaDocente controlVD;
    ControlVentanaAdministrativo controlVA;
    ControlVentanaAdminLab controlVAL;
    ControlVentanaCursos controlVC;
    ControlVentanaLaboratorios controlVL;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    ControlTablaUsuarioEstudiante controlTUE;
    ControlTablaUsuarioDocente controlTUD;
    ControlGestionCursos controlGC;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;
    VentanaCursos ventanaC;
    VentanaLaboratorios ventanaL;

    /**
     * Creates new form TablaAdministrativo
     */
    public TablaAdministrativo(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlVentanaCursos controlVC,
            ControlVentanaLaboratorios controlVL, ControlTablaEstudiante controlTE, ControlTablaDocente controlTD,
            ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL, ControlTablaUsuarioEstudiante controlTUE,
            ControlTablaUsuarioDocente controlTUD,ControlGestionCursos controlGC, PanelPrincipal panelP, PanelAdministrador panelA,
            PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID, PanelIngresarAdministrativo panelIA,
            PanelIngresarAdminLab panelIAL, VentanaUsEstudiante ventanaE, VentanaUsDocente ventanaD,
            VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL, VentanaCursos ventanaC,
            VentanaLaboratorios ventanaL) {
        initComponents();
        setLocationRelativeTo(this);
        this.controlP = controlP;
        this.controlA = controlA;
        this.controlE = controlE;
        this.controlD = controlD;
        this.controlUA = controlUA;
        this.controlAL = controlAL;
        this.controlVE = controlVE;
        this.controlVD = controlVD;
        this.controlVA = controlVA;
        this.controlVAL = controlVAL;
        this.controlVC = controlVC;
        this.controlVL = controlVL;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.controlTUE = controlTUE;
        this.controlTUD = controlTUD;
        this.controlGC = controlGC;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaE = ventanaE;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
        this.ventanaC = ventanaC;
        this.ventanaL = ventanaL;
        llenarTabla();
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
        tablaAdmins = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Id", "BirthDate", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAdmins);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        PanelIngresarAdministrativo panelIA = new PanelIngresarAdministrativo(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlVC, controlVL, controlTE, controlTD, controlTA, controlTAL, controlTUE, controlTUD, controlGC, panelP, panelA, panelIE, panelID, panelIAL, ventanaE, ventanaD, ventanaA, ventanaAL, ventanaC, ventanaL);
        panelIA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void llenarTabla() {
        ArrayList<Administrativo> admins = controlTA.listaUsuarioAdmins();
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Nombre", "Id", "BirthDate", "Contraseña"}, admins.size());
        tablaAdmins.setModel(modelo);

        TableModel modeloAdministrativos = tablaAdmins.getModel();
        for (int i = 0; i < admins.size(); i++) {
            Administrativo administrativo = admins.get(i);
            modeloAdministrativos.setValueAt(administrativo.getNombre(), i, 0);
            modeloAdministrativos.setValueAt(administrativo.getId(), i, 1);
            modeloAdministrativos.setValueAt(administrativo.getBirthDate(), i, 2);
            modeloAdministrativos.setValueAt(administrativo.getContraseña(), i, 3);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAdmins;
    // End of variables declaration//GEN-END:variables
}
