/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Docente;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public final class ControlPanelVerHorarioDocente {

    ArrayList<Curso> cursos;
    ArrayList<Curso> cursosD;
    Docente docente;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = validacionPeriodo();

    public ControlPanelVerHorarioDocente(Docente docente) {
        cursos = Singleton.getInstancia().getCursos();
        this.docente = docente;
        cursosD = conseguirCursosDocente(docente);
    }

    public ArrayList<Curso> conseguirCursosDocente(Docente docente) {
        ArrayList<Curso> cursosD = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getId() == docente.getId() &&
                    cursos.get(i).getPeriodo() == validacionPeriodo() ) {
                cursosD.add(cursos.get(i));
            }
        }
        return cursosD;
    }

    public ArrayList<Curso> cursosLunes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosLunes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            for (int j = 0; j < cursosD.get(i).getHorarios().size(); j++) {
                if(cursosD.get(i).getHorarios().get(j).getDia().equals("Lunes")){
                    cursosLunes.add(cursosD.get(i));
                }
            }
        }
        return cursosLunes;
    }

    public ArrayList<Horario> conseguirHorarioLunes(ArrayList<Curso> cursosLunes) {
        ArrayList<Horario> horarioLunes = new ArrayList<>();
        for (Curso curso : cursosLunes) {
            for (Horario horario : curso.getHorarios()) {
                if(horario.getDia().equals("Lunes")){
                    horarioLunes.add(horario);
                }
            }
        }
        return horarioLunes;
    }

    public ArrayList<Curso> cursosMartes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosMartes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
           for (int j = 0; j < cursosD.get(i).getHorarios().size(); j++) {
                if(cursosD.get(i).getHorarios().get(j).getDia().equals("Martes")){
                    cursosMartes.add(cursosD.get(i));
                }
            }
        }
        return cursosMartes;
    }

    public ArrayList<Horario> conseguirHorarioMartes(ArrayList<Curso> cursosMartes) {
        ArrayList<Horario> horarioMartes = new ArrayList<>();
        for (Curso curso : cursosMartes) {
          for (Horario horario : curso.getHorarios()) {
                if(horario.getDia().equals("Martes")){
                    horarioMartes.add(horario);
                }
            }
        }
        return horarioMartes;
    }

    public ArrayList<Curso> cursosMiercoles(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosMiercoles = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            for (int j = 0; j < cursosD.get(i).getHorarios().size(); j++) {
                if(cursosD.get(i).getHorarios().get(j).getDia().equals("Miercoles")){
                    cursosMiercoles.add(cursosD.get(i));
                }
            }
        }
        return cursosMiercoles;
    }

    public ArrayList<Horario> conseguirHorarioMiercoles(ArrayList<Curso> cursosMiercoles) {
        ArrayList<Horario> horarioMiercoles = new ArrayList<>();
        for (Curso curso : cursosMiercoles) {
              for (Horario horario : curso.getHorarios()) {
                if(horario.getDia().equals("Miercoles")){
                    horarioMiercoles.add(horario);
                }
            }
        }
        return horarioMiercoles;
    }

    public ArrayList<Curso> cursosJueves(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosJueves = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
             for (int j = 0; j < cursosD.get(i).getHorarios().size(); j++) {
                if(cursosD.get(i).getHorarios().get(j).getDia().equals("Jueves")){
                    cursosJueves.add(cursosD.get(i));
                }
            }
        }
        return cursosJueves;
    }

    public ArrayList<Horario> conseguirHorarioJueves(ArrayList<Curso> cursosJueves) {
        ArrayList<Horario> horarioJueves = new ArrayList<>();
        for (Curso curso : cursosJueves) {
                for (Horario horario : curso.getHorarios()) {
                if(horario.getDia().equals("Jueves")){
                    horarioJueves.add(horario);
                }
            }        
        }
        return horarioJueves;
    }

    public ArrayList<Curso> cursosViernes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosViernes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
             for (int j = 0; j < cursosD.get(i).getHorarios().size(); j++) {
                if(cursosD.get(i).getHorarios().get(j).getDia().equals("Viernes")){
                    cursosViernes.add(cursosD.get(i));
                }
            }
        }
        return cursosViernes;
    }

    public ArrayList<Horario> conseguirHorarioViernes(ArrayList<Curso> cursosViernes) {
        ArrayList<Horario> horarioViernes = new ArrayList<>();
        for (Curso curso : cursosViernes) {
           for (Horario horario : curso.getHorarios()) {
                if(horario.getDia().equals("Viernes")){
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
