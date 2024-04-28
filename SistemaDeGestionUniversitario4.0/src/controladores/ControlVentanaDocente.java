package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Docente;
import vistas.VentanaUsDocente;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlVentanaDocente {

    Serializador serializador;
    ArrayList<Curso> cursos;

    public ControlVentanaDocente() {
        serializador = new Serializador();
        cursos = serializador.leerCursos();
        System.out.println(cursos.size());
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void abrirVentana(Docente docente) {
        Docente doc = docente;
        VentanaUsDocente ventanaD = new VentanaUsDocente();
        ventanaD.informacionDocente(docente);
    }
  public ArrayList<Curso> conseguirCursosEstudiante(Docente docente) {
      ArrayList<Curso> cursosA = new ArrayList<>();
      for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getId()==docente.getId()) {
                cursosA.add(cursos.get(i));
                System.out.println(cursosA.size());
            }
        }
      return cursosA;
    }
}
