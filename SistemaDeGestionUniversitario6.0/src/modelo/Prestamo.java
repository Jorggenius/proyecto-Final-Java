/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author JORGE
 */
public class Prestamo implements Serializable{
    Estudiante estudiante;
    private LocalDate diaReserva;
    private int idLab;
    private LocalTime horaInicio;
    private LocalTime horaFinal;

    public Prestamo(Estudiante estudiante, int idLab,LocalDate diaReserva , LocalTime horaInicio, LocalTime horaFinal) {
        this.idLab = idLab;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.estudiante = estudiante;
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

    public LocalDate getDiaReserva() {
        return diaReserva;
    }

    public void setDiaReserva(LocalDate diaReserva) {
        this.diaReserva = diaReserva;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
}
