/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Nota;
import Singleton.Singleton;
import excepciones.NotasNoConfiguradas;

/**
 *
 * @author JORGE
 */
public class ControlPanelGestionCursos {

    ArrayList<Curso> cursos;

    public ControlPanelGestionCursos() {
        cursos = Singleton.getInstancia().getCursos();
    }

    public void configurarNotas(ArrayList<Nota> notas, int idCurso)throws NotasNoConfiguradas {
        boolean configuradas = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (idCurso == cursos.get(i).getId()) {
                cursos.get(i).setNotas(notas);
                System.out.println("Estos XXXX son los sizes de los detalles de las notas respectivamente" + notas.get(0).getDetalles().size() + " " + notas.get(1).getDetalles().size() + " " + notas.get(2).getDetalles().size() );
                Singleton.getInstancia().escribirObjetoCurso();
                configuradas = true;
            }
        }
        if(!configuradas){
            throw new NotasNoConfiguradas();
        }
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
