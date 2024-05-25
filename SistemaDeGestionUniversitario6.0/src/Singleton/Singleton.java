/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Laboratorio;
import modelo.Usuario;

/**
 *
 * @author JORGE
 */
public class Singleton {

    private static final Singleton INSTANCIA = new Singleton();
    ArrayList<Usuario> usuarios;
    ArrayList<Curso> cursos;
    ArrayList<Laboratorio> labs;

    private Singleton() {
        usuarios = leerUsuario();
        cursos = leerCurso();
        labs =  leerLab();
    }
    
    public static Singleton getInstancia() {
        return INSTANCIA;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Laboratorio> getLabs() {
        return labs;
    }
    
    
     public void escribirObjetoUsuario(){
        try {
            FileOutputStream archivo = new FileOutputStream("usuarios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(usuarios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> leerUsuario() {
        try {
            FileInputStream archivo = new FileInputStream("Usuarios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("No hay listas usuario");
            return new ArrayList<>();
        }
    }
    
    
     public void escribirObjetoCurso(){
        try {
            FileOutputStream archivo = new FileOutputStream("cursos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(cursos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Curso> leerCurso() {
        try {
            FileInputStream archivo = new FileInputStream("cursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Curso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("No hay listas cursos");
            return new ArrayList<>();
        }

    }
     public void escribirObjetoLab(){
        try {
            FileOutputStream archivo = new FileOutputStream("labs.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(labs);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Laboratorio> leerLab() {
        try {
            FileInputStream archivo = new FileInputStream("labs.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Laboratorio>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("No hay listas labs");
            return new ArrayList<>();
        }

    }

}
