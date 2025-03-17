package es.iesjoseplanes.ed1dawdist.tarea4;
/**
 * 
 * @author Ivang
 * @version 1.0
 * @see Animal
 * 
 * Superclase Animal
 */

public class Animal {
    
    /**
     * Atributo nombre de la clase animal
     */
    
   private String nombre;
   
   /**
    * Constructor de la clase Animal con parametro String.
    * @param nombre 
    */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

   

     /**
      * Metodo vacio comer con mensaje.
      */

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }
    
    /**
     * Metodo vacio dormir con mensaje.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }
    
     /**
     * Metodo vacio reproducir con mensaje.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }
    
    /**
     * Metodo vacio relacionar con mensaje.
     * @param a del tipo Animal
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }
    
    /**
     * Metodo String Get que devuelve el nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo vacio set con parametro String.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo String toString
     * @return this.nombre
     */
    public String toString() {
        return this.nombre;
    }
}
                         