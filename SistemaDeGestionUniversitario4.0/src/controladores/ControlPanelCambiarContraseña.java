/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlPanelCambiarContraseña {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControlPanelCambiarContraseña() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

    public void validarNuevaContraseña(String usuario, String contraseña, String nuevaContraseña) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(usuarios.get(i).getNombre()) && contraseña.equals(usuarios.get(i).getContraseña())) {
                usuarios.get(i).setContraseña(nuevaContraseña);
                usuarios.get(i).setCambioContraseña(true);
                serializador.escribirUsuarios(usuarios);
            }
        }

    }
}
