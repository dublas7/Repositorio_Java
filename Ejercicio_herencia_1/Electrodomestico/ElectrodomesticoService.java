/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

import java.util.Scanner;

/**
 *
 * @author Dgarzon
 */
public class ElectrodomesticoService {
//   Electrodomestico elect = new Electrodomestico ();
   Scanner leer = new Scanner (System.in);

    public char comprobarConsumo(char letra ) {
        if (letra >= 'A' && letra <= 'F') {

            return letra;
        } else {
            return 'F';
        }
    }
    
    public String comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        String colorLowerCase = color.toLowerCase();
        for (String colorDisponible : coloresDisponibles) {
            if (colorLowerCase.equals(colorDisponible)) {
                return colorLowerCase;
            }
        }
        return "blanco"; 
    }
    public int precioFinal(int peso, char consumo) {
        int precioConsumo = 0;
        switch (consumo) {
            case 'A':
                precioConsumo = 1000;
                break;
            case 'B':
                precioConsumo = 800;
                break;
            case 'C':
                precioConsumo = 600;
                break;
            case 'D':
                precioConsumo = 500;
                break;
            case 'E':
                precioConsumo = 300;
                break;
            case 'F':
                precioConsumo = 100;
                break;
        }
        int precioFinal = 0;
        if (peso > 1 && peso < 19) {
            precioFinal = precioConsumo + 100;
        } else if (peso > 19 && peso < 49) {
            precioFinal = precioConsumo + 500;
        } else if (peso > 49 && peso < 79) {
            precioFinal = precioConsumo + 800;
        } else if (peso > 80) {
            precioFinal = precioConsumo + 1000;
        }
        return precioFinal;
    }
    
    public Electrodomestico crearElectrodomestico(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la letra correspondiente al consumo del electrodomestico");
        char consumo=sc.next().toUpperCase().charAt(0);
        char consumoFinal=comprobarConsumo(consumo);
        System.out.println("Indique el color del electrodomestico");
        String color=sc.next();
        String colorFinal=comprobarColor(color);
        System.out.println("Indique el peso del electrodomestico");
        int peso=sc.nextInt();
        int precioFinal=precioFinal(peso, consumoFinal);
        return new Electrodomestico (precioFinal, colorFinal, consumoFinal, peso);
    }

    }


