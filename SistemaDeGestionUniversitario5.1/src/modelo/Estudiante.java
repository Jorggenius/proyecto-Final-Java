package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Estudiante extends Persona {
    private String programa;
    private Reserva reserva;
    private boolean tieneReserva;
   

    public Estudiante(Date birthDate, String nombre, int id,String conmtraseña, String programa) {
        super(birthDate , nombre, id, conmtraseña);
        this.programa = programa;
        reserva = new Reserva(LocalDate.MIN, id, LocalTime.MIN, LocalTime.MIN);
        tieneReserva = false;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public boolean isTieneReserva() {
        return tieneReserva;
    }

    public void setTieneReserva(boolean tieneReserva) {
        this.tieneReserva = tieneReserva;
    }
    
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

  
    
   
}
