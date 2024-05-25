/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Docente;
import modelo.Notificacion;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaNotificacionesDocente {

    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    Docente docente;

    public ControlVentanaNotificacionesDocente(Docente docente) {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
        this.docente = docente;
    }

    public ArrayList<Curso> conseguirCursosDocente(Docente docente) {
        ArrayList<Curso> cursosD = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getId() == docente.getId()) {
                cursosD.add(cursos.get(i));
            }
        }
        return cursosD;
    }

    public ArrayList<Notificacion> conseguirNotificaciones() {
        ArrayList<Curso> cursosD = conseguirCursosDocente(docente);
        ArrayList<Notificacion> notificaciones = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            notificaciones.addAll(cursos.get(i).getDocente().getNotificaciones());
        }
        return notificaciones;
    }

}
