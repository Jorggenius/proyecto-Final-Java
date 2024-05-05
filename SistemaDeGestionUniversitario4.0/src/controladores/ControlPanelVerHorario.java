/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Horario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlPanelVerHorario {

    Serializador serializador;
    ArrayList<Curso> cursos;

    public ControlPanelVerHorario() {
        serializador = new Serializador();
        cursos = serializador.leerCursos();
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

    public ArrayList<Curso> cursosLunes() {
        ArrayList<Curso> cursosLunes = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario().getDia().equals("Lunes")) {
                cursosLunes.add(cursos.get(i));
            }
        }
        return cursosLunes;
    }

    public ArrayList<Horario> conseguirHorarioLunes(ArrayList<Curso> cursosLunes) {
        ArrayList<Horario> horarioLunes = new ArrayList<>();
        for (Curso curso : cursosLunes) {
            horarioLunes.add(curso.getHorario());
        }
        return horarioLunes;
    }

    public ArrayList<Curso> cursosMartes() {
        ArrayList<Curso> cursosMartes = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario().getDia().equals("Martes")) {
                cursosMartes.add(cursos.get(i));
            }
        }
        return cursosMartes;
    }

    public ArrayList<Horario> conseguirHorarioMartes(ArrayList<Curso> cursosMartes) {
        ArrayList<Horario> horarioMartes = new ArrayList<>();
        for (Curso curso : cursosMartes) {
            horarioMartes.add(curso.getHorario());
        }
        return horarioMartes;
    }

    public ArrayList<Curso> cursosMiercoles() {
        ArrayList<Curso> cursosMiercoles = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario().getDia().equals("Miercoles")) {
                cursosMiercoles.add(cursos.get(i));
            }
        }
        return cursosMiercoles;
    }

    public ArrayList<Horario> conseguirHorarioMiercoles(ArrayList<Curso> cursosMiercoles) {
        ArrayList<Horario> horarioMiercoles = new ArrayList<>();
        for (Curso curso : cursosMiercoles) {
            horarioMiercoles.add(curso.getHorario());
        }
        return horarioMiercoles;
    }

    public ArrayList<Curso> cursosJueves() {
        ArrayList<Curso> cursosJueves = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario().getDia().equals("Jueves")) {
                cursosJueves.add(cursos.get(i));
            }
        }
        return cursosJueves;
    }

    public ArrayList<Horario> conseguirHorarioJueves(ArrayList<Curso> cursosJueves) {
        ArrayList<Horario> horarioJueves = new ArrayList<>();
        for (Curso curso : cursosJueves) {
            horarioJueves.add(curso.getHorario());
        }
        return horarioJueves;
    }

    public ArrayList<Curso> cursosViernes() {
        ArrayList<Curso> cursosViernes = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario().getDia().equals("Viernes")) {
                cursosViernes.add(cursos.get(i));
            }
        }
        return cursosViernes;
    }

      public ArrayList<Horario> conseguirHorarioViernes(ArrayList<Curso> cursosViernes) {
        ArrayList<Horario> horarioViernes = new ArrayList<>();
        for (Curso curso : cursosViernes) {
            horarioViernes.add(curso.getHorario());
        }
        return horarioViernes;
    }
}
