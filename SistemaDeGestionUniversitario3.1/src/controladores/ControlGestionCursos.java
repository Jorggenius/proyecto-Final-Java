/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Nota;

/**
 *
 * @author JORGE
 */
public class ControlGestionCursos {

    ControladorPrincipal controlP;

    public ControlGestionCursos(ControladorPrincipal controlP) {
        this.controlP = controlP;
    }

    public boolean configurarNotas(ArrayList<Nota> notas, int idCurso) {
        for (int i = 0; i < controlP.getCursos().size(); i++) {
            if (idCurso == controlP.getCursos().get(i).getId()) {
                controlP.getCursos().get(i).setNotas(notas);
                for (int j = 0; j < controlP.getCursos().get(i).getEstudiantes().size(); j++) {
                    controlP.getCursos().get(i).getEstudiantes().get(j).setNotas(notas);
                }
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Nota> mostrarNotas(int idCurso) {
        for (int i = 0; i < controlP.getCursos().size(); i++) {
            if (idCurso == controlP.getCursos().get(i).getId()) {
                return controlP.getCursos().get(i).getNotas();
            }
        }
        return null;
    }
}
