/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControladorPanelPrincipal {
    private Usuario admiSistema = new Usuario(1, 9999, "Administrador", "Sistema", 2024, "xxxx");
    
    ArrayList<Usuario> usuarios;

    public ControladorPanelPrincipal() {
        usuarios = new ArrayList<>();
        usuarios.add(admiSistema);
    }
    
    //metodo para acceder al sistema 
    public boolean accesoSistema(String usuario, String contraseña){
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuario.equals(usuarios.get(i).getFirstName()) && contraseña.equals(usuarios.get(i).getContraseña())){
            return true;
            }
            
        }
        return false;
    }
    
    public void agregarEstudiante(String nombre, String apellido, int id, int año, String contraseña){
        int tipe = 3;
        Usuario auxAgregar = new Usuario(tipe, id, nombre, apellido, año, contraseña);
        usuarios.add(auxAgregar);              
    }
    public void agregarMateriasEstudiante(int id, String materia1, String materia2, String materia3){
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(id).getId()== id){
                usuarios.get(id).getCursos().add(materia1);
                usuarios.get(id).getCursos().add(materia2);
                usuarios.get(id).getCursos().add(materia3);               
            }
        }
    }
    
    
}