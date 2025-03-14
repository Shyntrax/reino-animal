package es.iesjoseplanes.ed1dawdist.tarea4;


public class Mamifero extends Animal {

    

    public Mamifero(String nombre) {
        super(nombre);
    }
    
    

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }
    
  

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
    
   

    @Override
    public String toString() {
        return super.toString(); 
    }
    
}
