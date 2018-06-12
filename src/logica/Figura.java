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
public abstract class Figura {
    
    private int valor;
    
    public Figura(){}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public int compareTo(Figura b){
          if(this.valor < b.valor) return -1;
          else if(this.valor > b.valor) return 1;
          else return 0;
    }

    @Override
    public String toString() {
        return "Figura";
    }

        
    public static Figura RevisarFigura(ArrayList<Carta> mano){
        ArrayList<Figura> figuras = Sistema.getInstancia().getFiguras();        
        for(Figura fig : figuras){
            if(fig.soy(mano))
                return fig;
        }
        return null;
    }
    
    public abstract int desempatar(ArrayList<Carta> mano1, ArrayList<Carta> mano2);
    
    public abstract boolean soy(ArrayList<Carta> mano);
    
}
