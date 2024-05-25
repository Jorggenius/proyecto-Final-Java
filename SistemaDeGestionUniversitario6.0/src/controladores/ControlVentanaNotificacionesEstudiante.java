/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Notificacion;
import modelo.Usuario;
/**
 *
 * @author JORGE
 */
public class ControlVentanaNotificacionesEstudiante {
    
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    Estudiante estudiante;
    

    public ControlVentanaNotificacionesEstudiante(Estudiante estudiante) {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
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
       
    public ArrayList<Notificacion> conseguirNotificaciones(){
        ArrayList<Curso> cursosE = conseguirCursosEstudiante(estudiante);
        ArrayList<Notificacion> notificaciones = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if(cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()){
                    notificaciones.addAll(cursos.get(i).getEstudiantes().get(j).getNotificaciones());
                }
            }
        }
        return notificaciones;
    }
}
