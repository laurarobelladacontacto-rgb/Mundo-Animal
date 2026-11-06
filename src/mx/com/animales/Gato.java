package mx.com.animales;


public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miauuu😸");
    }


    @Override
    public void moverse() {
        System.out.println("Camina");
    }
}
