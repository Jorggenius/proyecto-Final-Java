/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author JORGE
 */
public class EstudianteNoEliminado extends Exception{

    public EstudianteNoEliminado() {
        super("El estudiante no se pudo eliminar 0\n el estudiante no existe");
    }
    
}
