/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Nota;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlPanelGestionCursos {
    ArrayList<Curso> cursos;

    public ControlPanelGestionCursos() {
       cursos = Singleton.getInstancia().getCursos();
    }

    public boolean configurarNotas(ArrayList<Nota> notas, int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (idCurso == cursos.get(i).getId()) {
                cursos.get(i).setNotas(notas);
                Singleton.getInstancia().escribirObjetoCurso();
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
