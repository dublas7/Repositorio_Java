package Relations_Ej_01;


import Entidades.Person;
import Entidades.Dog;
import Servicio.Service;
import java.util.ArrayList;
import java.util.List;

/*Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

 /*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
public class Main {

    public static void main(String[] args) {

        Dog perris=null;
        
        Service s = new Service();

        List<Dog> dogs = new ArrayList();

        Dog d1 = new Dog("Chiquito", "Labrador", 5, "Small");
        Dog d2 = new Dog("Lola", "Chihuahua", 5, "Small");
        Dog d3 = new Dog("Negro", "Coker", 5, "Small");
        Dog d4 = new Dog("Cholito", "Dogo", 5, "Medium");
        Dog d5 = new Dog("Puma", "Pastor Alemán", 5, "Medium");

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        dogs.add(d5);

        List<Person> personas = new ArrayList();

        Person p1 = new Person("Juan", "Mateico", 18, 1234567, perris );
        Person p2 = new Person("Fernando", "García", 20, 1234567, perris);
        Person p3 = new Person("Juana", "Juarez", 36, 1234567, perris);
        Person p4 = new Person("Rodolfo", "Paez", 60, 1244467, perris);
        Person p5 = new Person("Carlos Alberto", "García", 20, 2234888, perris);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        for (Person persona : personas) {
            s.adopcion(persona, dogs);
        }

        for (Person persona : personas) {
            System.out.println(persona.toString());
        }
        
    }
}
