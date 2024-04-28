package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControladorAdminLab {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControladorAdminLab() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();

    }

    public boolean agregarAdminLab(Usuario e) {
        AdminLab aux = (AdminLab) buscarAdminLab(e.getId());
        if (aux == null) {
            usuarios.add(e);
            serializador.escribirUsuarios(usuarios);
            return true;
        }
        return false;
    }

    public Usuario buscarAdminLab(int id) {
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
