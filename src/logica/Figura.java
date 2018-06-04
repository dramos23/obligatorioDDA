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
public class Figura {
    
    private int valor;
    private ArrayList<Carta> cartasQueComponenFigura;
    private ArrayList<Carta> cartasQueNoComponenFigura;

    public Figura(int valor, ArrayList<Carta> cartasQueComponenFigura, ArrayList<Carta> cartasQueNoComponenFigura) {
        this.valor = valor;
        this.cartasQueComponenFigura = cartasQueComponenFigura;
        this.cartasQueNoComponenFigura = cartasQueNoComponenFigura;
    }
    
    public Figura(){}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Carta> getCartasQueComponenFigura() {
        return cartasQueComponenFigura;
    }

    public void setCartasQueComponenFigura(ArrayList<Carta> cartasQueComponenFigura) {
        this.cartasQueComponenFigura = cartasQueComponenFigura;
    }

    public ArrayList<Carta> getCartasQueNoComponenFigura() {
        return cartasQueNoComponenFigura;
    }

    public void setCartasQueNoComponenFigura(ArrayList<Carta> cartasQueNoComponenFigura) {
        this.cartasQueNoComponenFigura = cartasQueNoComponenFigura;
    }

    public int compareTo(Figura b){
        
        if (this.cartasQueComponenFigura.get(0).getPalo().ordinal() >  b.cartasQueComponenFigura.get(0).getPalo().ordinal()){
            return -1;
        } else if (this.cartasQueComponenFigura.get(0).getPalo().ordinal() ==  b.cartasQueComponenFigura.get(0).getPalo().ordinal()){
            
            if (this.cartasQueComponenFigura.get(1).getPalo().ordinal() >  b.cartasQueComponenFigura.get(1).getPalo().ordinal()){
                return -1;
            }else if (this.cartasQueComponenFigura.get(1).getPalo().ordinal() ==  b.cartasQueComponenFigura.get(1).getPalo().ordinal()){
                
                if (this.cartasQueNoComponenFigura.get(0).compareTo(b.cartasQueNoComponenFigura.get(0)) == -1){
                    return -1;
                }else{
                    return 1;
                }
                
            } else {
                return 1;
            }
            
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Figura";
    }
    
    
}
