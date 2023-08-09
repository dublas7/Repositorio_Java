/*
1.Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.  
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. 
 */
package servicio;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Dgarzon
 */
// DECLARAMOS EL ARRAY Y EL SCANNER PARA LEER DURANETE LA EJECUCIÓN DEL PROGRAMA
public class Petshop {
         ArrayList<Perro> listaPerros = new ArrayList<>();
         Scanner leer = new Scanner(System.in);

 /// DENTRO DE UN BUCLE DO-WHILE LLENAMOS LOS PERROS, EL BUCLE PERMITE EJECUTAR UN PRIMER
         //BLOQUE DE CODIGO ANTES DE DAR COMPROBACIÓN A LA COPNDICIÓN.
    public void llenarPerro() {
        char opcion;

        do {
       
            System.out.println("Ingresa el nombre de tu perro:");
            String nombre = leer.nextLine();
            System.out.println("Ingresa la raza:");
            String raza = leer.nextLine();

            listaPerros.add(new Perro(nombre, raza));
   // CREAMOS UN OBJETO DE TIPO  PERRO CON EL CONSTRUCTOR CORRESPONDIENTE

            System.out.println("¿Deseas agregar otro perro? (S/N)");
            opcion = leer.nextLine().toUpperCase().charAt(0);
        } while (opcion == 'S');
   // MIENTRAS SE COLOQUE "S" EL BUCLE SE VA A SEGUIR EJECUTANDO
    }

    public void mostrarPerros() {
        System.out.println("Lista de perros:");
        listaPerros.forEach((perro) -> {
            System.out.println("Nombre: " +( listaPerros.indexOf(perro)+1) + "." +perro.getNombre() + ", Raza: " + perro.getRaza());
           
             });
    }
    public void buscarperro () {
        System.out.println("\n-----------------ooooooooooooo-----------------\n");
        System.out.println("¿Qué perro quieres eliminar de la lista ?");
        String pbuscar = leer.nextLine();
        
        Iterator <Perro> iterator =listaPerros.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equalsIgnoreCase(pbuscar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("\nPerro eliminado:\n " + pbuscar);
            mostrarPerros();
        } else {
            System.out.println("El perro no se encuentra en la lista.");
            buscarperro();
        }

    }

}



