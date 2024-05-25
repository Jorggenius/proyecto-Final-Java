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

/**
 *
 * @author JORGE
 */
public class ControlPanelHistorialCursosDocente {

    ArrayList<Curso> cursos;
    Docente docente;
    ArrayList<Curso> cursosD;
    ArrayList<Curso> cursosHistorial;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = validacionPeriodo();

    public ControlPanelHistorialCursosDocente(Docente docente) {
        cursos = Singleton.getInstancia().getCursos();
        this.docente = docente;
        cursosD = conseguirCursosDocente(docente);
        cursosHistorial = conseguirCursosHistorial();
    }

    public ArrayList<Curso> getCursosHistorial() {
        return cursosHistorial;
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

    public ArrayList<Curso> conseguirCursosHistorial() {
        ArrayList<Curso> cursosHistorial = new ArrayList<>();
        for (int i = 0; i < cursosD.size(); i++) {
            if (cursosD.get(i).getPeriodo() != validacionPeriodo()) {
                cursosHistorial.add(cursosD.get(i));
            }
        }
        return cursosHistorial;
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
