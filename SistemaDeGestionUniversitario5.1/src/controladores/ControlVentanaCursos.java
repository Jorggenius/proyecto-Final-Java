/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Curso;
import java.util.ArrayList;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Usuario;
import vistas.VentanaCursos;
import Singleton.Singleton;
import java.time.LocalDate;
import java.time.Month;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaCursos {

    VentanaCursos ventanaC;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = 0;

    public ControlVentanaCursos() {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();

//        ventanaC = new VentanaCursos();
    }

    public Estudiante inscribirEstudiante(int nombreEstu) {
        ArrayList<Estudiante> ests = listaUsuarioEsts();
        for (int i = 0; i < ests.size(); i++) {
            if (ventanaC.getEstsCurso().get(nombreEstu) == ests.get(i)) {
                Estudiante est = ests.get(i);

                return est;
            }
        }
        return null;
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

    public ArrayList<Docente> listaUsuarioDocens() {
        ArrayList<Docente> docens = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Docente) {
                Docente docente = (Docente) usuarios.get(i);
                docens.add(docente);
            }
        }
        return docens;
    }

    public boolean agregarCurso(Curso curso) {
        boolean aux = buscarCurso(curso);
        if (aux) {
            cursos.add(curso);
            Singleton.getInstancia().escribirObjetoCurso();
            return true;
        }
        return false;
    }

    public boolean buscarCurso(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (curso.getPrograma().equals(cursos.get(i).getPrograma())
                    && curso.getJornada().equals(cursos.get(i).getJornada())
                    && curso.getPeriodo() == cursos.get(i).getPeriodo()
                    && curso.getMaterial().equals(cursos.get(i).getMaterial())) {
                return false;
            }
        }
        return true;
    }

    public String contadorIdCursos() {
        String contador = "00" + String.valueOf(cursos.size() + 1);
//        contIdsCursos++;
        return contador;
    }

    public boolean validarHorarioDocente(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getNombre().equals(curso.getDocente().getNombre())) {
                if (cursos.get(i).getHorario1().getHoraInicio() == curso.getHorario1().getHoraInicio()
                        || cursos.get(i).getHorario1().getHoraInicio().plusHours(1) == curso.getHorario1().getHoraInicio()
                        || cursos.get(i).getHorario2().getHoraInicio() == curso.getHorario2().getHoraInicio()
                        || cursos.get(i).getHorario2().getHoraInicio().plusHours(1) == curso.getHorario2().getHoraInicio()
                        && cursos.get(i).getHorario1().getDia().equals(curso.getHorario1().getDia())
                        || cursos.get(i).getHorario2().getDia().equals(curso.getHorario2().getDia())) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validarHorariosEstudiante(Horario horario1, Horario horario2, Estudiante estudiante) {
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if (cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()) {
                    if (cursos.get(i).getHorario1().getHoraInicio() == horario1.getHoraInicio()
                            || cursos.get(i).getHorario1().getHoraInicio().plusHours(1) == horario1.getHoraInicio()
                            || cursos.get(i).getHorario2().getHoraInicio() == horario2.getHoraInicio()
                            || cursos.get(i).getHorario2().getHoraInicio().plusHours(1) == horario2.getHoraInicio()
                            && cursos.get(i).getHorario1().getDia().equals(horario1.getDia())
                            || cursos.get(i).getHorario2().getDia().equals(horario2.getDia())) {
                      return false;
                    }
                }
            }
        }
        return true;
    }

    public int validacionPeriodo() {
        int periodoActual = 0;
        if (fechaActual.getMonth().getValue() < Month.JULY.getValue()) {//
            periodoActual = 1;

            // si la fecha esta antes periodo 1
        } else {
            periodoActual = 2;

            //si la fecha esta despues periodo 2
        }
        return periodoActual;
    }
}
