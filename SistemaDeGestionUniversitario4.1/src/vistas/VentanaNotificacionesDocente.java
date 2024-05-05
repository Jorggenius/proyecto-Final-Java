/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import modelo.Docente;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class VentanaNotificacionesDocente extends javax.swing.JFrame {

    Docente docente;

    /**
     * Creates new form VentanaNotificaciones
     */
    public VentanaNotificacionesDocente(Docente docente) {
        initComponents();
        setLocationRelativeTo(this);
        this.docente = docente;
        lblNombreEstudiante.setText(docente.getNombre());
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
        txaCampoNotificaciones = new javax.swing.JTextArea();
        lblNotificasione1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblNotificasione2 = new javax.swing.JLabel();
        lblNotificasione3 = new javax.swing.JLabel();
        lblNotificasione4 = new javax.swing.JLabel();
        lblNotificasione5 = new javax.swing.JLabel();
        lblNotificasione6 = new javax.swing.JLabel();
        lblNotificasione7 = new javax.swing.JLabel();
        lblNotificasione8 = new javax.swing.JLabel();
        lblNotificasione9 = new javax.swing.JLabel();
        lblNotificasione10 = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaCampoNotificaciones.setColumns(20);
        txaCampoNotificaciones.setRows(5);
        jScrollPane1.setViewportView(txaCampoNotificaciones);

        lblNotificasione1.setText("Nueva notificacion");
        lblNotificasione1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione1MouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Notificaciones");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblNotificasione2.setText("Nueva notificacion");
        lblNotificasione2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione2MouseClicked(evt);
            }
        });

        lblNotificasione3.setText("Nueva notificacion");
        lblNotificasione3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione3MouseClicked(evt);
            }
        });

        lblNotificasione4.setText("Nueva notificacion");
        lblNotificasione4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione4MouseClicked(evt);
            }
        });

        lblNotificasione5.setText("Nueva notificacion");
        lblNotificasione5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione5MouseClicked(evt);
            }
        });

        lblNotificasione6.setText("Nueva notificacion");
        lblNotificasione6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione6MouseClicked(evt);
            }
        });

        lblNotificasione7.setText("Nueva notificacion");
        lblNotificasione7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione7MouseClicked(evt);
            }
        });

        lblNotificasione8.setText("Nueva notificacion");
        lblNotificasione8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione8MouseClicked(evt);
            }
        });

        lblNotificasione9.setText("Nueva notificacion");
        lblNotificasione9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione9MouseClicked(evt);
            }
        });

        lblNotificasione10.setText("Nueva notificacion");
        lblNotificasione10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotificasione10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNotificasione1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotificasione10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblNotificasione1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNotificasione10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNotificasione1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione1MouseClicked
        // TODO add your handling code here:
        lblNotificasione1.setText("Esta es una Nueva Notificacion");
    }//GEN-LAST:event_lblNotificasione1MouseClicked

    private void lblNotificasione2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione2MouseClicked

    private void lblNotificasione3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione3MouseClicked

    private void lblNotificasione4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione4MouseClicked

    private void lblNotificasione5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione5MouseClicked

    private void lblNotificasione6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione6MouseClicked

    private void lblNotificasione7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione7MouseClicked

    private void lblNotificasione8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione8MouseClicked

    private void lblNotificasione9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione9MouseClicked

    private void lblNotificasione10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificasione10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotificasione10MouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsDocente ventanaUD = new VentanaUsDocente(docente);
        ventanaUD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNotificasione1;
    private javax.swing.JLabel lblNotificasione10;
    private javax.swing.JLabel lblNotificasione2;
    private javax.swing.JLabel lblNotificasione3;
    private javax.swing.JLabel lblNotificasione4;
    private javax.swing.JLabel lblNotificasione5;
    private javax.swing.JLabel lblNotificasione6;
    private javax.swing.JLabel lblNotificasione7;
    private javax.swing.JLabel lblNotificasione8;
    private javax.swing.JLabel lblNotificasione9;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaCampoNotificaciones;
    // End of variables declaration//GEN-END:variables
}
