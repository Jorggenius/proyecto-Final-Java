/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Administrativo;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlTablaAdministrativo {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControlTablaAdministrativo() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
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
