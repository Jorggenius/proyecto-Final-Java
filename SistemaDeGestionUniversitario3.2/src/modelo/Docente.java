package modelo;

import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Docente extends Persona {

    private String asignatura;

    public Docente(String asignatura,Date birthDate, String nombre, int id, String contraseña) {
        super(birthDate, nombre, id, contraseña);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

}
