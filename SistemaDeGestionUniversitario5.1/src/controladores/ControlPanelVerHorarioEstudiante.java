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
//        cursosE = new ArrayList<>();
//        System.out.println("este es el periodo actual " + validacionPeriodo());
        
    }

    public ArrayList<Curso> getCursosE() {
        return cursosE;
    }
    
    

    public ArrayList<Curso> conseguirCursosEstudiante(Estudiante estudiante) {
        ArrayList<Curso> cursosE = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if(cursos.get(i).getPeriodo() != validacionPeriodo()){
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
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario1().getDia().equals("Lunes")
                    || cursos.get(i).getHorario2().getDia().equals("Lunes")) {
                cursosLunes.add(cursos.get(i));
            }
        }
        return cursosLunes;
    }

    public ArrayList<Horario> conseguirHorarioLunes(ArrayList<Curso> cursosLunes) {
        ArrayList<Horario> horarioLunes = new ArrayList<>();
        for (Curso curso : cursosLunes) {
            if ("Lunes".equals(curso.getHorario1().getDia())) {
                horarioLunes.add(curso.getHorario1());
            } else if ("Lunes".equals(curso.getHorario2().getDia())) {
                horarioLunes.add(curso.getHorario2());
            }
        }
        return horarioLunes;
    }

    public ArrayList<Curso> cursosMartes(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosMartes = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario1().getDia().equals("Martes")
                    || cursos.get(i).getHorario2().getDia().equals("Martes")) {
                cursosMartes.add(cursos.get(i));
            }
        }
        return cursosMartes;
    }

    public ArrayList<Horario> conseguirHorarioMartes(ArrayList<Curso> cursosMartes) {
        ArrayList<Horario> horarioMartes = new ArrayList<>();
        for (Curso curso : cursosMartes) {
            if ("Martes".equals(curso.getHorario1().getDia())) {
                horarioMartes.add(curso.getHorario1());
            } else if ("Martes".equals(curso.getHorario2().getDia())) {
                horarioMartes.add(curso.getHorario2());
            }
        }
        return horarioMartes;
    }

    public ArrayList<Curso> cursosMiercoles(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosMiercoles = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario1().getDia().equals("Miercoles")
                    || cursos.get(i).getHorario2().getDia().equals("Miercoles")) {
                cursosMiercoles.add(cursos.get(i));
            }
        }
        return cursosMiercoles;
    }

    public ArrayList<Horario> conseguirHorarioMiercoles(ArrayList<Curso> cursosMiercoles) {
        ArrayList<Horario> horarioMiercoles = new ArrayList<>();
        for (Curso curso : cursosMiercoles) {
            if ("Miercoles".equals(curso.getHorario1().getDia())) {
                horarioMiercoles.add(curso.getHorario1());
            } else if ("Miercoles".equals(curso.getHorario2().getDia())) {
                horarioMiercoles.add(curso.getHorario2());
            }
        }
        return horarioMiercoles;
    }

    public ArrayList<Curso> cursosJueves(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosJueves = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario1().getDia().equals("Jueves")
                    || cursos.get(i).getHorario2().getDia().equals("Jueves")) {
                cursosJueves.add(cursos.get(i));
            }
        }
        return cursosJueves;
    }

    public ArrayList<Horario> conseguirHorarioJueves(ArrayList<Curso> cursosJueves) {
        ArrayList<Horario> horarioJueves = new ArrayList<>();
        for (Curso curso : cursosJueves) {
            if ("Jueves".equals(curso.getHorario1().getDia())) {
                horarioJueves.add(curso.getHorario1());
            } else if ("Jueves".equals(curso.getHorario2().getDia())) {
                horarioJueves.add(curso.getHorario2());
            }
        }
        return horarioJueves;
    }

    public ArrayList<Curso> cursosViernes(ArrayList<Curso> cursosE) {
        ArrayList<Curso> cursosViernes = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getHorario1().getDia().equals("Viernes")
                    || cursos.get(i).getHorario2().getDia().equals("Viernes")) {
                cursosViernes.add(cursos.get(i));
            }
        }
        return cursosViernes;
    }

    public ArrayList<Horario> conseguirHorarioViernes(ArrayList<Curso> cursosViernes) {
        ArrayList<Horario> horarioViernes = new ArrayList<>();
        for (Curso curso : cursosViernes) {
            if ("Viernes".equals(curso.getHorario1().getDia())) {
                horarioViernes.add(curso.getHorario1());
            } else if ("Viernes".equals(curso.getHorario2().getDia())) {
                horarioViernes.add(curso.getHorario2());
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
