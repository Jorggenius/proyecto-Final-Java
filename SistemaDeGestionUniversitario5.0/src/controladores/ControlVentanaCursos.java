/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Curso;
import java.util.ArrayList;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Usuario;
import vistas.VentanaCursos;
import Singleton.Singleton;

/**
 *
 * @author JORGE
 */
public class ControlVentanaCursos {
    VentanaCursos ventanaC;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;

    public ControlVentanaCursos() {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();
        
//        ventanaC = new VentanaCursos();
    }

    public Estudiante inscribirEstudiante(int nombreEstu) {
        ArrayList<Estudiante> ests = listaUsuarioEsts();
        for (int i = 0; i < ests.size(); i++) {
            if (ventanaC.getEstsCurso().get(nombreEstu) == ests.get(i)) {
                Estudiante est = ests.get(i);
                
                return est;
            }
        }
        return null;
    }

   
    
     public ArrayList<Estudiante> listaUsuarioEsts() {
        ArrayList<Estudiante> ests = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                ests.add(estudiante);
            }
        }
        return ests;
    }

    public ArrayList<Docente> listaUsuarioDocens() {
        ArrayList<Docente> docens = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Docente) {
                Docente docente = (Docente) usuarios.get(i);
                docens.add(docente);
            }
        }
        return docens;
    }
     
  
       public boolean agregarCurso(Curso curso) {
        boolean aux = buscarCurso(curso);
        if (aux) {
            cursos.add(curso);
            Singleton.getInstancia().escribirObjetoCurso();
            return true;
        }
        return false;
    }

    public boolean buscarCurso(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (curso.getPrograma().equals(cursos.get(i).getPrograma())
                    && curso.getJornada().equals(cursos.get(i).getJornada())
                    && curso.getPeriodo() == cursos.get(i).getPeriodo()
                    && curso.getMaterial().equals(cursos.get(i).getMaterial())) {
                return false;
            }
        }
        return true;
    }
    
    
    public String contadorIdCursos() {
        String contador = "00" + String.valueOf(cursos.size() + 1);
//        contIdsCursos++;
        return contador;
    }
}
