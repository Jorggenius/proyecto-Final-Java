/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Notificacion;
import modelo.Usuario;
/**
 *
 * @author JORGE
 */
public class ControlVentanaNotificacionesEstudiante {
    
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    ArrayList<Laboratorio> labs;
    Estudiante estudiante;
    

    public ControlVentanaNotificacionesEstudiante(Estudiante estudiante) {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
        labs = Singleton.getInstancia().getLabs();
        this.estudiante = estudiante;
    }
    
       public ArrayList<Curso> conseguirCursosEstudiante(Estudiante estudiante) {
        ArrayList<Curso> cursosE = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if (cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()) {
                    cursosE.add(cursos.get(i));
                }
            }
        }
        return cursosE;
    }
       
    public ArrayList<Notificacion> conseguirNotificacionesEstudiante(Estudiante estudiante){
        ArrayList<Notificacion> notificacioones = new ArrayList<>();
        for (int i = 0; i < labs.size(); i++) {
            for (int j = 0; j < labs.get(i).getCursos().size(); j++) {
                for (int k = 0; k < labs.get(i).getCursos().get(j).getEstudiantes().size(); k++) {
                    if(labs.get(i).getCursos().get(j).getEstudiantes().get(k).getId() == estudiante.getId()){
                        notificacioones.addAll(labs.get(i).getCursos().get(j).getEstudiantes().get(k).getNotificaciones());
                    }
                }
            }
            
        }
        return notificacioones;
    }
       
    public ArrayList<Notificacion> conseguirNotificaciones(){
        ArrayList<Curso> cursosE = conseguirCursosEstudiante(estudiante);
        ArrayList<Notificacion> notificaciones = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if(cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()){
                    notificaciones.addAll(cursos.get(i).getEstudiantes().get(j).getNotificaciones());
//                    notificaciones.addAll(conseguirNotificacionesEstudiante(estudiante));
                }
            }
        }
        notificaciones.addAll(conseguirNotificacionesEstudiante(estudiante));
        System.out.println("este es el size de las notificaciones " + notificaciones.size());
        return notificaciones;
    }
}
