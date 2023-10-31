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
package Entity;

public class Dog {
        
    private String name;
    private String nickname;
    private String breed;
    private String color;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, String nickname, String breed, String color, Integer age) {
        this.name = name;
        this.nickname = nickname;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", nickname=" + nickname + ", breed=" + breed + ", color=" + color + ", age=" + age + '}';
    }

}