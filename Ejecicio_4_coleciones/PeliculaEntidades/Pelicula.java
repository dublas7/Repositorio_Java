package PeliculaEntidades;
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
package PeliculaEntidades;

/**
 *
 * @author Dgarzon
 */
public class Pelicula {
    
    private String nombre;
    private String genero;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, String director, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
}
