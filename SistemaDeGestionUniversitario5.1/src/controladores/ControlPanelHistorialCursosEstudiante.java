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
import modelo.DetalleNota;
import modelo.Estudiante;
import modelo.Nota;

/**
 *
 * @author JORGE
 */
public class ControlPanelHistorialCursosEstudiante {

    ArrayList<Curso> cursos;
    ArrayList<Curso> cursosE;
    ArrayList<Curso> cursosHistorial;
    Estudiante estudiante;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = validacionPeriodo();

    public ControlPanelHistorialCursosEstudiante(Estudiante estudiante) {
        cursos = Singleton.getInstancia().getCursos();
        this.estudiante = estudiante;
        cursosE = conseguirCursosEstudiante(estudiante);
        cursosHistorial = conseguirCursosHistorial();
        System.out.println(cursosE.size());
        System.out.println("Cursos del historial " + cursosHistorial.size());

    }

    public ArrayList<Curso> getCursosHistorial() {
        return cursosHistorial;
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

    public ArrayList<Curso> conseguirCursosHistorial() {
        ArrayList<Curso> cursosHistorial = new ArrayList<>();
        for (int i = 0; i < cursosE.size(); i++) {
            if (cursosE.get(i).getPeriodo() != validacionPeriodo()) {
                cursosHistorial.add(cursosE.get(i));
            }
        }
        return cursosHistorial;
    }

    public ArrayList<Float> notasEstudiante(Estudiante estudiante) {
        ArrayList<Curso> cursos = conseguirCursosHistorial();
        ArrayList<Float> notas = new ArrayList<>();
        float nota = 0;
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getNotas().size(); j++) {
                for (DetalleNota detalle :cursos.get(i).getNotas().get(j).getDetalles()) {
                    if(detalle.getEstudiante().getId() == estudiante.getId()){
                    nota = nota + detalle.getNota();
                    }
                }
            }
           notas.add( nota/cursos.get(i).getNotas().size());
            System.out.println("nota " +  notas.get(0)+ " esta");
            System.out.println("Este es el size " +  notas.size()+ " aqui");
            
        }
        System.out.println("Este es el size " +  notas.size()+ " aqui");
       return notas;
        
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

    public ArrayList<Nota> notasCurso(int idCurso, ArrayList<Curso> cursos) {
        ArrayList<Nota> notas = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                notas = cursos.get(i).getNotas();
            }
        }
        return notas;
    }
}
