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
    
    
    public Color(){
        this.setValor(0);
    }


    @Override
    public String toString() {
        return "Color";
    }

    @Override
    public int desempatar(ArrayList<Carta> mano1, ArrayList<Carta> mano2) {
            if(mano1.get(0).getPalo().ordinal() < mano2.get(0).getPalo().ordinal()) return -1;
            if(mano1.get(0).getPalo().ordinal() > mano2.get(0).getPalo().ordinal()) return 1;
            return mano1.get(4).compareTo(mano2.get(4));
    }

    @Override
    public boolean soy(ArrayList<Carta> cartas) {
        Mazo.palos p = cartas.get(0).getPalo();
        for(int i = 1; i < cartas.size(); i++)
        {
                if(cartas.get(i).getPalo() != p){
                    return false;
                }    
        }
        return true;
    }
    
  
    
}
