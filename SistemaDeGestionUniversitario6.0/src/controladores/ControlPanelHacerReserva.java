/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import excepciones.NoTieneReserva;
import excepciones.ReservaActiva;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Reserva;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlPanelHacerReserva {

    ArrayList<Laboratorio> labs;
    ArrayList<Usuario> usuarios;

    public ControlPanelHacerReserva() {
        labs = Singleton.getInstancia().getLabs();
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void generarReserva(int idLaboratorio, Reserva reserva, int idEstudiante, int idPuesto) throws ReservaActiva {
        if (reserva.getDiaReserva().isAfter(LocalDate.now())) {
            boolean reservaEstudiante = false;
            // debemos asignar la reserva a los puestos

            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId() == idEstudiante) {
                    Estudiante estudiante = (Estudiante) usuarios.get(i);
                    if (!estudiante.isTieneReserva()) {
                        estudiante.setReserva(reserva);
                        estudiante.setTieneReserva(true);
                        usuarios.set(i, estudiante);
                        JOptionPane.showMessageDialog(null, "Reserva hecha");
                        Singleton.getInstancia().escribirObjetoUsuario();
                        reservaEstudiante = true;
                    }
                }
            }
            if (reservaEstudiante) {
                for (int i = 0; i < labs.size(); i++) {
                    if (labs.get(i).getIdLaboratorio() == idLaboratorio) {
                        labs.get(i).getReservas().add(reserva);
                        for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                            if (labs.get(i).getPuestos().get(j).getIdPuesto() == idPuesto) {
                                labs.get(i).getPuestos().get(j).getReservas().add(reserva);
                                labs.get(i).getPuestos().get(j).setOcupado(true);
                                Singleton.getInstancia().escribirObjetoLab();
                            }
                        }
                    }
                }
            } else {
                throw new ReservaActiva();
            }
        } else {

            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
    }

    public void cancelarReserva(Estudiante est) throws NoTieneReserva {
        boolean validar = false;
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == est.getReserva().getIdLab()) {
                for (int j = 0; j < labs.get(i).getReservas().size(); j++) {
                    if (labs.get(i).getReservas().get(j).getEstudiante().getId() == est.getId()) {
                        labs.get(i).getReservas().remove(j);
                    }
                }
                for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                    for (int k = 0; k <  labs.get(i).getPuestos().get(j).getReservas().size(); k++) {
                        if(labs.get(i).getPuestos().get(j).getReservas().get(k).getEstudiante().getId() == est.getId()){
                            labs.get(i).getPuestos().get(j).getReservas().remove(k);
                        }
                    }
   
                }
            }
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == est.getId()) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                if (estudiante.isTieneReserva()) {
                    estudiante.setReserva(null);
                    estudiante.setTieneReserva(false);
                    JOptionPane.showMessageDialog(null, "Reserva cancelada");
                    Singleton.getInstancia().escribirObjetoUsuario();
                    validar = true;
                }
            }
        }
        if (!validar) {
            throw new NoTieneReserva();
        }
    }

}
