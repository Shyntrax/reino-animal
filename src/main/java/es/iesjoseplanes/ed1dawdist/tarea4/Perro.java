package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * 
 * @author Ivang
 * @version 1.0
 * @see Perro
 * 
 * Clase Perro con herencia de la clase Mamifero.
 *
 */
public class Perro extends Mamifero {

    /**
    * Constructor de Perro con paremetro String.
    * Heredado de la clase Mamifero.
    * @param nombre 
    */
    public Perro(String nombre) {
        super(nombre);
    }
    
    
    /**
    * Metodo vacio dormir con mensaje.
    */

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }
    
    /**
    * Metodo ladrar dormir con mensaje.
    */
    
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }
    
    /**
    * Metodo vacio gruñir con mensaje.
    */

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }
    
    /**
    * Metodo vacio relacionar con mensaje que llama al metodo get de la clase Animal
    * @param p de la clase Animal
    */

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }






}
