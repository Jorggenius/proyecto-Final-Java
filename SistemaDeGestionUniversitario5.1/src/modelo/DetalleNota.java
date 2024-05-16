/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author JORGE
 */
public class DetalleNota implements Serializable{
    private Estudiante Estudiante;
    private float  nota;
    private boolean calificado;

    public DetalleNota(Estudiante Estudiante, float nota, boolean calificado) {
        this.Estudiante = Estudiante;
        this.nota = nota;
        this.calificado = calificado;
    }

    public Estudiante getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(Estudiante Estudiante) {
        this.Estudiante = Estudiante;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isCalificado() {
        return calificado;
    }

    public void setCalificado(boolean calificado) {
        this.calificado = calificado;
    }
    
    
    
    
}
