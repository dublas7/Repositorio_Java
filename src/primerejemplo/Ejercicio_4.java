/*
 * Importanciòn de Scanner, utilidad para leeer datos ingresados por el usuario
.importjava.util.Scanner;
 */
package primerejemplo;
import java.util.Scanner;   
/**
 *
 * @author Dgarzon
 */
public class Ejercicio_4 {
        public static void  main(String[] args){
           
            Scanner leer = new Scanner (System.in); 
               
            System.out.println("Con esta clase gaurdamos valores ing por consola en variables");
            System.out.println("Ingresa tu nombre");
            String nombre = leer.nextLine (); 
            
            System.out.println("Ingresa tu edad");
            int edad = leer.nextInt();
            
            System.out.print(nombre + "," );
            System.out.println(" tienes " + edad + " años");
}     
}