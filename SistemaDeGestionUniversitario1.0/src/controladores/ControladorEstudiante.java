/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Estudiante;

/**
 *
 * @author JORGE
 */
public class ControladorEstudiante {
    ControladorPrincipal controladorPrincipal;

    public ControladorEstudiante(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
    }
     
    public void agregarEstudiante(Estudiante estudiante){
        controladorPrincipal.agregarEstudiante(estudiante);
    }
    
}
