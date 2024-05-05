/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
import modelo.Usuario;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlTablaAdministrativo {

    ArrayList<Usuario> usuarios;

    public ControlTablaAdministrativo() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }


    public ArrayList<Administrativo> listaUsuarioAdmins() {
        ArrayList<Administrativo> admins = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Administrativo) {
                Administrativo admin = (Administrativo) usuarios.get(i);
                admins.add(admin);
            }
        }
        return admins;
    }
}
