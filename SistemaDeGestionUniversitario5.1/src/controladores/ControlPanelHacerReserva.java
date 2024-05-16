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

    public void generarReserva(int idLaboratorio, Reserva reserva, int idEstudiante) throws ReservaActiva {
        if(reserva.getDiaReserva().isAfter(LocalDate.now()) )  {
            boolean reservaEstudiante = false;
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId() == idEstudiante) {
                    Estudiante estudiante = (Estudiante) usuarios.get(i);
                    if (!estudiante.isTieneReserva()) {
                        estudiante.setReserva(reserva);
                        estudiante.setTieneReserva(true);
                        usuarios.set(i, estudiante);
                        Singleton.getInstancia().escribirObjetoUsuario();
                        reservaEstudiante = true;
                    }
                }
            }
            if (reservaEstudiante) {
                for (int i = 0; i < labs.size(); i++) {
                    if (labs.get(i).getIdLaboratorio() == idLaboratorio) {
                        labs.get(i).getReservas().add(reserva);
                        Singleton.getInstancia().escribirObjetoLab();
                    }
                }
            } else {
                throw new ReservaActiva();
            }
        }else{
            
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
    }

    public void cancelarReserva(int idEstudiante) throws NoTieneReserva {
        boolean validar = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == idEstudiante) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                if (estudiante.isTieneReserva()) {
                    estudiante.setReserva(null);
                    estudiante.setTieneReserva(false);
                    validar = true;
                }
            }
        }
        if (!validar) {
            throw new NoTieneReserva();
        }
    }

}
