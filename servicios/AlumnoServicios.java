/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.  
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. 
 */
package servicios;
 
import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicios {
    
    Scanner leer = new Scanner (System.in);
//    Alumno al = new Alumno(); 
    List <Alumno> listaAlumno = new ArrayList();
    char respuesta;
    
    public void llenarAlumno() {
        
        do {
      
            System.out.println("INGRESA EL NOMBRE DEL ALUMNO");
            String nombre= leer.nextLine();
            
            List<Integer> notas = new ArrayList();
               for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                int nota = Integer.parseInt(leer.nextLine());
                notas.add(nota);
               }
                   System.out.println("Deseas agregar otro estudiantes S/N");
                   respuesta =leer.nextLine().toUpperCase().charAt(0);
                   
                   Alumno alumno = new Alumno (nombre, notas);
                   listaAlumno.add(alumno);
                   
               }while (respuesta == 'S');
        
    }
       public void mostrarAlumnos () {
        System.out.println("Lista de alumnos: ");
        listaAlumno.forEach((Alumno alumno) -> {
            System.out.println("Nombre = " + alumno.getNombre() + alumno.getNotas());
        });
    }
       
   public double notaFinal(String nombreAlumno) {
    String ebuscar = nombreAlumno;
    double notaFinal = 0;

        for (Alumno alumno : listaAlumno) {
            if (alumno.getNombre().equalsIgnoreCase(ebuscar)) {
                List<Integer> notas = alumno.getNotas();

                // Calcular el promedio final del alumno
                for (int nota : notas) {
                    notaFinal += nota;

                }
return notaFinal / notas.size();
            }
        }
        return -1;

    }
}
