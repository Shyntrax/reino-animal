package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * 
 * @author Ivang
 * @version 1.0
 * @see Mamifero
 * 
 * Clase Mamifero con herencia de la superclase Animal.
 *
 */
public class Mamifero extends Animal {

    
/**
 * Constructor de Mamifero con paremetro String.
 * Heredado de la superclase Animal.
 * @param nombre 
 */
    public Mamifero(String nombre) {
        super(nombre);
    }
    
    /**
     * Metodo vacio reproducir con mensaje.
     */

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }
    
    /**
     * Metodo vacio relacionar con mensaje con parametro del a clase Animal.
     * @param m
     * Que llama al metodo get de la clase Animal.
     */

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
    
    /**
     * Metodo String toString.
     * @return super.toString heredado de la clase Animal.
     */

    @Override
    public String toString() {
        return super.toString(); 
    }
    
}
