/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author JORGE
 */
public class ErrorContraseña extends Exception{

    public ErrorContraseña() {
        super("No puede ser \n la misma contraseña");
    }
    
    
}
