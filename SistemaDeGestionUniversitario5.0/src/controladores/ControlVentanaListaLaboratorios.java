/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Laboratorio;

/**
 *
 * @author JORGE
 */
public class ControlVentanaListaLaboratorios {

    ArrayList<Laboratorio> labs;

    public ControlVentanaListaLaboratorios() {
        labs = Singleton.getInstancia().getLabs();
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }
    
    public Laboratorio conseguirLaboratorio(int id){
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getIdLaboratorio() == id){
                return labs.get(i);
            }
        }
        return null;
    }
}
