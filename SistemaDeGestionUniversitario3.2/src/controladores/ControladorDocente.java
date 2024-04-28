package controladores;

import java.util.ArrayList;
import modelo.Docente;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControladorDocente {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControladorDocente() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

    public boolean agregarDocente(Usuario e) {
        Docente aux = (Docente) buscarDocente(e.getId());
        if (aux == null) {
            usuarios.add(e);
            serializador.escribirUsuarios(usuarios);
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

    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
//        contIds++;
        return contador;
    }
}
