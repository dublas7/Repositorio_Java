/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisor;

import Electrodomestico.Electrodomestico;

/**
 *
 * @author Dgarzon
 */
public class Televisor extends Electrodomestico {
    
    private int pulgadas;
    private boolean tdt;

    public Televisor(int precio, String color, char consumo, int peso,int pulgadas, boolean tdt) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
        
        
    }

    public Televisor() {
        
        
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{"
                + "precio=" + getPrecio()
                + ", color='" + getColor() + '\''
                + ", consumo=" + getConsumo()
                + ", peso=" + getPeso()
                + ",pulgadas="
                + pulgadas + ", tdt=" + tdt + '}';
    }
    
   
    
    
}
