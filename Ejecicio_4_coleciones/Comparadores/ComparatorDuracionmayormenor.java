/*
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
package PeliculaEntidades;
 */
package Comparadores;

import PeliculaEntidades.Pelicula;
import java.util.Comparator;

public class ComparatorDuracionmayormenor implements Comparator<Pelicula>{
                @Override
                public int compare(Pelicula primeraPelicula, Pelicula segundaPelicula) {
                    return Integer.compare(primeraPelicula.getDuracion(), segundaPelicula.getDuracion());
      

                }
   }