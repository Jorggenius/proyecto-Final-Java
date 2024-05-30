/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import excepciones.CursoNoEncontrado;
import modelo.Curso;
import java.util.ArrayList;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Usuario;
import vistas.VentanaCursos;
import Singleton.Singleton;
import excepciones.CursoExistente;
import excepciones.CursoNoRemovido;
import excepciones.CursoSInHorarios;
import excepciones.HorarioNoAdmitido;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import modelo.Horario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaCursos {

    VentanaCursos ventanaC;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    LocalDate fechaActual = LocalDate.now();
    int periodoActual = 0;

    public ControlVentanaCursos() {
        usuarios = Singleton.getInstancia().getUsuarios();
        cursos = Singleton.getInstancia().getCursos();

//        ventanaC = new VentanaCursos();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
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

    public void agregarCurso(Curso curso) throws CursoExistente {
        Curso curso1 = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == curso.getId()) {
                curso1 = cursos.get(i);
               

            }
        }
        if (buscarCurso(curso)) {
            if (curso1 == null) {
                cursos.add(curso);
                Singleton.getInstancia().escribirObjetoCurso();
                JOptionPane.showMessageDialog(null, "Curso Creado");
            } else {
                throw new CursoExistente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este curso existe");
        }
    }
////////////////////////Aqui se valida que el curso sea o de programa o periodo o programa diferente

    public boolean buscarCurso(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (curso.getPrograma().equals(cursos.get(i).getPrograma())
                    && curso.getJornada().equals(cursos.get(i).getJornada())
                    && curso.getPeriodo() == cursos.get(i).getPeriodo()
                    && curso.getMateria().equals(cursos.get(i).getMateria())) {
                return false;
            }
        }
        return true;
    }
///////////////////////Aqui se encuentra el curso para desplegar informacion

    public Curso buscarCursoPanel(int idcurso) throws CursoNoEncontrado {
        boolean aux = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idcurso) {
                aux = true;
                return cursos.get(i);
            }
        }
        if (!aux) {
            throw new CursoNoEncontrado();
        }
        return null;
    }

    public void borrarCursos(int idCurso) throws CursoNoRemovido {
        boolean aux = false;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                aux = true;
                cursos.remove(i);
                JOptionPane.showMessageDialog(null, "El curso ha sido eliminado");
            }
        }
        if (!aux) {
            throw new CursoNoRemovido();
        }

    }

    public String contadorIdCursos() {
        String contador = "00" + String.valueOf(cursos.size() + 1);
//        contIdsCursos++;
        return contador;
    }

    public boolean validarHorarioDocente(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getDocente().getNombre().equals(curso.getDocente().getNombre())) {
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validarHorariosEstudiante(Horario horario1, Horario horario2, Estudiante estudiante) {
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursos.get(i).getEstudiantes().size(); j++) {
                if (cursos.get(i).getEstudiantes().get(j).getId() == estudiante.getId()) {
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////    

    public void matricularEsctudiante(int indexEstudiante, int idCurso) throws CursoSInHorarios {
        Estudiante estudiante = listaUsuarioEsts().get(indexEstudiante);
        System.out.println("este es el Id de curso " + idCurso);
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso
                    && cursos.get(i).getHorarios().size() > 1) {
                if (cursos.get(i).getEstudiantes().contains(estudiante)) {
                    JOptionPane.showMessageDialog(null, "Imposible inscribir\n el estudiante ya esta inscrito");
                } else {
//                    if (verificarCursos(estudiante, idCurso)) {
                    cursos.get(i).getEstudiantes().add(estudiante);
//                    }else{
//                        JOptionPane.showMessageDialog(null, "imposible inscribir al estudiante\nse crusan los horarios");
//                    }
                }
            } else {
                throw new CursoSInHorarios();
            }
        }
    }

    public boolean verificarCursos(Estudiante estudiante, int idCurso) {
        ArrayList<Curso> cursosEst = new ArrayList<>();
        Curso curso = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {
                curso = cursos.get(i);
            }
        }

        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getEstudiantes().contains(estudiante)) {
                if (verificarHorariosEstudiante(curso, cursos.get(i))) {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean verificarHorariosEstudiante(Curso curso, Curso cursoE) {
        for (int i = 0; i < curso.getHorarios().size(); i++) {
            Horario horario = curso.getHorarios().get(i);
            for (int j = 0; j < cursoE.getHorarios().size(); j++) {
                if (horario.getDia().equals(cursoE.getHorarios().get(j).getDia())) {
                    if (horario.getHoraInicio().isAfter(cursoE.getHorarios().get(j).getHoraFinal())
                            || horario.getHoraFinal().isBefore(cursoE.getHorarios().get(j).getHoraInicio())) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public void borrarEstudianteCurso(int indexEstudiante, int idCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == idCurso) {

            }
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////    

    public void agregarHorarios(Docente docente, int id, Horario horario) throws HorarioNoAdmitido {

        boolean aux = false;
        for (Curso curso : cursos) {
            if (curso.getDocente().getId() == docente.getId()) {
                ArrayList<Horario> horarios = curso.getHorarios();
                boolean horarioConflictivo = false;
                for (Horario h : horarios) {
                    if (h.getDia().equals(horario.getDia())) {
                        if (horario.getHoraInicio().isBefore(h.getHoraInicio().plusHours(1))
                                && horario.getHoraInicio().plusHours(1).isAfter(h.getHoraInicio())) {
                            horarioConflictivo = true;
                            break;
                        }
                    }
                }
                if (!horarioConflictivo) {
                    curso.getHorarios().add(horario);
                    Singleton.getInstancia().escribirObjetoCurso();
                    aux = true;
                    break;
                }
            }
        }
        if (!aux) {
            throw new HorarioNoAdmitido();
        }
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

//        boolean aux = false;
//        ArrayList<Horario> horarios = new ArrayList<>();
//        int size = 0;
//        int compare = 0;
//        for (int i = 0; i < cursos.size(); i++) {
//            if (cursos.get(i).getDocente().getId() == docenete.getId()) {
//                horarios = cursos.get(i).getHorarios();
//                System.out.println("este es el array horarios " + horarios.size());
//                size = horarios.size();
//                System.out.println("Este es el size en el for " + size);
//                for (int j = 0; j < horarios.size(); j++) {
//                    if (horarios.get(j).getDia().equals(horario.getDia())) {
//                        if (horario.getHoraInicio() != horarios.get(j).getHoraInicio()
//                                && horario.getHoraInicio().plusHours(1) != horarios.get(j).getHoraInicio()) {
//                            System.out.println("este es el horario comparado " + horarios.get(j).getHoraInicio());
//                            compare = +1;
//                        }
//                    }
//                }
//            }
//        }
//        if (size == compare) {
//            System.out.println(" este es compare en el if " + compare);
//            System.out.println(" este es size en el if " + size);
//            for (int i = 0; i < cursos.size(); i++) {
//                if (cursos.get(i).getId() == id) {
//                    cursos.get(i).getHorarios().add(horario);
//                    Singleton.getInstancia().escribirObjetoCurso();
//                    aux = true;
//                }
//
//            }
//        }
//        if (!aux) {
//            throw new HorarioNoAdmitido();
//        }
