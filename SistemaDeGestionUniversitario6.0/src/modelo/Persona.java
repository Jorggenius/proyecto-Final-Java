package modelo;

import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Persona extends Usuario {

    protected Date birthDate;

    public Persona(Date birthDate, String nombre, int id, String contraseña) {
        super(nombre, id, contraseña);

        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
