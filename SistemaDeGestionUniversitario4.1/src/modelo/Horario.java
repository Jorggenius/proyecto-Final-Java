/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalTime;
import java.io.Serializable;

/**
 *
 * @author JORGE
 */
public class Horario implements Serializable{

    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFinal;

    public Horario(LocalTime horaInicio, LocalTime horaFinal, String dia) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.dia = dia;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

}
