/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Laboratorio;
import modelo.Puesto;
/**
 *
 * @author JORGE
 */
public class ControlVentanaListaPuestos {
    
    ArrayList<Laboratorio> labs;
    
    public ControlVentanaListaPuestos() {
        labs = Singleton.getInstancia().getLabs();
    }
    
    public Laboratorio conseguirLab(int idLab){
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getIdLaboratorio() == idLab){
                System.out.println(" Este es el size de los puestos " + labs.get(i).getPuestos().size());
                return labs.get(i);
            }
        }
        return null;
    }
    
    public Puesto conseguirPuesto(int idLab, int idPuesto){
        Laboratorio lab = conseguirLab(idLab);
        for (int i = 0; i < lab.getPuestos().size(); i++) {
            if(lab.getPuestos().get(i).getIdPuesto() == idPuesto){
                return lab.getPuestos().get(i);
            }
        }
        return null;
    }
}
