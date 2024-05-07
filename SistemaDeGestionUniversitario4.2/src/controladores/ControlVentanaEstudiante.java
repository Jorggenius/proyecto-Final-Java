package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import vistas.VentanaUsEstudiante;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlVentanaEstudiante {

    ArrayList<Curso> cursos;

    public ControlVentanaEstudiante() {
        cursos = Singleton.getInstancia().getCursos();
        System.out.println(cursos.size());
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void abrirVentana(Estudiante estudiante) {
        Estudiante est = estudiante;
        VentanaUsEstudiante ventanaE = new VentanaUsEstudiante(estudiante);
        ventanaE.setVisible(true);
        ventanaE.informacionEstudiante(estudiante);
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
}
