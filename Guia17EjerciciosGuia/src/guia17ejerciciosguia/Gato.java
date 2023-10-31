/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia17ejerciciosguia;

/**
 *
 * @author Viaro2023
 */
public class Gato {
    
    String nombre;
    String raza;
    int edad;
    
    public void comer(){
        System.out.println("Comiendo...");
    }
    
    public void hacerRuido(){
        System.out.println("miau");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Gato(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
}
