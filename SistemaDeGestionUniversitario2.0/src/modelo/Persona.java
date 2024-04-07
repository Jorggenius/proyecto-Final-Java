package modelo;

/**
 *
 * @author JORGE
 */
public class Persona extends Usuario {

    protected int birthDate;

    public Persona(int birthDate, String nombre, int id, String contraseña) {
        super(nombre, id, contraseña);

        this.birthDate = birthDate;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

}
