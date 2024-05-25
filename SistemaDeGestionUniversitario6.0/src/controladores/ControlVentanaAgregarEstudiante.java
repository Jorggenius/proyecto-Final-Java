/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import Singleton.Singleton;
import excepciones.EstudianteNoEliminado;
import excepciones.EstudianteNoInscrito;
import javax.swing.JOptionPane;
import modelo.Curso;
import modelo.Horario;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaAgregarEstudiante {

    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;

    public ControlVentanaAgregarEstudiante() {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
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
////////////////////////////////////////////////////////////////////////////////////////////    
//////////////////////////aqui se inscriben los estudiantes en el cursoo////////////////////    

    public void inscribirEstudiante(int indexE, int idCurso) throws EstudianteNoInscrito {
        boolean aux = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                if (!cursos.get(i).getEstudiantes().contains(listaUsuarioEsts().get(indexE))) {
                    cursos.get(i).getEstudiantes().add(listaUsuarioEsts().get(indexE));
                    Singleton.getInstancia().escribirObjetoCurso();
                    aux = true;
                }
            }
        }
        if (!aux) {
            throw new EstudianteNoInscrito();
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////     
/////////////////////////////Aqui elimino estudiantes del curso////////////////////////////////////////    
    
  public void EliminarEstudiante(int indexE, int idCurso) throws  EstudianteNoEliminado{
        boolean aux = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                if (cursos.get(i).getEstudiantes().contains(listaUsuarioEsts().get(indexE))) {
                    cursos.get(i).getEstudiantes().remove(listaUsuarioEsts().get(indexE));
                    Singleton.getInstancia().escribirObjetoCurso();
                    aux = true;
                }
            }
        }
        if (!aux) {
            throw new EstudianteNoEliminado();
        }
    }
   
/////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////    
    
    public Curso conseguirCurso(int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                return cursos.get(i);
            }
        }
        return null;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////    
///////////////////////////Aqui esta el metodo para validar los horarios del estudiante///////////    

    public boolean validarHorariosEstudiante(int indexE, int idCurso) {
        ArrayList<Horario> horariosEstudiante = cursosEstudiante(indexE);
        Curso curso = cursoDeInscripcion(idCurso);

        for (Horario horarioCursoNuevo : curso.getHorarios()) {
            for (Horario horarioExistente : horariosEstudiante) {
                if (horarioCursoNuevo.getDia().equals(horarioExistente.getDia())) {
                    if (!(horarioCursoNuevo.getHoraInicio().isAfter(horarioExistente.getHoraFinal())
                            || horarioCursoNuevo.getHoraFinal().isBefore(horarioExistente.getHoraInicio())
                            || horarioCursoNuevo.getHoraInicio().equals(horarioExistente.getHoraFinal())
                            || horarioCursoNuevo.getHoraFinal().equals(horarioExistente.getHoraInicio()))) {
                        return false; // Hay un cruce de horarios
                    }
                }
            }
        }

        return true; // No hay cruces de horarios

    }

    public ArrayList<Horario> cursosEstudiante(int indexE) {
        ArrayList<Horario> horarioE = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if (cursos.get(i).getEstudiantes().get(j).getId() == listaUsuarioEsts().get(indexE).getId()) {
                    horarioE.addAll(cursos.get(i).getHorarios());
                }
            }
        }
        return horarioE;
    }

    public Curso cursoDeInscripcion(int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                return cursos.get(i);
            }
        }
        return null;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////    
}
