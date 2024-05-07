package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import Singleton.Singleton;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class ControladorEstudiante {

    ArrayList<Usuario> usuarios;

    public ControladorEstudiante() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public boolean agregarEstudiante(Usuario e) {
        Estudiante aux = (Estudiante) buscarEstudiante(e.getId());
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
            return true;
        }
        return false;
    }

    public Usuario buscarEstudiante(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public boolean editarEstudiante(int id, String nombre, String programa, Date birdDate, String contraseña) {
        Estudiante estudiante;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                estudiante = (Estudiante) usuarios.get(i);
                estudiante.setNombre(nombre);
                estudiante.setPrograma(programa);
                estudiante.setBirthDate(birdDate);
                estudiante.setContraseña(contraseña);
                usuarios.set(i, estudiante);
                Singleton.getInstancia().escribirObjetoUsuario();
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
