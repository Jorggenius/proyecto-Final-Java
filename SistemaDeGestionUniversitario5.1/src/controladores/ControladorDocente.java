package controladores;

import java.util.ArrayList;
import modelo.Docente;
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
public class ControladorDocente {

    ArrayList<Usuario> usuarios;

    public ControladorDocente() {

        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public void agregarDocente(Usuario e) throws NoIngresadoIdExistenteException {
        Docente aux = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == e.getId()) {
                aux = (Docente) usuarios.get(i);
            }
        }
        if (aux == null) {
            usuarios.add(e);
            Singleton.getInstancia().escribirObjetoUsuario();
        } else {
            throw new NoIngresadoIdExistenteException();
        }
    }

    public Usuario buscarDocente(int id) throws NoEncuentra {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                return usuarios.get(i);
            }
        }
        throw new NoEncuentra();
    }

    public void editarDocente(int id, String nombre, String asignatura, Date birthDate, String contraseña)throws ImposibleEditar {
        boolean encontrado = false;
        Docente docente;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {
                docente = (Docente) usuarios.get(i);
                docente.setNombre(nombre);
                docente.setAsignatura(asignatura);
                docente.setBirthDate(birthDate);
                docente.setContraseña(contraseña);
                usuarios.set(i, docente);
                Singleton.getInstancia().escribirObjetoUsuario();
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new ImposibleEditar();
        }

    }
    
     public void borrarDocente(int id) throws ImposibleBorrar{
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
