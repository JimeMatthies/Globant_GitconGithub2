/*
Ahora van a continuar trabajando como mesa. Vuestra tarea ahora es que cada miembro
de la mesa, incluido el facilitador, debe crear su branch y crear una de las siguientes
clases: Gato, Perro, Caballo, Conejo, Pájaro y Pato. Cada uno le va a poner los atributos
que desee.
El facilitador va a tener que crear el repositorio y subir un proyecto de Java vacio para que
los miembros de la mesa puedan clonar y crear su clase. Una vez que cada miembro haya
creado su clase en su respectiva rama, deberán unir todas las clases en la rama main, para
que quede el proyecto final.
@author JimeM
 */
package Entidades;

public class Perro {
    
    private String nombre;
    private String apodo;
    private String raza;
    private String color;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String apodo, String raza, String color, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
   
}
