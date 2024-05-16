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
public class ControlVentanaGestionarLaboratorio {
    
    ArrayList<Laboratorio> labs;
    
    public ControlVentanaGestionarLaboratorio() {
        labs = Singleton.getInstancia().getLabs();
    }
    
    
    
}
