/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Usuario;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlPanelCambiarContraseña {

    ArrayList<Usuario> usuarios;

    public ControlPanelCambiarContraseña() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    public void validarNuevaContraseña(String usuario, String contraseña, String nuevaContraseña) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(usuarios.get(i).getNombre()) && contraseña.equals(usuarios.get(i).getContraseña())) {
                usuarios.get(i).setContraseña(nuevaContraseña);
                usuarios.get(i).setCambioContraseña(true);
                Singleton.getInstancia().escribirObjetoUsuario();
            }
        }
    }
}
