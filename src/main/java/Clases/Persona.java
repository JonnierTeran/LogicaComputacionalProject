/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Persona {

    //Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String profesion;

    //Constructor de la clase
    public Persona(String nombre, String apellido, int edad, String sexo, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.profesion = profesion;
    }

    // Metodos de Encapsulado Set Y Get 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    //Metodo para cargar informacion registrada

    @Override
    public String toString() {
        return  "Nombres: "+ this.getNombre() +"\n" +
                "Apellidos: "+ this.getApellido() +"\n"+
                "Edad: "+ this.getEdad() +  "\n"+
                "Profesion: "+ this.getProfesion() +"\n" ;
                  
    }
    
}
