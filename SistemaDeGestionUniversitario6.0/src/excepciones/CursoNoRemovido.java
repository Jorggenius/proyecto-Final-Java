/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author JORGE
 */
public class CursoNoRemovido extends Exception{

    public CursoNoRemovido() {
        super("El curso no fue removido\n O no existe");
    }
    
}
