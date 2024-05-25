/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Usuario;
import Singleton.Singleton;
import excepciones.HorarioNoExiste;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaAgregarHorarios {

    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;

    public ControlVentanaAgregarHorarios() {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
    }

    public Curso conseguirCurso(int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                return cursos.get(i);
            }
        }
        return null;
    }

    public void agregarHorario(int idCurso, Horario horario) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {

                cursos.get(i).getHorarios().add(horario);
                Singleton.getInstancia().escribirObjetoCurso();
            }
        }
    }
    
    public void eliminarHorario(int idHorario, int idCurso)throws HorarioNoExiste{
        System.out.println("est es el IDcurso " + idCurso);
        System.out.println("este es el Id Horario " + idHorario);
       boolean aux = true;
        for (int i = 0; i < cursos.get(i).getHorarios().size(); i++) {
            if(cursos.get(i).getId() == idCurso){
                for (int j = 0; j < cursos.get(i).getHorarios().size(); j++) {
                    if(cursos.get(i).getHorarios().get(j).getIdHorario() == idHorario){
                        cursos.get(i).getHorarios().remove(j);
                        Singleton.getInstancia().escribirObjetoCurso();
                        aux = true;
                    }
                }
                
                //Aqui va el singleton
            }
        }
        if(!aux){
            throw new HorarioNoExiste();
        }
    }

    public boolean validarHorarioDocente(int idDocente, Horario horario) {

       for (Curso curso : cursos) {
        if (curso.getDocente().getId() == idDocente) {
            if (!curso.getHorarios().isEmpty()) {
                for (Horario h : curso.getHorarios()) {
                    if (horario.getDia().equals(h.getDia())) {
                        if (!(horario.getHoraInicio().isAfter(h.getHoraFinal())
                                || horario.getHoraFinal().isBefore(h.getHoraInicio())
                                || horario.getHoraInicio().equals(h.getHoraFinal())
                                || horario.getHoraFinal().equals(h.getHoraInicio()))) {
                            return false; 
                        }
                    }
                }
            }
        }
    }
    return true; 
} 
///////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////Aqui estoy validando que un nuevo horario no se cruse con los de los estudiantes/////////
    public boolean validarHorarios(int idCurso, Horario horario){

    ArrayList<Horario> horariosEstudiante = horariosEstudiante(idCurso);

    for (Horario horarioExistente : horariosEstudiante) {
        // Verificar si el día es el mismo
        if (horario.getDia().equals(horarioExistente.getDia())) {
            // Verificar si los horarios se solapan
            if (!(horario.getHoraInicio().isAfter(horarioExistente.getHoraFinal())
                    || horario.getHoraFinal().isBefore(horarioExistente.getHoraInicio())
                    || horario.getHoraInicio().equals(horarioExistente.getHoraFinal())
                    || horario.getHoraFinal().equals(horarioExistente.getHoraInicio()))) {
                return false; // Hay un cruce de horarios
            }
        }
    }

    return true; // No hay cruces de horarios
}

public ArrayList<Horario> horariosEstudiante(int idCurso) {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Horario> horarioEstudiantes = new ArrayList<>();

    // Buscar estudiantes inscritos en el curso
    for (Curso curso : cursos) {
        if (curso.getId() == idCurso) {
            estudiantes.addAll(curso.getEstudiantes());
            break;
        }
    }

    // Recolectar los horarios de los estudiantes en otros cursos
    for (Estudiante estudiante : estudiantes) {
        for (Curso curso : cursos) {
            if (curso.getEstudiantes().contains(estudiante)) {
                horarioEstudiantes.addAll(curso.getHorarios());
            }
        }
    }

    return horarioEstudiantes;
}
}
