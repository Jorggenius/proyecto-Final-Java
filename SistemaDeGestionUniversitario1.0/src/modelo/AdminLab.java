/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JORGE
 */
public class AdminLab {
    private String nombre;
    private int id;
    private int birdData;
    private String contraseña;

    public AdminLab(String nombre, int id, int birdData, String contraseña) {
        this.nombre = nombre;
        this.id = id;
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
