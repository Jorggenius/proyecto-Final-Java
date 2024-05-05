/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Nota;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlCalificacionesEstudiante {

    Serializador serializador;
    ArrayList<Curso> cursos;

    public ControlCalificacionesEstudiante() {
        serializador = new Serializador();
        cursos = serializador.leerCursos();

    }

//    public ArrayList<Nota> devolverCurso(String idEstudinate) {
//        for (int i = 0; i < cursos.size(); i++) {
//            if(cursos.get(i).getId() == idCurso){
//                for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
//                    if(cursos.get(i).getEstudiantes().get(i).getId() == idEstudinate){
////                        return cursos.get(i).getEstudiantes().get(i).getNotas();
//                    }
//                }
//            }
//        }
//        return null;
//    }
   
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
    
    public ArrayList<Nota> notasCurso(int idCurso, ArrayList<Curso> cursos){
        ArrayList<Nota> notas = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if(cursos.get(i).getId() == idCurso){
            notas = cursos.get(i).getNotas();
            }
        }
        return notas;
    }
    
}
