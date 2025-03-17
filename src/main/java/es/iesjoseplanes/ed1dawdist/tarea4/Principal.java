package es.iesjoseplanes.ed1dawdist.tarea4;

/**
 * @author Ivang
 * @version 1.0
 * @see Principal
 * 
 * Clase Principal del proyecto.
 */
public class Principal {

    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("nombreanimal");

        Mamifero mamifero = new Mamifero("nombremamifero");

        Perro toby = new Perro("nombreperro");

        Gato isidoro = new Gato("nombregato");
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
