/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializador;

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
public class Serializador {

    public Serializador() {
    }

    public void escribirUsuarios(ArrayList<Usuario> lista) {
        try {
            FileOutputStream archivo = new FileOutputStream("usuarios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> leerUsuarios() {
        try {
            FileInputStream archivo = new FileInputStream("Usuarios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("No Hay Archivo");
            return new ArrayList<>();
        }

    }

    public void escribirCursos(ArrayList<Curso> lista) {
        try {
            FileOutputStream archivo = new FileOutputStream("cursos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Curso> leerCursos() {
        try {
            FileInputStream archivo = new FileInputStream("cursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Curso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }

    }

    public void escribirLaboratorios(ArrayList<Laboratorio> lista) {
        try {
            FileOutputStream archivo = new FileOutputStream("laboratorios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Laboratorio> leerLaboratorios() {
        try {
            FileInputStream archivo = new FileInputStream("laboratorios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Laboratorio>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }

    }
}
