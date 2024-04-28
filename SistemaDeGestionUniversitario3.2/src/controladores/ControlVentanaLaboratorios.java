/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import java.util.ArrayList;
import modelo.Curso;
import modelo.Laboratorio;
import serializador.Serializador;

/**
 *
 * @author JORGE
 */
public class ControlVentanaLaboratorios {
    Serializador serializador;
    ArrayList<Laboratorio> labs;
    ArrayList<Curso> cursos;
    
    public ControlVentanaLaboratorios() {
        serializador = new Serializador();
        labs = serializador.leerLaboratorios();
        cursos = serializador.leerCursos();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Laboratorio> labs) {
        this.labs = labs;
    }


    public boolean crearLaboratorio(Laboratorio lab) {
       if(labs.contains(lab)){
           return false;
       }else {
           labs.add(lab);
           serializador.escribirLaboratorios(labs);
           return true;
       }
        
    }

    public Laboratorio buscarLaboratorio(int id) {
        for (int i = 0; i < labs.size(); i++) {
            if (id == labs.get(i).getIdLaboratorio()) {
                return labs.get(i);

            }
        }
        return null;
    }
    
     public String contadorIdLabs() {
        String contador = "00" + String.valueOf(labs.size() + 1);
//        contIdsLabs++;
        return contador;
    }
}
