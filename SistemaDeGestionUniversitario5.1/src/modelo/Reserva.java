/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Reserva implements Serializable{
    
    private LocalDate diaReserva;
    private int idLab;
     private LocalTime horaInicio;
    private LocalTime horaFinal;

    public Reserva(LocalDate diaReserva, int idLab, LocalTime horaInicio, LocalTime horaFinal) {
        this.diaReserva = diaReserva;
        this.idLab = idLab;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public LocalDate getDiaReserva() {
        return diaReserva;
    }

    public void setDiaReserva(LocalDate diaReserva) {
        this.diaReserva = diaReserva;
    }

    public int getIdLab() {
        return idLab;
    }

    public void setIdLab(int idLab) {
        this.idLab = idLab;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    
   
            
   
    
    
    
}
