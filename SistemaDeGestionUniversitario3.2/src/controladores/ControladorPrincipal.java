package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
import modelo.Administrativo;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Horario;
import modelo.Laboratorio;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 *//**
 *
 * @author JORGE
 */
public class ControladorPrincipal {

    int contIds = 0;
    int contIdsCursos = 0;
    int contIdsLabs = 0;
    Serializador serializador;
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    ArrayList<Laboratorio> labs;
    
   

    public ControladorPrincipal() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
//        cursos = serializador.leerCursos();
//        labs = serializador.leerLaboratorios();
        
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getContIds() {
        return contIds;
    }

    public void setContIds(int contIds) {
        this.contIds = contIds;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public int getContIdsCursos() {
        return contIdsCursos;
    }

    public void setContIdsCursos(int contIdsCursos) {
        this.contIdsCursos = contIdsCursos;
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

    public ArrayList<Administrativo> listaUsuarioAdmins() {
        ArrayList<Administrativo> admins = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Administrativo) {
                Administrativo admin = (Administrativo) usuarios.get(i);
                admins.add(admin);
            }
        }
        return admins;
    }

    public ArrayList<AdminLab> listaUsuarioAdminLabs() {
        ArrayList<AdminLab> adminlabs = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof AdminLab) {
                AdminLab adminLab = (AdminLab) usuarios.get(i);
                adminlabs.add(adminLab);
            }
        }
        return adminlabs;
    }

    public Usuario validarUsuario(String usuario, String contraseña) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(usuarios.get(i).getNombre()) && contraseña.equals(usuarios.get(i).getContraseña())) {
                return usuarios.get(i);
            }
        }
        return null;
    }
//    public void validarNuevaContraseña(String usuario, String contraseña, String nuevaContraseña) {
//        for (int i = 0; i < usuarios.size(); i++) {
//            if (usuario.equals(usuarios.get(i).getNombre()) && contraseña.equals(usuarios.get(i).getContraseña())) {
//                 usuarios.get(i).setContraseña(nuevaContraseña);
//                  usuarios.get(i).setCambioContraseña(true);
//            }
//        }
       
//    }

    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
        contIds++;
        return contador;
    }

    public String contadorIdCursos() {
        String contador = "00" + String.valueOf(cursos.size() + 1);
        contIdsCursos++;
        return contador;
    }
    
    public String contadorIdLabs() {
        String contador = "00" + String.valueOf(labs.size() + 1);
        contIdsLabs++;
        return contador;
    }

//    public boolean agregarCurso(Curso curso) {
//        boolean aux = buscarCurso(curso);
//        if (aux) {
//            cursos.add(curso);
//            
//            return true;
//        }
//        return false;
//    }
//
//    public boolean buscarCurso(Curso curso) {
//        for (int i = 0; i < cursos.size(); i++) {
//            if (curso.getPrograma().equals(cursos.get(i).getPrograma())
//                    && curso.getJornada().equals(cursos.get(i).getJornada())
//                    && curso.getPeriodo() == cursos.get(i).getPeriodo()
//                    && curso.getMaterial().equals(cursos.get(i).getMaterial())) {
//                return false;
//            }
//        }
//        return true;
//    }
    public ArrayList<Curso> obtenerCursos(){
//    ArrayList<Curso> cursos = this.cursos;
    return cursos;
    }
}
