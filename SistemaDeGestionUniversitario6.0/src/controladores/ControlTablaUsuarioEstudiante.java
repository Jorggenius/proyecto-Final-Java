/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlTablaUsuarioEstudiante {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControlTablaUsuarioEstudiante() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

    public ArrayList<Estudiante> listaUsuarioEsts() {
        ArrayList<Estudiante> ests = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                ests.add(estudiante);
            }
        }
        return ests;
    }
}
