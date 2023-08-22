
package ejercicio_3_colecciones;

import java.util.Scanner;
import servicios.AlumnoServicios;

/**
 *
 * @author Dgarzon
 */
public class Ejercicio_3_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicios as= new AlumnoServicios();
      
        
        as.llenarAlumno();
        as.mostrarAlumnos();
        
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO A BUSCAR");
        String nombreEstudiante = new Scanner(System.in).nextLine();

        double notaFinal = as.notaFinal(nombreEstudiante);

        if (notaFinal >= 0) {
            System.out.println("La nota final de " + nombreEstudiante + " es: " + notaFinal);
        } else {
            System.out.println("El estudiante " + nombreEstudiante + " no fue encontrado.");
        }
    }
}