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
    
    public DoblePar() {
    }
        
    public boolean soy(ArrayList<Carta> cartas) {
        
        int cantPares = 0;

        Carta ultimaCarta = cartas.get(0);
        for(int i = 1; i < cartas.size(); i++){            
                if(cartas.get(i).getValor() == ultimaCarta.getValor()){
                    if(cantPares == 1) return true;    
                    cantPares++;
                }
                ultimaCarta = cartas.get(i);
            }
        return false;
     }      
        
    @Override
    public String toString() {
        return "DoblePar";
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
            //Hay empate en primer par. reviso segundo
            comparado = m1DeFigura.get(1).compareToSinPalo(m2DeFigura.get(1));
            if(comparado != 0) return comparado;
            //Hay empate en segundo par, que hijo de puta. Reviso mas alta.
            return m1NoDeFigura.get(0).compareTo(m2NoDeFigura.get(0));            
    }
    
    
        private ArrayList devolverCartasFigura(ArrayList<Carta> cartas) {
        
        ArrayList listas = new ArrayList();
        ArrayList<Carta> cartasDeFigura = new ArrayList();
        ArrayList<Carta> cartasNoDeFigura =  (ArrayList<Carta>) cartas.clone();
        listas.add(cartasDeFigura);
        listas.add(cartasNoDeFigura);
        
        int cantPares = 0;
        Carta ultimaCarta = cartasNoDeFigura.get(0);
            
        for(int i = 1; i < cartasNoDeFigura.size(); i++){            
                if(cartasNoDeFigura.get(i).getValor() == ultimaCarta.getValor())
                {
                    cartasDeFigura.add(cartas.get(i));
                    cartasNoDeFigura.remove(ultimaCarta);
                    cartasNoDeFigura.remove(cartas.get(i));
                    cantPares++;
                    i=0;
                    if(cantPares == 2)  return listas;                   
                }
                ultimaCarta = cartasNoDeFigura.get(i);
            }
            return null;
        }      
        
}
