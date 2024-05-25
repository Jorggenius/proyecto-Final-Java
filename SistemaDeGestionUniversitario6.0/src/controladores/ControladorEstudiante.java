package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import Singleton.Singleton;
import excepciones.ImposibleBorrar;
import excepciones.ImposibleEditar;
import excepciones.NoEncuentra;
import excepciones.NoIngresadoIdExistenteException;
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

    public void agregarEstudiante(Usuario e) throws NoIngresadoIdExistenteException {
        Estudiante aux = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == e.getId()) {
                aux = (Estudiante) usuarios.get(i);
            }
        }
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
        } else {
            throw new NoIngresadoIdExistenteException();
        }
    }

    public Usuario buscarEstudiante(int id) throws NoEncuentra {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        throw new NoEncuentra();
    }

    public void editarEstudiante(int id, String nombre, String programa, Date birdDate, String contraseña) throws ImposibleEditar {
        boolean encontrado = false;
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
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new ImposibleEditar();
        }
    }

    public void borrarEstudiante(int id) throws ImposibleBorrar{
        boolean borrado = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                borrado = true;
            }
        }
        if(!borrado){
            throw new ImposibleBorrar();
        }
    }

    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
        return contador;
    }
}
