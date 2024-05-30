/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import excepciones.NoTieneReserva;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaEliminarReserva {

    ArrayList<Usuario> usuarios;
    ArrayList<Laboratorio> labs;

    public ControlVentanaEliminarReserva() {
        usuarios = Singleton.getInstancia().getUsuarios();
        labs = Singleton.getInstancia().getLabs();
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
        Estudiante est = conseguirEstudiante(idEstudiante);
          boolean validar = false;
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getIdLaboratorio() == est.getReserva().getIdLab()) {
                for (int j = 0; j < labs.get(i).getReservas().size(); j++) {
                    if (labs.get(i).getReservas().get(j).getEstudiante().getId() == est.getId()) {
                        labs.get(i).getReservas().remove(j);
                    }
                }
                for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                    for (int k = 0; k <  labs.get(i).getPuestos().get(j).getReservas().size(); k++) {
                        if(labs.get(i).getPuestos().get(j).getReservas().get(k).getEstudiante().getId() == est.getId()){
                            labs.get(i).getPuestos().get(j).getReservas().remove(k);
                        }
                    }
   
                }
            }
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == est.getId()) {
                Estudiante estudiante = (Estudiante) usuarios.get(i);
                if (estudiante.isTieneReserva()) {
                    estudiante.setReserva(null);
                    estudiante.setTieneReserva(false);
                    JOptionPane.showMessageDialog(null, "Reserva cancelada");
                    Singleton.getInstancia().escribirObjetoUsuario();
                    validar = true;
                }
            }
        }
        if (!validar) {
            throw new NoTieneReserva();
        }

//        boolean aux = false;
//        for (int i = 0; i < usuarios.size(); i++) {
//            if(usuarios.get(i).getId() == idEstudiante){
//                Estudiante est = (Estudiante) usuarios.get(i);
//                est.setTieneReserva(false);
//                est.setReserva(null);
//                usuarios.set(i, est);
//                aux = true;
//            }
//        }
//        if(!aux){
//            throw new NoTieneReserva();
//        }
    }
    
    public Estudiante conseguirEstudiante(int idEstudiante){
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId() == idEstudiante){
            return (Estudiante) usuarios.get(i);
            }
        }
        return null;
    }
}
