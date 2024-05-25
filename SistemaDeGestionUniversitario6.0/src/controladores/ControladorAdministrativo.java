package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
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
public class ControladorAdministrativo {

    ArrayList<Usuario> usuarios;

    public ControladorAdministrativo() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public void agregarAdmin(Usuario e) throws NoIngresadoIdExistenteException {
        Administrativo aux = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == e.getId()) {
                aux = (Administrativo) usuarios.get(i);
            }
        }
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
        } else {
            throw new NoIngresadoIdExistenteException();
        }
    }

    public Usuario buscarAdmin(int id) throws NoEncuentra {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        throw new NoEncuentra();
    }

    public void editarAdministrativo(int id, String nombre, Date birthDate, String contraseña)throws ImposibleEditar {
        boolean encontrado = false;
        Administrativo administrativo;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                administrativo = (Administrativo) usuarios.get(i);
                administrativo.setNombre(nombre);
                administrativo.setBirthDate(birthDate);
                administrativo.setContraseña(contraseña);
                usuarios.set(i, administrativo);
                Singleton.getInstancia().escribirObjetoUsuario();
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new ImposibleEditar();
        }
    }
    
     public void borrarAdministrativo(int id) throws ImposibleBorrar{
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
//        contIds++;
        return contador;
    }
}
