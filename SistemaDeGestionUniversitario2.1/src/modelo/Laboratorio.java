/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author JORGE
 */
public class Laboratorio {
    private int IdLaboratorio;
    private int numeroPersonas;
    private int[] horasDia;
    private ArrayList<Horario> horas;
    private boolean mantenimiento;

    public Laboratorio(int IdLaboratorio, int numeroPersonas) {
        this.IdLaboratorio = IdLaboratorio;
        this.numeroPersonas = numeroPersonas;
        horasDia = new int [15];
        horas = new ArrayList<>();
        
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
    
    
    
}
