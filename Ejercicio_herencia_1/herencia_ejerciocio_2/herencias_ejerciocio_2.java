/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejerciocio_2;



import Lavadora.Lavadora;
import Lavadora.LavadoraServices;
import Televisor.Televisor;
import Televisor.TelevisorServices;

/**
 *
 * @author Dgarzon
 */
public class herencias_ejerciocio_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Crearemos una lavadora");
        LavadoraServices lavadoraService = new LavadoraServices();
        Lavadora miLavadora = lavadoraService.crearLavadora();
        System.out.println("Lavadora creada: " + miLavadora.toString());
        
        System.out.println("************************************");
        
        System.out.println("Crearemos un televisor");
        TelevisorServices ts = new TelevisorServices();
        Televisor miTelevisor = ts.creartelevisor();
        System.out.println("Televisor creado:" + miTelevisor.toString());

    }
    
}
