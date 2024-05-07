/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Curso;
import Singleton.Singleton;
        
/**
 *
 * @author JORGE
 */
public class ControlPanelHacerCalificaciones {

    ArrayList<Curso> cursos;

    public ControlPanelHacerCalificaciones() {
        cursos = Singleton.getInstancia().getCursos();
    }
    
    public void actualizarCursos(ArrayList<Curso> cursosNotas){
        for (int i = 0; i < cursos.size(); i++) {
            for (int j = 0; j < cursosNotas.size(); j++) {
                if(cursos.get(i).getId()==cursosNotas.get(j).getId()){
                    cursos.set(i, cursosNotas.get(j));
                }
            }
        }
        Singleton.getInstancia().escribirObjetoCurso();
    }
    
    public void calificar(int idCurso, String razon, String nombre, float nota){
           for(int i = 0 ; i < cursos.size(); i++){
            if(cursos.get(i).getId() == idCurso){
                for (int j = 0; j < cursos.get(i).getNotas().size(); j++) {
                    if(cursos.get(i).getNotas().get(j).getRazon().equals(razon)){
//                        cursos.get(i).getNotas().get(j).calificarNota(nombre, nota);
                        for (int k = 0; k < cursos.get(i).getNotas().get(j).getDetalles().size(); k++) {
                            if(cursos.get(i).getNotas().get(j).getDetalles().get(k).getEstudiante().getNombre().equals(nombre)){
                                cursos.get(i).getNotas().get(j).getDetalles().get(k).setNota(nota);
                                cursos.get(i).getNotas().get(j).getDetalles().get(k).setCalificado(true);
                                System.out.println("------------------");
                                System.out.println(cursos.get(i).getMaterial());
                                System.out.println(cursos.get(i).getNotas().get(j).getRazon());
                                System.out.println(cursos.get(i).getNotas().get(j).getDetalles().get(k).getEstudiante().getNombre());
                                System.out.println(cursos.get(i).getNotas().get(j).getDetalles().get(k).getNota());
//                                System.out.println(cursos.get(i).getNotas().get(j-1).getDetalles().get(k).getNota());
                                System.out.println("------------------");
                                
                            }
                        }
                    }
                }
            }
        }
    }
    
}
