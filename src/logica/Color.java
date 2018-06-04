/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Color extends Figura {
    
    public Color(int valor, ArrayList<Carta> cartasQueComponenFigura, ArrayList<Carta> cartasQueNoComponenFigura) {
        super(valor, cartasQueComponenFigura, cartasQueNoComponenFigura);
    }
    
    public Color(){
    
    }

    @Override
    public int compareTo(Figura b){
    
        if(this.getCartasQueComponenFigura().get(1).getPalo().ordinal() > b.getCartasQueComponenFigura().get(1).getPalo().ordinal()){
            return 1;
        } else {
            return 2;
        }
    }
    
    public boolean soyColor(ArrayList<Carta> cartas) {
        Mazo.palos p = cartas.get(0).getPalo();
        for(int i = 1; i < cartas.size(); i++)
        {
                if(cartas.get(i).getPalo() != p){
                    return false;
                }    
        }
        this.setValor(0);
        this.setCartasQueComponenFigura(cartas);
        this.setCartasQueNoComponenFigura(null);
        return true;
    }

    @Override
    public String toString() {
        return "Color";
    }
    
    
}
