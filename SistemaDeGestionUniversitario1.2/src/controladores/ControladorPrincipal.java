/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class ControladorPrincipal {
    ArrayList<Estudiante> ests;
    ArrayList<Docente> docens;
    ArrayList<Administrativo> admins;

    public ControladorPrincipal() {
        ests = new ArrayList<>();
        docens = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }

    public ArrayList<Docente> getDocens() {
        return docens;
    }

    public void setDocens(ArrayList<Docente> docens) {
        this.docens = docens;
    }

    public ArrayList<Administrativo> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Administrativo> admins) {
        this.admins = admins;
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
     /**
      * This the method for add Docentes to the ArrayList
      * @param docentes =
      * @return 
      */
      public boolean agregaDocente(Docente d){
         Docente aux = buscarDocente(d.getId());
        if(aux == null){
            docens.add(d);
            return true;
        }
        return false; 
    }
    
     public Docente buscarDocente(int id){
        for (int i = 0; i < docens.size(); i++) {
            if(docens.get(i).getId() == id){
                return docens.get(i);
            }
        }
        return null;
    }
     
      /**
       * This the method for add administrativos to the ArrayList
       * @param d
       * @return 
       */
      public boolean agregaAdministrativo(Administrativo a){
         Administrativo aux = buscarAdministrativo(a.getId());
        if(aux == null){
            admins.add(a);
            return true;
        }
        return false; 
    }
    
     public Administrativo buscarAdministrativo(int id){
        for (int i = 0; i < admins.size(); i++) {
            if(admins.get(i).getId() == id){
                return admins.get(i);
            }
        }
        return null;
    }
     
    public boolean validarAcceso(String usuario, String contraseña){
        for (int i = 0; i < ests.size(); i++) {
            if(usuario.equals(ests.get(i).getNombre()) && contraseña.equals(ests.get(i).getContraseña())){
                return true;
            }
        }
        for (int i = 0; i < docens.size() ; i++) {
            if(usuario.equals(docens.get(i).getNombre()) && contraseña.equals(docens.get(i).getContraseña())){
                return true;
            }
        }
        for (int i = 0; i < admins.size() ; i++) {
            if(usuario.equals(admins.get(i).getNombre()) && contraseña.equals(admins.get(i).getContraseña())){
                return true;
            }
        }
        return false;
    }
}
