/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class ControlPanelHistorialCursosEstudiante {

    ArrayList<Curso> cursos;
    ArrayList<Curso> cursosE;
    Estudiante estudiante;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = 0;

    public ControlPanelHistorialCursosEstudiante(Estudiante estudiante) {
        cursos = Singleton.getInstancia().getCursos();
        this.estudiante = estudiante;
        cursosE = conseguirCursosEstudiante(estudiante);
        validacionPeriodo();

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
    
    public ArrayList<Curso> conseguirCursosHistorial(){
        ArrayList<Curso> cursosHistorial = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            if(cursosE.get(i).getPeriodo() != periodoActual){
                cursosHistorial.add(cursosE.get(i));
            }
        }
        return cursosHistorial;
    }
    

    public void validacionPeriodo() {
        if (fechaActual.getMonth().getValue() < Month.JULY.getValue()) {//
            periodoActual = 1;
            // si la fecha esta antes periodo 1
        } else {
            periodoActual = 2;
            //si la fecha esta despues periodo 2
        }
    }
}
