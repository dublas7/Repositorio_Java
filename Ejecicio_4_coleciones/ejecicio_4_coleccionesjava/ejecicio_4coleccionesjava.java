/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio_4_coleccionesjava;


import ServicioPelicula.servicioPelicula;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dgarzon
 */
public class ejecicio_4coleccionesjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioPelicula serv = new servicioPelicula();
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("///////////////////////////////////////////////////////////");
        do {
            System.out.println("Ingresa la opción que deseas realizar");
            System.out.println("1 para ingresar películas");
            System.out.println("2 para Mostrar las peliculas registradas");
            System.out.println("3 para aplicar filtros a las peliculas ingresadas");
            System.out.println("4 para salir del programa");
            System.out.println("////////////Elige una opción////////////");
            opc = leer.nextInt();
            System.out.println("Elegiste la opción " + "/" + opc + "/");

            try {
                switch (opc) {
                    case 1:
                        serv.crearPelicula();
                        break;

                    case 2:
                        serv.mostrartodaslaspelicula();
                        break;

                    case 3:
                        
                            int menu;
                            do {
                                System.out.println("Ingresa una opción que corresponda al filtro que deseas aplicar");
                                System.out.println("Elige 1 para mostrar en pantalla todas las películas con una duración mayor a 1 hora.");
                                System.out.println("Elige 2 para Ordenar las películas de acuerdo a su duración" + "(de mayor a menor)");
                                System.out.println("Elige 3 para Ordenar las películas de acuerdo a su duración" + "(de menor a mayor)");
                                System.out.println("Elige 4 para Ordenar las películas por título, alfabéticamente");
                                System.out.println("Elige 5 para denar las películas por director, alfabéticamente");
                                System.out.println("Elige 6 para volver al menú anterior");
                                menu = leer.nextInt();

                                switch (menu) {
                                    case 1:
                                        serv.mostrarpeliculasmayoresunahora();
                                        break;

                                    case 2:
                                        serv.Ordenardemayoramenor();
                                        break;

                                    case 3:
                                        serv.Ordenardemenoramayor();
                                        break;

                                    case 4:
                                        serv.Ordenarnombre();
                                        break;
                                    case 5:
                                        serv.Ordenardirector();
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("no valido");
                                }                     
                        }while (menu <=5);
                        System.out.println("Regresando al menu anterior");
                        break;
                        
                    case 4:
                        System.out.println("Chaito");
                        System.exit(0);
                             
                    default:
                        System.out.println("Ingresa una opción valida");
                        
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número válido");
                leer.next(); 
                opc = 0;
            }
        } while (opc <= 3);
//        System.out.println("Chaito");
//      
}
}
