/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Nota;
import serializador.Serializador;
/**
 *
 * @author JORGE
 */
public class ControlPanelGestionCursos {
    Serializador serializador;
    ArrayList<Curso> cursos;

    public ControlPanelGestionCursos() {
       serializador = new Serializador();
       cursos = serializador.leerCursos();
    }

    public boolean configurarNotas(ArrayList<Nota> notas, int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (idCurso == cursos.get(i).getId()) {
                cursos.get(i).setNotas(notas);
                for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                    cursos.get(i).getEstudiantes().get(j).setNotas(notas);
                    serializador.escribirCursos(cursos);
                }
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Nota> mostrarNotas(int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (idCurso == cursos.get(i).getId()) {
                return cursos.get(i).getNotas();
            }
        }
        return null;
    }
}
