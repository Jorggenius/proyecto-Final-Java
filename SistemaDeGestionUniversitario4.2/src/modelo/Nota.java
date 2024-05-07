/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author JORGE
 */
public class Nota implements Serializable{
    private String razon;
    private ArrayList<DetalleNota> detalles;
    private float porcentage;

    public Nota(String razon, float porcentage,ArrayList<DetalleNota> detalles) {
        this.razon = razon;
        this.porcentage = porcentage;
        this.detalles = detalles;
    }

    public ArrayList<DetalleNota> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleNota> detalles) {
        this.detalles = detalles;
    }

   

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

  

  

    public float getPorcentage() {
        return porcentage;
    }

    public void setPorcentage(float porcentage) {
        this.porcentage = porcentage;
    }
    
    public void calificarNota(String nombre, float nota){
        for (int i = 0; i < detalles.size(); i++) {
            if(detalles.get(i).getEstudiante().getNombre().equals(nombre)){
            detalles.get(i).setNota(nota);
            }
        }
    } 
}
