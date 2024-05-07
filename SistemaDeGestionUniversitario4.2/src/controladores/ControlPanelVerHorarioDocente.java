/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
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

    public ControlPanelVerHorarioDocente(Docente docente) {
        cursos = Singleton.getInstancia().getCursos();
        this.docente = docente;
        cursosD = conseguirCursosDocente(docente);
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

    public ArrayList<Curso> cursosLunes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosLunes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getHorario1().getDia().equals("Lunes")
                    || cursosD.get(i).getHorario2().getDia().equals("Lunes")) {
                cursosLunes.add(cursosD.get(i));
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

    public ArrayList<Curso> cursosMartes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosMartes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getHorario1().getDia().equals("Martes")
                    || cursosD.get(i).getHorario2().getDia().equals("Martes")) {
                cursosMartes.add(cursosD.get(i));
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

    public ArrayList<Curso> cursosMiercoles(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosMiercoles = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getHorario1().getDia().equals("Miercoles")
                    || cursosD.get(i).getHorario2().getDia().equals("Miercoles")) {
                cursosMiercoles.add(cursosD.get(i));
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

    public ArrayList<Curso> cursosJueves(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosJueves = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getHorario1().getDia().equals("Jueves")
                    || cursosD.get(i).getHorario2().getDia().equals("Jueves")) {
                cursosJueves.add(cursosD.get(i));
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

    public ArrayList<Curso> cursosViernes(ArrayList<Curso> cursosD) {
        ArrayList<Curso> cursosViernes = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getHorario1().getDia().equals("Viernes")
                    || cursosD.get(i).getHorario2().getDia().equals("Viernes")) {
                cursosViernes.add(cursosD.get(i));
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
}
