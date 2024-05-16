/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import Singleton.Singleton;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JORGE
 */
public class ControlPanelCursosRegistradosE {

    ArrayList<Curso> cursos;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = validacionPeriodo();

    public ControlPanelCursosRegistradosE() {
        cursos = Singleton.getInstancia().getCursos();
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
