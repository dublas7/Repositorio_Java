/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película.
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación: 
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula. 
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no. 
Después de ese bucle realizaremos las siguientes acciones:
 Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
package PeliculaEntidades;
 */
package ServicioPelicula;


import Comparadores.ComparatorDirector;
import Comparadores.ComparatorDuracionmayormenor;
import Comparadores.ComparatorDuracionmenormayor;
import Comparadores.ComparatorPelicula;
import PeliculaEntidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dgarzon
 */
public class servicioPelicula {

    Scanner leer = new Scanner(System.in);
    List<Pelicula> listaPelicula = new ArrayList();


    public void crearPelicula() {
        int seguir;

        do {
            System.out.println("Ingresa el nombre de la pelicula");
            String nombre = leer.nextLine();
            System.out.println("Ingresa el género al que pertenece la película");
            String genero = leer.nextLine();
            System.out.println("Agrega el director");
            String director = leer.nextLine();
            System.out.println("Ingresa la duración de la pelicula en minutos");
            int duracion = leer.nextInt();
            leer.nextLine();
            listaPelicula.add(new Pelicula(nombre, genero, director, duracion));

            System.out.println("Deseas agregar otra película // Si=1, No=2 //");
            seguir = leer.nextInt();
            leer.nextLine();
        } while (seguir == 1);

    }
       public void Ordenarnombre (){
       Collections.sort(listaPelicula, new ComparatorPelicula());
            for (Pelicula pelicula : listaPelicula)
               System.out.println(pelicula.toString());
    }

       public  void Ordenardirector(){
        Collections.sort(listaPelicula, new ComparatorDirector());
        for (Pelicula pelicula : listaPelicula)
               System.out.println(pelicula.toString());
       }
               public  void Ordenardemenoramayor(){
        Collections.sort(listaPelicula, new ComparatorDuracionmenormayor());
                for (Pelicula pelicula : listaPelicula)
               System.out.println(pelicula.toString());
       }
    public  void Ordenardemayoramenor(){
        Collections.sort(listaPelicula, new ComparatorDuracionmayormenor());
                for (Pelicula pelicula : listaPelicula)
               System.out.println(pelicula.toString());
                
       }
    public void mostrartodaslaspelicula() {
        System.out.println("Lista de Películas:");
        listaPelicula.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
        
    }
        public void mostrarpeliculasmayoresunahora (){
        System.out.println("Lsita de pelicílas mayores a una hora");
        for (Pelicula pelicula : listaPelicula)
            if (pelicula.getDuracion() >60)
                System.out.println(pelicula.toString());
    }
}
    
    