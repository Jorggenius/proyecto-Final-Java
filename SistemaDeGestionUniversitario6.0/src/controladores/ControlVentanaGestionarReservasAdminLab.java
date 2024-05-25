/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
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
public class ControlVentanaGestionarReservasAdminLab {

    ArrayList<Laboratorio> labs;
    ArrayList<Usuario> usuarios;

    public ControlVentanaGestionarReservasAdminLab() {
        labs = Singleton.getInstancia().getLabs();
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public ArrayList<Estudiante> listaUsuarioEsts() {
        ArrayList<Estudiante> ests = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                ests.add(estudiante);
            }
        }
        return ests;
    }
    
    public Estudiante conseguirEstudiante(int indexEstudiante){
        ArrayList<Estudiante> ests = listaUsuarioEsts();
        return ests.get(indexEstudiante);
    }
    
    public void generarReserva(int idLaboratorio, Reserva reserva, int idEstudiante, int idPuesto) throws ReservaActiva{
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



//            if(reserva.getDiaReserva().isAfter(LocalDate.now()) )  {
//            boolean reservaEstudiante = false;
//            for (int i = 0; i < usuarios.size(); i++) {
//                if (usuarios.get(i).getId() == idEstudiante) {
//                    Estudiante estudiante = (Estudiante) usuarios.get(i);
//                    if (!estudiante.isTieneReserva()) {
//                        estudiante.setReserva(reserva);
//                        estudiante.setTieneReserva(true);
//                        usuarios.set(i, estudiante);
//                        Singleton.getInstancia().escribirObjetoUsuario();
//                        reservaEstudiante = true;
//                    }
//                }
//            }
//            if (reservaEstudiante) {
//                for (int i = 0; i < labs.size(); i++) {
//                    if (labs.get(i).getIdLaboratorio() == idLaboratorio) {
//                        labs.get(i).getReservas().add(reserva);
//                        Singleton.getInstancia().escribirObjetoLab();
//                    }
//                }
//            } else {
//                throw new ReservaActiva();
//            }
//        }else{
//            
//            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
//        }
    }
}
