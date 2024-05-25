/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import excepciones.NoTieneReserva;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaEliminarReserva {

    ArrayList<Usuario> usuarios;

    public ControlVentanaEliminarReserva() {
        usuarios = Singleton.getInstancia().getUsuarios();
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
    
    public ArrayList<Estudiante> usuariosConReserva(){ //// este array lo usamos para la tabla
        ArrayList<Estudiante> estReservas = new ArrayList<>();
        for (int i = 0; i < listaUsuarioEsts().size(); i++) {
            if(listaUsuarioEsts().get(i).isTieneReserva()){
                estReservas.add(listaUsuarioEsts().get(i));
            }
        }
        System.out.println("estudiantes con reserva " + estReservas.size());
        return estReservas;
    }
    
    public void eliminarReserva (int idEstudiante)throws NoTieneReserva{
        boolean aux = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId() == idEstudiante){
                Estudiante est = (Estudiante) usuarios.get(i);
                est.setTieneReserva(false);
                est.setReserva(null);
                usuarios.set(i, est);
                aux = true;
            }
        }
        if(!aux){
            throw new NoTieneReserva();
        }
    }
}
