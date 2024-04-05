/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class ControladorPrincipal {
    ArrayList<Estudiante> ests;

    public ControladorPrincipal() {
        ests = new ArrayList<>();
    }

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }
    /**
     * this is the method to add to a object to the ArrayList ests
     * @param estudiante
     * @return 
     */
      public boolean agregarEstudiante(Estudiante e){
         Estudiante aux = buscarEstudiante(e.getId());
        if(aux == null){
            ests.add(e);
            return true;
        }
        return false; 
    }
    
     public Estudiante buscarEstudiante(int id){
        for (int i = 0; i < ests.size(); i++) {
            if(ests.get(i).getId() == id){
                return ests.get(i);
            }
        }
        return null;
    }
     
    public Estudiante validarAcceso(String usuario, String contraseña){
        for (int i = 0; i < ests.size(); i++) {
            if(usuario.equals(ests.get(i).getNombre()) && contraseña.equals(ests.get(i).getContraseña())){
                return ests.get(i);
            }
        }
        return null;
    }
}
