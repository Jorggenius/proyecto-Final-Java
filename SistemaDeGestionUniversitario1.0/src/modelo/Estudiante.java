/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JORGE
 */
public class Estudiante {
    private String nombre;
    private int id;
    private int birddata;
    private String contraseña;

    public Estudiante(String nombre, int id, int birddata, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.birddata = birddata;
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

    public int getBirddata() {
        return birddata;
    }

    public void setBirddata(int birddata) {
        this.birddata = birddata;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
