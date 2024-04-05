/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JORGE
 */
public class Docente {
    private String nombre;
    private int id;
    private String asignatura;
    private int BirthDate;
    private String contraseña;

    public Docente(String nombre, int id, String asignatura, int BirthDate, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.asignatura = asignatura;
        this.BirthDate = BirthDate;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(int BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
