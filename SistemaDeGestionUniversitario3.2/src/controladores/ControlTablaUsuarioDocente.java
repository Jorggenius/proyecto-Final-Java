/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Docente;
import modelo.Usuario;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlTablaUsuarioDocente {

    Serializador serializador;
    ArrayList<Usuario> usuarios;

    public ControlTablaUsuarioDocente() {
        serializador = new Serializador();
        usuarios = serializador.leerUsuarios();
    }

        public ArrayList<Docente> listaUsuarioDocens() {
        ArrayList<Docente> docens = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Docente) {
                Docente docente = (Docente) usuarios.get(i);
                docens.add(docente);
            }
        }
        return docens;
    }
}
