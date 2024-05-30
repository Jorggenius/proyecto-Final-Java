/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Singleton.Singleton;
import excepciones.PrestamoNoRealizado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.Laboratorio;
import modelo.Prestamo;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class ControlVentanaPrestamos {

    ArrayList<Usuario> usuarios;
    ArrayList<Laboratorio> labs;

    public ControlVentanaPrestamos() {
        usuarios = Singleton.getInstancia().getUsuarios();
        labs = Singleton.getInstancia().getLabs();
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void generarPrestamo(Prestamo prestamo, int idEstudiante, int idPuesto) throws PrestamoNoRealizado {
        boolean aux = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == idEstudiante) {
                Estudiante est = (Estudiante) usuarios.get(i);
                est.setPrestamo(prestamo);
                est.setTienePrestamo(true);
                usuarios.set(i, est);
                Singleton.getInstancia().escribirObjetoUsuario();
                aux = true;
                JOptionPane.showMessageDialog(null, "Prestamo realizado");
            }
        }
        for (int i = 0; i < labs.size(); i++) {
            if(labs.get(i).getIdLaboratorio() == prestamo.getIdLab()){
                for (int j = 0; j < labs.get(i).getPuestos().size(); j++) {
                    if( labs.get(i).getPuestos().get(j).getIdPuesto() == idPuesto){
                        labs.get(i).getPuestos().get(j).getPrestamos().add(prestamo);
                    }
                }
            }
        }
        if (!aux) {
            throw new PrestamoNoRealizado();
        }
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

    public Estudiante conseguirEstudiante(int indexEstudiante) {
        ArrayList<Estudiante> ests = listaUsuarioEsts();
        return ests.get(indexEstudiante);
    }

    public boolean estudianteTieneReserva(int idEstudiante) {
        for (int i = 0; i < listaUsuarioEsts().size(); i++) {
            if (listaUsuarioEsts().get(i).isTieneReserva()) {
                return false;
            }
        }
        return true;
    }
}
