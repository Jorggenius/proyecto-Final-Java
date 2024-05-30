/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import excepciones.LabSinMantenimiento;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import modelo.Curso;
import modelo.Laboratorio;
import modelo.Notificacion;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaListaLaboratorios {

    ArrayList<Laboratorio> labs;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;

    public ControlVentanaListaLaboratorios() {
        labs = Singleton.getInstancia().getLabs();
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }

    public Laboratorio conseguirLaboratorio(int id) {
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == id) {
                return labs.get(i);
            }
        }
        return null;
    }

    public void notificarActualizar(Laboratorio laboratorio, Notificacion notificacionE, Notificacion notificacionD, Date fechaMantenimiento) {
        // aquie debemos de situar la validacion para que las notificaciones solo se den si hay reservas ese dia
        if (validarFechaNotificaciones(fechaMantenimiento, laboratorio)) {
            for (int i = 0; i < labs.size(); i++) {
                if (labs.get(i).getIdLaboratorio() == laboratorio.getIdLaboratorio()) {
                    labs.get(i).setMantenimiento(true);
                    labs.get(i).setFechaMantenimiento(fechaMantenimiento);
                    for (int j = 0; j < labs.get(i).getCursos().size(); j++) {
                        labs.get(i).getCursos().get(j).getDocente().getNotificaciones().add(notificacionD);
                        for (int k = 0; k < labs.get(i).getCursos().get(j).getEstudiantes().size(); k++) {
                            labs.get(i).getCursos().get(j).getEstudiantes().get(k).getNotificaciones().add(notificacionE);// 
                            Singleton.getInstancia().escribirObjetoCurso();
                            Singleton.getInstancia().escribirObjetoLab();
                            Singleton.getInstancia().escribirObjetoUsuario();
                        }
                    }
                }
            }
            for (int i = 0; i < labs.size(); i++) {
                if(labs.get(i).getIdLaboratorio() == laboratorio.getIdLaboratorio()){
                    for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                        for (int k = 0; k < labs.get(i).getPuestos().get(j).getReservas().size(); k++) {
                            labs.get(i).getPuestos().get(j).getReservas().remove(k);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < labs.size(); i++) {
                if (labs.get(i).getIdLaboratorio() == laboratorio.getIdLaboratorio()) {
                    labs.get(i).setMantenimiento(true);
                    labs.get(i).setFechaMantenimiento(fechaMantenimiento);
                }

            }
        }
    }

    public void cancelarMantenimiento(int idLaboratorio) throws LabSinMantenimiento {
        boolean aux = false;
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == idLaboratorio) {
                labs.get(i).setMantenimiento(false);
                Singleton.getInstancia().escribirObjetoLab();
                aux = true;
            }
        }
        if (!aux) {
            throw new LabSinMantenimiento();
        }
    }

    public boolean fechaNotificacion(LocalDateTime fechaActual, Date fechaMantenimiento) {
        LocalDateTime FechaMantenimeinto = fechaMantenimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return FechaMantenimeinto.isAfter(fechaActual);
    }

    public boolean validarFechaNotificaciones(Date fechaMantenimiento, Laboratorio laboratorio) {
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == laboratorio.getIdLaboratorio()) {
                for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                    if (!labs.get(i).getPuestos().get(j).getReservas().isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
