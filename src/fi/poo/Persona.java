/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author mariana
 * Clase que contiene los metodos de lo hace una persona
 */
public class Persona {
    private String nombre, direccion;
    private int edad;

    public Persona() {
    }
    
    /**
     Contructor lleno de la persona String
     * @param nombre EL nombre de la persona en String
     * @param dirreccion La dirreccion de la perosna en String
     * @param edad La edad de la persona en primitivo entero
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
    *Metodo que sirve para que la persona hable
    * @param var lo que la persona esta diciendo
    * hacer 5 metodos
    */
    public void hablar (String var){
        System.out.println(var);
    }
    /**
    *Metodo sobre escrito que muestra los valores de los atributos
    * @param 
    */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
