package controladores;

import java.util.ArrayList;
import modelo.Curso;
import modelo.Docente;
import vistas.VentanaUsDocente;
import Singleton.Singleton;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JORGE
 */
public class ControlVentanaDocente {

    ArrayList<Curso> cursos;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = validacionPeriodo();

    public ControlVentanaDocente() {
        cursos = Singleton.getInstancia().getCursos();
        System.out.println(cursos.size());
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

//    public void abrirVentana(Docente docente) {
//        Docente doc = docente;
//        VentanaUsDocente ventanaD = new VentanaUsDocente();
//        ventanaD.informacionDocente(docente);
//    }
    public ArrayList<Curso> conseguirCursosDocente(Docente docente) {
        ArrayList<Curso> cursosA = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getId() == docente.getId()
                    && cursos.get(i).getPeriodo() == validacionPeriodo()) {
                cursosA.add(cursos.get(i));
                System.out.println(cursosA.size());
            }
        }
        return cursosA;
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
