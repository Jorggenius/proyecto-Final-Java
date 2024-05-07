package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
import modelo.Usuario;
import Singleton.Singleton;
import java.util.Date;
/**
 *
 * @author JORGE
 */
public class ControladorAdminLab {

    ArrayList<Usuario> usuarios;

    public ControladorAdminLab() {
        usuarios = Singleton.getInstancia().getUsuarios();

    }

    public boolean agregarAdminLab(Usuario e) {
        AdminLab aux = (AdminLab) buscarAdminLab(e.getId());
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
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
    
    public boolean editarAdminLab(int id, String nombre, Date birthDate, String contraseña) {
        AdminLab adminLab;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                adminLab = (AdminLab) usuarios.get(i);
                adminLab.setNombre(nombre);
                adminLab.setBirthDate(birthDate);
                adminLab.setContraseña(contraseña);
                usuarios.set(i, adminLab);
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
