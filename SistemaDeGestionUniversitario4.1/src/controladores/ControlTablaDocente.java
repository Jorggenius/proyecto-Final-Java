/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Docente;
import modelo.Usuario;
import Singleton.Singleton;
/**
 *
 * @author JORGE
 */
public class ControlTablaDocente {

    ArrayList<Usuario> usuarios;

    public ControlTablaDocente() {
        usuarios = Singleton.getInstancia().getUsuarios();
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
