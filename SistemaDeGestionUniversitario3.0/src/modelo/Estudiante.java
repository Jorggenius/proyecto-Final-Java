package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Estudiante extends Persona {
    private String programa;
    private ArrayList<Nota> notas;

    public Estudiante(Date birthDate, String nombre, int id,String conmtraseña, String programa) {
        super(birthDate , nombre, id, conmtraseña);
        this.programa = programa;
        notas = new ArrayList<>();
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
   
}
