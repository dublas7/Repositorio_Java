/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lavadora;

import Electrodomestico.Electrodomestico;
import Electrodomestico.ElectrodomesticoService;
import java.util.Scanner;

/**
 *
 * @author Dgarzon
 */
public class LavadoraServices extends ElectrodomesticoService{
    
    public int precioFinal(int peso, char consumo, int carga) {
        int precioBase=super.precioFinal(peso, consumo);
        int precioFinalLavadora=precioBase;
        if(carga>30){
            precioFinalLavadora=precioBase+500;
        }
        return precioFinalLavadora;
    }
    
        public Lavadora crearLavadora(){
        Scanner sc=new Scanner(System.in);
        Electrodomestico primero=super.crearElectrodomestico();
        System.out.println("Cuantos kg carga el lavarropa?");
        int carga=sc.nextInt();
        int precioFinal=precioFinal(primero.getPeso(), primero.getConsumo(), carga);
        primero.setPrecio(precioFinal);
//        System.out.println(primero.getPrecio());
//        System.out.println(primero.getColor());
//        System.out.println(primero.getConsumo());
        return new Lavadora(primero.getPrecio(), primero.getColor(), primero.getConsumo(),primero.getPeso(), carga);
        }
}
