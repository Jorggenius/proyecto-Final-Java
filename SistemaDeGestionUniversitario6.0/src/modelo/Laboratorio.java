/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Laboratorio implements Serializable {

    private int IdLaboratorio;
    private int numeroPersonas;
    private ArrayList<Curso> cursos;
    private ArrayList<Reserva> reservas;
    private ArrayList<Horario> horas;
    private ArrayList<Puesto> puestos;
    private int[] horasDia;
    private boolean mantenimiento;
    private Date fechaMantenimiento;

    public Laboratorio(int IdLaboratorio, int numeroPersonas) {
        this.IdLaboratorio = IdLaboratorio;
        this.numeroPersonas = numeroPersonas;
        puestos = arrayPuestosLaboratotios(numeroPersonas);
        reservas = new ArrayList<>();
        horasDia = new int[15];
        horas = new ArrayList<>();
        cursos = new ArrayList<>();

    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public int getIdLaboratorio() {
        return IdLaboratorio;
    }

    public void setIdLaboratorio(int IdLaboratorio) {
        this.IdLaboratorio = IdLaboratorio;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int[] getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int[] horasDia) {
        this.horasDia = horasDia;
    }

    public ArrayList<Horario> getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<Horario> horas) {
        this.horas = horas;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public void setPuestos(ArrayList<Puesto> puestos) {
        this.puestos = puestos;
    }

    public ArrayList<Puesto> arrayPuestosLaboratotios(int numeroPersonas) {
        ArrayList<Puesto> puestosLab = new ArrayList<>();
        for (int i = 0; i < numeroPersonas; i++) {
            Puesto puesto = new Puesto(i + 1, mantenimiento);
            puestosLab.add(puesto);
        }
        return puestosLab;
    }
}
