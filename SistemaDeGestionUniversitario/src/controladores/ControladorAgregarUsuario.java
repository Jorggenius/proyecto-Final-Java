/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author JORGE
 */
public class ControladorAgregarUsuario {
    ControladorPanelPrincipal controladorPP;
    
    public ControladorAgregarUsuario() {
        controladorPP = new ControladorPanelPrincipal();
    }
    
    public boolean agregarEstudiante(String nombre, String apellido, int id, int año, String contraseña){
        controladorPP.agregarEstudiante(nombre, apellido, id, año, contraseña);
        return true;
    }
    
    public void agregarMaterias(int id, String materia1, String materia2, String materia3){
        controladorPP.agregarMateriasEstudiante(id, materia1, materia2, materia3);
    }
    
}
