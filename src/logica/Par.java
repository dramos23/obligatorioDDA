/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author danie
 */
public class Par extends Figura{
    
    public Par(){
        this.setValor(2);
    }
    
    @Override
    public boolean soy(ArrayList<Carta> cartas) {
        
        Carta ultimaCarta = cartas.get(0);
        for(int i = 1; i < cartas.size(); i++){            
                if(cartas.get(i).getValor() == ultimaCarta.getValor()){
                    return true;    
                }
                ultimaCarta = cartas.get(i);
            }
        return false;
     }      
        

    @Override
    public String toString() {
        return "Par";
    }

    @Override
    public int desempatar(ArrayList<Carta> mano1, ArrayList<Carta> mano2) {
            
            //Obtenemos las listas de cartas que componen la figura y las que no.
            ArrayList cartas = devolverCartasFigura(mano1);
            ArrayList cartas2 = devolverCartasFigura(mano2);
            ArrayList<Carta> m1DeFigura = (ArrayList<Carta>) cartas.get(0);
            ArrayList<Carta> m1NoDeFigura = (ArrayList<Carta>) cartas.get(1);
            ArrayList<Carta> m2DeFigura = (ArrayList<Carta>) cartas2.get(0);
            ArrayList<Carta> m2NoDeFigura = (ArrayList<Carta>) cartas2.get(1);
            
            //Comparamos las cartas que componen la figura. Si hay empate, se pasa a las cartas que no componen.
            int comparado = m1DeFigura.get(0).compareToSinPalo(m2DeFigura.get(0));
            //No hay empate.
            if(comparado != 0) return comparado;
            //Hay empate.
            return m1NoDeFigura.get(0).compareTo(m2NoDeFigura.get(0));            
    }
    
    
        private ArrayList devolverCartasFigura(ArrayList<Carta> cartas) {
        
        ArrayList listas = new ArrayList();
        ArrayList<Carta> cartasDeFigura = new ArrayList();
        ArrayList<Carta> cartasNoDeFigura =  (ArrayList<Carta>) cartas.clone();
        listas.add(cartasDeFigura);
        listas.add(cartasNoDeFigura);
        
        Carta ultimaCarta = cartasNoDeFigura.get(0);
            
        for(int i = 1; i < cartasNoDeFigura.size(); i++){            
                if(cartasNoDeFigura.get(i).getValor() == ultimaCarta.getValor())
                {
                    cartasDeFigura.add(cartas.get(i));
                    cartasNoDeFigura.remove(ultimaCarta);
                    cartasNoDeFigura.remove(cartas.get(i));
                    return listas;
                }
                ultimaCarta = cartasNoDeFigura.get(i);
            }
            return null;
        }      
        
}
  
