/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author JORGE
 */
public class Curso implements Serializable{
    private int id;
    private Docente docente;
    private ArrayList<Estudiante> estudiantes;
    private String materia;
    private ArrayList<Horario> horarios;
    private String jornada;
    private int periodo;
    private String programa;
    private ArrayList<Nota> notas;

    public Curso(Docente docente, String materia, String jornada, int periodo, String programa, int id) {
        this.docente = docente;
        this.materia = materia;
        this.jornada = jornada;
        this.periodo = periodo;
        this.programa = programa;
        this.id = id;
        horarios = new ArrayList<>();
        estudiantes = new ArrayList<>();
        notas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
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

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }
    
  
}
