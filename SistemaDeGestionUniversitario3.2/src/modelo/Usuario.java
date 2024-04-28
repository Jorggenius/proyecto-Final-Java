package modelo;
import java.io.Serializable;
/**
 *
 * @author JORGE
 */
public class Usuario implements Serializable{

    protected String nombre;
    protected int id;
    protected String contraseña;
    protected boolean cambioContraseña;

    public Usuario(String nombre, int id, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isCambioContraseña() {
        return cambioContraseña;
    }

    public void setCambioContraseña(boolean cambioContraseña) {
        this.cambioContraseña = cambioContraseña;
    }
    
}
