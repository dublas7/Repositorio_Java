/*
 * Implementar un programa que le pida dos números enteros a usuario y determine 
si ambos o alguno de ellos es mayor a 25..
 */
package primerejemplo;
import java.util.Scanner;
/**
 *
 * @author Dgarzon
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingresa tu primer número");
        int num1 = leer.nextInt(); 
        
        System.out.println("Ingresa tu segundo número");
        int num2 = leer.nextInt();
        
        
        if (num1 <= 25) {
            System.out.println(num1 + " No es mayor que 25");
   
        } else {
            System.out.println(num1 +  " Es mayor que 25 ");
            
        }  if (num2 <= 25) {
                System.out.println(num2 + " No es mayor que 25");
 
           } else {
            System.out.println( num2 + " es mayor que 25 ");
            }
}
}