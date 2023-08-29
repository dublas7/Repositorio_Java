package Servicio;

import Entidades.Dog;
import Entidades.Person;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in);

    public void adopcion(Person p, List<Dog> d) {

        boolean bandera = true;

        do {

            System.out.println("Buenas, " + p.getName() + " , qué perro quisiera elegir");

            for (Dog dog : d) {
                System.out.println(dog.getName());
            }
            String nombrePerro = leer.next();

            for (Dog dog : d) {
                if (nombrePerro.equalsIgnoreCase(dog.getName())) {

                    if (!dog.isAdoptado()) {
                        dog.setAdoptado(true);
                        p.setAdoptedPets(dog);
                        System.out.println("disfruta la compañía de " + dog.getName());
                        bandera = false;
                        break;
                    } else {
                        System.out.println("El perro ya fue adoptado");

                    }

                }
            }

        } while (bandera);

    }

;

}
