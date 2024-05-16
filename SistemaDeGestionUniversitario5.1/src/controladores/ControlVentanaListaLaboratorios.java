/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
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

    public void notificarActualizar(Laboratorio laboratorio, Notificacion notificacionE, Notificacion notificacionD,  Date fechaMantenimiento) {
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
//                labs.set(i, laboratorio);
            }

        }
    }
}
