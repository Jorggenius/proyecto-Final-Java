/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author JORGE
 */
public class FechaIncorrecta extends Exception {

    public FechaIncorrecta() {
        super("La fecha debe de ser \n posterior a la fecha \n actual");
    }

}
