package modelo;

/**
 *
 * @author JORGE
 */
public class Estudiante extends Persona {
    private String programa;

    public Estudiante(int birthDate, String nombre, int id,String conmtraseña, String programa) {
        super(birthDate , nombre, id, conmtraseña);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
   
}
