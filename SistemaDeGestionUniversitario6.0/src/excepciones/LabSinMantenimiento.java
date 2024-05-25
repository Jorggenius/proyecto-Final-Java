/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author JORGE
 */
public class LabSinMantenimiento extends Exception{

    public LabSinMantenimiento() {
        super("El laboratorio no tiene mantenimiento programaado");
    }
    
}
