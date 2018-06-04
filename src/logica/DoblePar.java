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
public class DoblePar extends Figura{
    
    public DoblePar(int valor, ArrayList<Carta> cartasQueComponenFigura, ArrayList<Carta> cartasQueNoComponenFigura) {
        super(valor, cartasQueComponenFigura, cartasQueNoComponenFigura);
    }
    
    public DoblePar(){
    
    }
    
    public boolean soyDoblePar(ArrayList<Carta> cartas) {
        
        int cantPares = 0;
        ArrayList<Carta> cartasDeFigura = new ArrayList();
        ArrayList<Carta> cartasNoDeFigura =  (ArrayList<Carta>) cartas.clone();
                
        for(int i = 0; i < cartasNoDeFigura.size(); i++){
            
            Carta ultimaCarta = cartasNoDeFigura.get(i);
            for(int j = i + 1; j < cartasNoDeFigura.size(); j++){
                if(cartasNoDeFigura.get(j).getValor() == ultimaCarta.getValor()){
                    cartasDeFigura.add(cartas.get(j));
                    cartasNoDeFigura.remove(ultimaCarta);
                    cartasNoDeFigura.remove(cartas.get(j));
                    ultimaCarta = cartasNoDeFigura.get(0);
                    cantPares++;
                    break;
                }
            }
        }      
        
        if(cantPares == 2){
            this.setValor(0);
            this.setCartasQueComponenFigura(cartasDeFigura);
            this.setCartasQueNoComponenFigura(cartasNoDeFigura);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "DoblePar";
    }
    
}
