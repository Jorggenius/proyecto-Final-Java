package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControladorEstudiante {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControladorEstudiante() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

    public boolean agregarEstudiante(Usuario e) {
        Estudiante aux = (Estudiante) buscarEstudiante(e.getId());
        if (aux == null) {
            usuarios.add(e);
            serializador.escribirUsuarios(usuarios);
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

    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
//        contIds++;
        return contador;
    }
}
