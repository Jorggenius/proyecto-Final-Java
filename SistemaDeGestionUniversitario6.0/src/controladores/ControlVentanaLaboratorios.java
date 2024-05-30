/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import java.util.ArrayList;
import modelo.Curso;
import modelo.Laboratorio;
import Singleton.Singleton;
import excepciones.LabNoEditado;
import excepciones.LabNoEleminado;
import javax.swing.JOptionPane;
import modelo.Puesto;
/**
 *
 * @author JORGE
 */
public class ControlVentanaLaboratorios {
    ArrayList<Laboratorio> labs;
    ArrayList<Curso> cursos;
    
    public ControlVentanaLaboratorios() {
        labs = Singleton.getInstancia().getLabs();
        cursos = Singleton.getInstancia().getCursos();
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


    public boolean crearLaboratorio(Laboratorio lab) {
       if(labs.contains(lab)){
           return false;
       }else {
           labs.add(lab);
           Singleton.getInstancia().escribirObjetoLab();
           return true;
       }
        
    }

    public Laboratorio buscarLaboratorio(int id) {
        for (int i = 0; i < labs.size(); i++) {
            if (id == labs.get(i).getIdLaboratorio()) {
                return labs.get(i);
            }
        }
        return null;
    }
    
    public void editarLaboratorio(int idLaboratorio, int numeroPersonas)throws LabNoEditado{
        boolean aux = false;
            for (int i = 0; i < labs.size(); i++) {
                if(labs.get(i).getIdLaboratorio() == idLaboratorio){
                    labs.get(i).setNumeroPersonas(numeroPersonas);
                    labs.get(i).setPuestos(arrayPuestosLaboratotios(numeroPersonas));
                    Singleton.getInstancia().escribirObjetoLab();
                    JOptionPane.showMessageDialog(null, "El curso fue editado");
                    aux = true;
                }
        }
        if(!aux){
            throw new LabNoEditado();
        }
    }
    
    public void eliminarLaboratorio(int id) throws LabNoEleminado{
        boolean aux = false;
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getIdLaboratorio() == id ){
                labs.remove(i);
                JOptionPane.showMessageDialog(null, "Este curso fue eliminado");
                Singleton.getInstancia().escribirObjetoLab();
                aux = true;
            }
        }
        if(!aux){
            throw new LabNoEleminado();
        }
    }
    
     public String contadorIdLabs() {
        String contador = "00" + String.valueOf(labs.size() + 1);
//        contIdsLabs++;
        return contador;
    }
     
     
    public ArrayList<Puesto> arrayPuestosLaboratotios(int numeroPersonas) {
        ArrayList<Puesto> puestosLab = new ArrayList<>();
        for (int i = 0; i < numeroPersonas; i++) {
            Puesto puesto = new Puesto(i + 1, false);
            puestosLab.add(puesto);
        }
        return puestosLab;
    }
    
  
}
