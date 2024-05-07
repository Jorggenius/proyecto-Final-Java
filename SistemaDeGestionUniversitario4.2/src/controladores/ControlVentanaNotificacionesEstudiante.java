/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import Singleton.Singleton;
import java.util.ArrayList;
import modelo.Usuario;
/**
 *
 * @author JORGE
 */
public class ControlVentanaNotificacionesEstudiante {
    
    ArrayList<Usuario> usuarios;
    

    public ControlVentanaNotificacionesEstudiante() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }
    
    
}
