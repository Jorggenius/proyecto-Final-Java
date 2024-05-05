package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
import modelo.Usuario;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControladorAdministrativo {

    ArrayList<Usuario> usuarios;

    public ControladorAdministrativo() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public boolean agregarAdmin(Usuario e) {
        Administrativo aux = (Administrativo) buscarAdmin(e.getId());
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
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
