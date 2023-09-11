/*
 • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Televisor;

import Electrodomestico.Electrodomestico;
import Electrodomestico.ElectrodomesticoService;
import java.util.Scanner;

/**
 *
 * @author Dgarzon
 */
public class TelevisorServices extends ElectrodomesticoService{
//        
//    public int precioFinal.(int peso, char consumo, int carga) {
//               int precioBase =super.precioFinal(peso, consumo);
//}
    public Televisor creartelevisor (){
        Scanner sc= new Scanner (System.in);
        Electrodomestico elect = super.crearElectrodomestico();
        System.out.println("De cuántas pulgadas es tu televisor");
        int pulgadas = sc.nextInt();
        System.out.println("Tiene TDT // (SI) Presiona 1-- (NO) PRESIONA 2  ");
        int respuesta;
        respuesta = (sc.nextInt());
        boolean tdt=false;
        if (respuesta ==1) {
            tdt= true;
            System.out.println("Perfecto, ¡ La señal TDT es lo mejor!");
        } else {
            tdt=false;
            System.out.println("¿TDT?, es mejor nexflix :v");
        }
        int precioFina=precioFinal(elect.getPeso(), elect.getConsumo());
        elect.setPrecio(precioFina);
        return new Televisor(elect.getPrecio(), elect.getColor(), elect.getConsumo(), elect.getPeso(), pulgadas, tdt);
        
           }
    
    public int precioFinal(int peso, char consumo,int pulgadas, boolean tdt) {
      int precioBase = super.precioFinal(peso, consumo);
      int precioFinalTelevisor = precioBase;
      
      
      if (pulgadas> 40) {
         double porcentajeincremento = 0.30;
         double incremento = precioBase * porcentajeincremento;
        precioFinalTelevisor += (int) incremento;
    }
    if (tdt==true){
        precioFinalTelevisor += 500;
    }
        return precioFinalTelevisor;
        
    }
}

        
        
 
