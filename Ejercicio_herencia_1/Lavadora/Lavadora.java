/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lavadora;

import Electrodomestico.Electrodomestico;

/**
 *
 * @author Dgarzon
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga =carga;
        
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
    return "Lavadora{" +
           "precio=" + getPrecio() +
           ", color='" + getColor() + '\'' +
           ", consumo=" + getConsumo() +
           ", peso=" + getPeso() +
           ", carga=" + carga +
           '}';
    }

   
}

 

    