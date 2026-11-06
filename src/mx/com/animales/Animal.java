package mx.com.animales;

public abstract class Animal {
    //atributos
    private String nombre;
    private int edad;

    //constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }

    public abstract void hacerSonido();{}


}
