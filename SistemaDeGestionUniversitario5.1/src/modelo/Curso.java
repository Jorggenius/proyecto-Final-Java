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
    private String material;
    private Horario horario1;
    private Horario horario2;
    private String jornada;
    private int periodo;
    private String programa;
    private ArrayList<Nota> notas;

    public Curso(Docente docente, String material, Horario horario1, Horario horario2, String jornada, int periodo, String programa, int id) {
        this.docente = docente;
        this.material = material;
        this.horario1 = horario1;
        this.horario2 = horario2;
        this.jornada = jornada;
        this.periodo = periodo;
        this.programa = programa;
        this.id = id;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Horario getHorario1() {
        return horario1;
    }

    public void setHorario1(Horario horario1) {
        this.horario1 = horario1;
    }

    public Horario getHorario2() {
        return horario2;
    }

    public void setHorario2(Horario horario2) {
        this.horario2 = horario2;
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
    
  
}
