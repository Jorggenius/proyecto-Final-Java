/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlTablaAdminLab;
import controladores.ControlTablaAdministrativo;
import controladores.ControlTablaDocente;
import controladores.ControlTablaEstudiante;
import controladores.ControlVentanaAdminLab;
import controladores.ControlVentanaAdministrativo;
import controladores.ControlVentanaDocente;
import controladores.ControlVentanaEstudiante;
import controladores.ControladorAdminLab;
import controladores.ControladorAdministrador;
import controladores.ControladorAdministrativo;
import controladores.ControladorDocente;
import controladores.ControladorEstudiante;
import controladores.ControladorPrincipal;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class VentanaUsEstudiante extends javax.swing.JFrame {

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
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;

    /**
     * Creates new form VentanaUsEstudiante
     */
    public VentanaUsEstudiante(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL,
            PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID,
            PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL,
            VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL) {
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
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
    }

    public void informacionEstudiante(Estudiante estudiante) {
        Estudiante aux = estudiante;
        lblNombreEstudiante.setText(aux.getNombre());
        lblBirthDateEstudiante.setText(String.valueOf(aux.getBirthDate()));
        lblEdadEstudiante.setText(String.valueOf(2024 - aux.getBirthDate()));
        lblProgramaEstudiante.setText(aux.getPrograma());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        btnCerrarSecion = new javax.swing.JButton();
        LblBirthDate = new javax.swing.JLabel();
        lblBirthDateEstudiante = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblEdadEstudiante = new javax.swing.JLabel();
        lblPrograma = new javax.swing.JLabel();
        lblProgramaEstudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCerrarSecion.setText("Cerrar secion");
        btnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSecionActionPerformed(evt);
            }
        });

        LblBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblBirthDate.setText("Año de nacimiento:");

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdad.setText("Edad:");

        lblPrograma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrograma.setText("Programa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblBirthDate)
                    .addComponent(lblEstudiante)
                    .addComponent(lblEdad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPrograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSecion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgramaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEdadEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(lblBirthDateEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblBirthDate)
                    .addComponent(lblBirthDateEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdad)
                    .addComponent(lblEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrograma)
                    .addComponent(lblProgramaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnCerrarSecion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSecionActionPerformed
        // TODO add your handling code here:
        PanelPrincipal panelP = new PanelPrincipal(controlP, controlA, controlE, controlD, controlUA, controlAL, controlVE, controlVD, controlVA, controlVAL, controlTE, controlTD, controlTA, controlTAL, panelA, panelIE, panelID, panelIA, panelIAL, this, ventanaD, ventanaA, ventanaAL);
        panelP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSecionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBirthDate;
    private javax.swing.JButton btnCerrarSecion;
    private javax.swing.JLabel lblBirthDateEstudiante;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadEstudiante;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblProgramaEstudiante;
    // End of variables declaration//GEN-END:variables
}
