package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
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
public class ControladorAdminLab {

    ArrayList<Usuario> usuarios;

    public ControladorAdminLab() {
        usuarios = Singleton.getInstancia().getUsuarios();

    }

    public void agregarAdminLab(Usuario e) throws NoIngresadoIdExistenteException {
        AdminLab aux = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == e.getId()) {
                aux = (AdminLab) usuarios.get(i);
            }
        }
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
        } else {
            throw new NoIngresadoIdExistenteException();
        }
    }

    public Usuario buscarAdminLab(int id) throws NoEncuentra {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        throw new NoEncuentra();
    }

    public void editarAdminLab(int id, String nombre, Date birthDate, String contraseña) throws ImposibleEditar {
        boolean encontrado = false;
        AdminLab adminLab;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                adminLab = (AdminLab) usuarios.get(i);
                adminLab.setNombre(nombre);
                adminLab.setBirthDate(birthDate);
                adminLab.setContraseña(contraseña);
                usuarios.set(i, adminLab);
                Singleton.getInstancia().escribirObjetoUsuario();
                encontrado = true;;
            }
        }
        if (!encontrado) {
            throw new ImposibleEditar();
        }
    }

    public void borrarAdminLab(int id) throws ImposibleBorrar {
        boolean borrado = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                borrado = true;
            }
        }
        if (!borrado) {
            throw new ImposibleBorrar();
        }
    }

    public String contadorId() {
        String contador = "00" + String.valueOf(usuarios.size() + 1);
//        contIds++;
        return contador;
    }
}
