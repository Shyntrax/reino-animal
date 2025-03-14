package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * 
 * @author Ivang
 * @version 1.0
 * @see Gato
 * 
 * Clase Gato con herencia de la clase Mamifero.
 *
 */
public class Gato extends Mamifero {

     /**
     * Atributo pelos de la clase animal
     */
    
    private int pelos;

    /**
    * Constructor de Gato con paremetro String.
    * Heredado de la clase Mamifero.
    * @param nombre 
    */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Metodo vacio dormir con mensaje.
     */

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }
    
    /**
     * Metodo vacio maullar con mensaje.
     */

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Metodo vacio con parametro del tipo Animal
     * @param p 
     * Llama al metodo get de la clase Animal.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

    /**
     * @return the pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * @param pelos the pelos to set
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Metodo String toString
     * @return super.toString heredado de la clase Animal
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
