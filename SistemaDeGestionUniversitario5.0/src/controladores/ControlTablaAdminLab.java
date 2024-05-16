/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
import modelo.Usuario;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlTablaAdminLab {

    ArrayList<Usuario> usuarios;

    public ControlTablaAdminLab() {
        usuarios = Singleton.getInstancia().getUsuarios();
    }

    
     public ArrayList<AdminLab> listaUsuarioAdminLabs() {
        ArrayList<AdminLab> adminlabs = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof AdminLab) {
                AdminLab adminLab = (AdminLab) usuarios.get(i);
                adminlabs.add(adminLab);
            }
        }
        return adminlabs;
    }
}
