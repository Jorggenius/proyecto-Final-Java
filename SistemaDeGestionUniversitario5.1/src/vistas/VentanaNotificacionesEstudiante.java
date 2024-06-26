/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControlVentanaNotificacionesEstudiante;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Notificacion;

/**
 *
 * @author JORGE
 */
public class VentanaNotificacionesEstudiante extends javax.swing.JFrame {

    Estudiante estudiante;
    ControlVentanaNotificacionesEstudiante controlVN;
    ArrayList<Notificacion> notificaciones;
    int contadorNotificacion;

    /**
     * Creates new form VentanaNotificaciones
     */
    public VentanaNotificacionesEstudiante(Estudiante estudiante) {
        initComponents();
        setLocationRelativeTo(this);
        controlVN = new ControlVentanaNotificacionesEstudiante(estudiante);
        notificaciones = controlVN.conseguirNotificaciones();
        this.estudiante = estudiante;
        contadorNotificacion = 1;
        lblNombreEstudiante.setText(estudiante.getNombre());
        lblNumeroNotificaciones.setText("Usted tiene " + numeroNotificaciones(controlVN.conseguirNotificaciones()) + " Notificaciones");
        lblContadorNotificacion.setText("" + contadorNotificacion);
        desplegarNotificacion(controlVN.conseguirNotificaciones());
        System.out.println(" contador notificaciones " + contadorNotificacion);

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
        lblNumeroNotificaciones = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblNombreEstudiante = new javax.swing.JLabel();
        btnNotificacionAtras = new javax.swing.JButton();
        btnNotificacionAdelante = new javax.swing.JButton();
        lblContadorNotificacion = new javax.swing.JLabel();
        lblRazonNotificacion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaCampoNotificaciones.setColumns(20);
        txaCampoNotificaciones.setRows(5);
        jScrollPane1.setViewportView(txaCampoNotificaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 81, 259, 204));

        lblNumeroNotificaciones.setText("Nueva notificacion");
        getContentPane().add(lblNumeroNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 92, 180, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Notificaciones");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 25, 155, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 351, -1, -1));
        getContentPane().add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 25, 79, 25));

        btnNotificacionAtras.setText("Atras");
        btnNotificacionAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnNotificacionAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 169, -1, -1));

        btnNotificacionAdelante.setText("Adelante");
        btnNotificacionAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionAdelanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNotificacionAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 169, -1, -1));
        getContentPane().add(lblContadorNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 92, 30, 16));

        lblRazonNotificacion.setText("Razon: ");
        getContentPane().add(lblRazonNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 135, 216, -1));

        lblFecha.setText("Fecha:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 27, 150, 23));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoNotificacniones.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaUsEstudiante ventanaUE = new VentanaUsEstudiante(estudiante);
        ventanaUE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnNotificacionAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionAtrasActionPerformed
        // TODO add your handling code here:
//         int sumador = contadorNotificacion;
        contadorNotificacion--;
        lblContadorNotificacion.setText("" + contadorNotificacion);
        desplegarNotificacion(notificaciones);
    }//GEN-LAST:event_btnNotificacionAtrasActionPerformed

    private void btnNotificacionAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionAdelanteActionPerformed
        // TODO add your handling code here:
//        int sumador = contadorNotificacion;
        contadorNotificacion++;
        lblContadorNotificacion.setText("" + contadorNotificacion);
        desplegarNotificacion(notificaciones);
    }//GEN-LAST:event_btnNotificacionAdelanteActionPerformed

    private int numeroNotificaciones(ArrayList<Notificacion> notificaciones) {
        int numeroNotificaciones = 0;
        for (int i = 0; i < notificaciones.size(); i++) {
            numeroNotificaciones++;
        }
        return numeroNotificaciones;
    }

    private void desplegarNotificacion(ArrayList<Notificacion> notificaciones) {
        txaCampoNotificaciones.setText(notificaciones.get(contadorNotificacion - 1).getMensaje());
        lblRazonNotificacion.setText("Razon: " + notificaciones.get(contadorNotificacion - 1).getRazon());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        lblFecha.setText("Fecha: " + notificaciones.get(contadorNotificacion - 1).getFechaEmvio().format(formatter));

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotificacionAdelante;
    private javax.swing.JButton btnNotificacionAtras;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContadorNotificacion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNumeroNotificaciones;
    private javax.swing.JLabel lblRazonNotificacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaCampoNotificaciones;
    // End of variables declaration//GEN-END:variables
}
