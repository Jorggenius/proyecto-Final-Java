package controladores;

import java.util.ArrayList;
import modelo.Docente;
import modelo.Usuario;
import Singleton.Singleton;
import java.util.Date;
/**
 *
 * @author JORGE
 */
public class ControladorDocente {

    
    ArrayList<Usuario> usuarios;

    public ControladorDocente() {
        
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public boolean agregarDocente(Usuario e) {
        Docente aux = (Docente) buscarDocente(e.getId());
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
            return true;
        }
        return false;
    }

    public Usuario buscarDocente(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        return null;
    }

     public boolean editarDocente(int id, String nombre, String asignatura, Date birthDate, String contraseña) {
        Docente docente;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                docente = (Docente) usuarios.get(i);
                docente.setNombre(nombre);
                docente.setAsignatura(asignatura);
                docente.setBirthDate(birthDate);
                docente.setContraseña(contraseña);
                usuarios.set(i, docente);
                return true;
            }
        }
        return false;
    }
    
    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
//        contIds++;
        return contador;
    }
}
