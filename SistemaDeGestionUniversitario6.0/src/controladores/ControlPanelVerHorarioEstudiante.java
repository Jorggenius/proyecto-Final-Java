/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Horario;
import Singleton.Singleton;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JORGE
 */
public class ControlPanelVerHorarioEstudiante {

    Estudiante estudiante;
    ArrayList<Curso> cursos;
    ArrayList<Curso> cursosE;
    LocalDate fechaActual = LocalDate.now();

    public ControlPanelVerHorarioEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        cursos = Singleton.getInstancia().getCursos();
        cursosE = conseguirCursosEstudiante(estudiante);
        System.out.println("este es el size de los cursos estudiante " +  cursosE.size());
//        cursosE = new ArrayList<>();
//        System.out.println("este es el periodo actual " + validacionPeriodo());

    }

    public ArrayList<Curso> getCursosE() {
        return cursosE;
    }

    public ArrayList<Curso> conseguirCursosEstudiante(Estudiante estudiante) {
        ArrayList<Curso> cursosE = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getPeriodo() == validacionPeriodo()) {
                for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                    if (cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()) {
                        cursosE.add(cursos.get(i));
                        
                    }
                }
            }

        }
        return cursosE;
    }

    public ArrayList<Curso> cursosLunes(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosLunes = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursosE.get(i).getHorarios().size(); j++) {
                if (cursosE.get(i).getHorarios().get(j).getDia().equals("Lunes")) {
                    cursosLunes.add(cursosE.get(i));
                }
            }
        }
        return cursosLunes;
    }

    public ArrayList<Horario> conseguirHorarioLunes(ArrayList<Curso> cursosLunes) {
        ArrayList<Horario> horarioLunes = new ArrayList<>();
        for (Curso curso : cursosLunes) {
            for (Horario horario : curso.getHorarios()) {
                if (horario.getDia().equals("Lunes")) {
                    horarioLunes.add(horario);
                }
            }
        }
        return horarioLunes;
    }

    public ArrayList<Curso> cursosMartes(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosMartes = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursosE.get(i).getHorarios().size(); j++) {
                if (cursosE.get(i).getHorarios().get(j).getDia().equals("Martes")) {
                    cursosMartes.add(cursosE.get(i));
                }
            }
        }
        return cursosMartes;
    }

    public ArrayList<Horario> conseguirHorarioMartes(ArrayList<Curso> cursosMartes) {
        ArrayList<Horario> horarioMartes = new ArrayList<>();
        for (Curso curso : cursosMartes) {
            for (Horario horario : curso.getHorarios()) {
                if (horario.getDia().equals("Martes")) {
                    horarioMartes.add(horario);
                }
            }
        }
        return horarioMartes;
    }

    public ArrayList<Curso> cursosMiercoles(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosMiercoles = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursosE.get(i).getHorarios().size(); j++) {
                if (cursosE.get(i).getHorarios().get(j).getDia().equals("Miercoles")) {
                    cursosMiercoles.add(cursosE.get(i));
                }
            }
        }
        return cursosMiercoles;
    }

    public ArrayList<Horario> conseguirHorarioMiercoles(ArrayList<Curso> cursosMiercoles) {
        ArrayList<Horario> horarioMiercoles = new ArrayList<>();
        for (Curso curso : cursosMiercoles) {
            for (Horario horario : curso.getHorarios()) {
                if (horario.getDia().equals("Miercoles")) {
                    horarioMiercoles.add(horario);
                }
            }
        }
        return horarioMiercoles;
    }

    public ArrayList<Curso> cursosJueves(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosJueves = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursosE.get(i).getHorarios().size(); j++) {
                if (cursosE.get(i).getHorarios().get(j).getDia().equals("Jueves")) {
                    cursosJueves.add(cursosE.get(i));
                }
            }
        }
        return cursosJueves;
    }

    public ArrayList<Horario> conseguirHorarioJueves(ArrayList<Curso> cursosJueves) {
        ArrayList<Horario> horarioJueves = new ArrayList<>();
        for (Curso curso : cursosJueves) {
            for (Horario horario : curso.getHorarios()) {
                if (horario.getDia().equals("Jueves")) {
                    horarioJueves.add(horario);
                }
            }
        }
        return horarioJueves;
    }

    public ArrayList<Curso> cursosViernes(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosViernes = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            for (int j = 0; j < cursosE.get(i).getHorarios().size(); j++) {
                if (cursosE.get(i).getHorarios().get(j).getDia().equals("Viernes")) {
                    cursosViernes.add(cursosE.get(i));
                }
            }
        }
        return cursosViernes;
    }

    public ArrayList<Horario> conseguirHorarioViernes(ArrayList<Curso> cursosViernes) {
        ArrayList<Horario> horarioViernes = new ArrayList<>();
        for (Curso curso : cursosViernes) {
            for (Horario horario : curso.getHorarios()) {
                if (horario.getDia().equals("Viernes")) {
                    horarioViernes.add(horario);
                }
            }
        }
        return horarioViernes;
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
