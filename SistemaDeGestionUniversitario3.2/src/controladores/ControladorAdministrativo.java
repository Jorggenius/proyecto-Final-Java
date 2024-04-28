package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControladorAdministrativo {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControladorAdministrativo() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

    public boolean agregarAdmin(Usuario e) {
        Administrativo aux = (Administrativo) buscarAdmin(e.getId());
        if (aux == null) {
            usuarios.add(e);
            serializador.escribirUsuarios(usuarios);
            return true;
        }
        return false;
    }

    public Usuario buscarAdmin(int id) {
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
