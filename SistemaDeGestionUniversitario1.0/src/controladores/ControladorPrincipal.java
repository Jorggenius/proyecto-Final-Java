/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
import modelo.Administrativo;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Laboratorio;

/**
 *
 * @author JORGE
 */
public class ControladorPrincipal {
    private Administrativo admiSistema = new Administrativo("Administrador", 0000, 2024, "xxxx");

    ArrayList<Estudiante> ests;
    ArrayList<Docente> docs;
    ArrayList<Administrativo> admis;
    ArrayList<AdminLab> adlabs;
    ArrayList<Curso> cursos;
    ArrayList<Laboratorio> labs ;
    

    public ControladorPrincipal() {
        ests = new ArrayList<>();
        docs = new ArrayList<>();
        admis = new ArrayList<>();
        adlabs = new ArrayList<>();
        cursos = new ArrayList<>();
        labs = new ArrayList<>();
    }
    
    public Administrativo getAdmiSistema() {
        return admiSistema;
    }

    public void setAdmiSistema(Administrativo admiSistema) {
        this.admiSistema = admiSistema;
    }

 

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }

    public ArrayList<Docente> getDocs() {
        return docs;
    }

    public void setDocs(ArrayList<Docente> docs) {
        this.docs = docs;
    }

    public ArrayList<Administrativo> getAdmis() {
        return admis;
    }

    public void setAdmis(ArrayList<Administrativo> admis) {
        this.admis = admis;
    }

    public ArrayList<AdminLab> getAdlabs() {
        return adlabs;
    }

    public void setAdlabs(ArrayList<AdminLab> adlabs) {
        this.adlabs = adlabs;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }
    
    
    
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
    
    
     public boolean accesoSistema(String usuario, String contraseña){
        if(usuario.equals(admiSistema.getNombre()) && contraseña.equals(admiSistema.getContraseña())){
            return true;
            }
        return false;
    }
     
     
    
}
