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
public class Curso {
    private int id;
    private String tipe;
    private String nombreDocente;
    private ArrayList<Usuario> estudiantesCurso;
    private String materia;
    private int [] horario = new int[2];
    private String jornada;
    private int periodo;
    private String programa;
   //Constructor
    public Curso(int id, String tipe, String nombreDocente, ArrayList<Usuario> estudiantesCurso, String materia, String jornada, int periodo, String programa) {
        this.id = id;
        this.tipe = tipe;
        this.nombreDocente = nombreDocente;
        this.estudiantesCurso = estudiantesCurso;
        this.materia = materia;
        this.jornada = jornada;
        this.periodo = periodo;
        this.programa = programa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public ArrayList<Usuario> getEstudiantesCurso() {
        return estudiantesCurso;
    }

    public void setEstudiantesCurso(ArrayList<Usuario> estudiantesCurso) {
        this.estudiantesCurso = estudiantesCurso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int[] getHorario() {
        return horario;
    }

    public void setHorario(int[] horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
    
    
}
