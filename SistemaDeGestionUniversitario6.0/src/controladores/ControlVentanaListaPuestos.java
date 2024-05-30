/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Prestamo;
import modelo.Puesto;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaListaPuestos {

    ArrayList<Laboratorio> labs;
    ArrayList<Usuario> usuarios;

    public ControlVentanaListaPuestos() {
        labs = Singleton.getInstancia().getLabs();
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public Laboratorio conseguirLab(int idLab) {
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == idLab) {
                System.out.println(" Este es el size de los puestos " + labs.get(i).getPuestos().size());
                return labs.get(i);
            }
        }
        return null;
    }

    public Puesto conseguirPuesto(int idLab, int idPuesto) {
        Laboratorio lab = conseguirLab(idLab);
        for (int i = 0; i < lab.getPuestos().size(); i++) {
            if (lab.getPuestos().get(i).getIdPuesto() == idPuesto) {
                return lab.getPuestos().get(i);
            }
        }
        return null;
    }

    public void convertirReservasPrestamos() {
        for (int i = 0; i < labs.size(); i++) {
            for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                for (int k = 0; k < labs.get(i).getPuestos().get(j).getReservas().size(); k++) {
                    if (labs.get(i).getPuestos().get(j).getReservas().get(k).getDiaReserva().equals(LocalDate.now())) {
                        Prestamo prestamo = new Prestamo(labs.get(i).getPuestos().get(j).getReservas().get(k).getEstudiante(),
                                labs.get(i).getPuestos().get(j).getReservas().get(k).getIdLab(),
                                labs.get(i).getPuestos().get(j).getReservas().get(k).getDiaReserva(),
                                labs.get(i).getPuestos().get(j).getReservas().get(k).getHoraInicio(),
                                labs.get(i).getPuestos().get(j).getReservas().get(k).getHoraFinal());
                        for (int l = 0; l < usuarios.size(); l++) {
                            //aqui vamos a eliminar la reserva del estudiante 
                            //y poner en false tieneReserva que es un boolean
                            if(usuarios.get(l).getId() == prestamo.getEstudiante().getId()){
                                Estudiante estudiante = (Estudiante) usuarios.get(l);
                                estudiante.setReserva(null);
                                estudiante.setTieneReserva(false);
                                usuarios.set(l, estudiante);
                                Singleton.getInstancia().escribirObjetoUsuario();
                                    
                                
                            }
                        }
                        labs.get(i).getPuestos().get(j).getReservas().remove(k);
                        labs.get(i).getPuestos().get(j).getPrestamos().add(prestamo);
                        Singleton.getInstancia().escribirObjetoLab();
                    }
                }
            }

        }
    }
    
    public void eliminarPrestamos(){
        for (int i = 0; i < labs.size(); i++) {
            for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                for (int k = 0; k < labs.get(i).getPuestos().get(j).getPrestamos().size(); k++) {
                    if(LocalDate.now().isAfter(labs.get(i).getPuestos().get(j).getPrestamos().get(k).getDiaReserva())){
                        labs.get(i).getPuestos().get(j).getPrestamos().remove(k);
                    }
                }
            }
        }
    }
}
