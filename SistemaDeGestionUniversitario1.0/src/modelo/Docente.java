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
    private int birdData;
    private String contraseña;

    public Docente(String nombre, int id, String asignatura, int birdData, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.asignatura = asignatura;
        this.birdData = birdData;
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

    public int getBirdData() {
        return birdData;
    }

    public void setBirdData(int birdData) {
        this.birdData = birdData;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
