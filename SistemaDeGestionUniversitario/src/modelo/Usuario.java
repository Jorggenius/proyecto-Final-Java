/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author JORGE
 */
public class Usuario {
    private int tipe;
    private String asignatura;
    private int id;
    private String firstName;
    private String secondName;
    private int birdData;
    private int age = calcularEdad(birdData);
    private ArrayList<String> cursos;
    private String contraseña;

    //COSTRUCTOR PARA ESTUDIANTE
    /**
     * COntructor para estudiante
     * @param tipe
     * @param id
     * @param firstName
     * @param secondName
     * @param birdData
     * @param cursos
     * @param contraseña 
     */
    public Usuario(int tipe, int id, String firstName, String secondName, int birdData, ArrayList<String> cursos, String contraseña) {
        this.tipe = tipe;   
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birdData = birdData;
        this.cursos = cursos;
        this.contraseña = contraseña;
    }
    
    //CONSTRUCTOR PARA DOCENTE
    /**
     * Constructor para docente
     * @param tipe
     * @param asignatura
     * @param id
     * @param firstName
     * @param secondName
     * @param birdData
     * @param contraseña 
     */
    public Usuario(int tipe, String asignatura, int id, String firstName, String secondName, int birdData, String contraseña) {
        this.tipe = tipe;
        this.asignatura = asignatura;
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birdData = birdData;
        this.contraseña = contraseña;
    }
    
    //CONSTRUCTOR PARA ADMINISTATIVO
    /**
     * Constructor para admin y lab
     * @param tipe
     * @param id
     * @param firstName
     * @param secondName
     * @param birdData
     * @param contraseña 
     */
    public Usuario(int tipe, int id, String firstName, String secondName, int birdData, String contraseña) {
        this.tipe = tipe;
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birdData = birdData;
        this.contraseña = contraseña;
    }
    
   

    //metodos
    public int calcularEdad(int birdData){
        int edad = 2024 - birdData;
        return edad;
    }

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirdData() {
        return birdData;
    }

    public void setBirdData(int birdData) {
        this.birdData = birdData;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    
    
}
