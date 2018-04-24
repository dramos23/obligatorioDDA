/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblidda;

import logica.Carta;
import logica.Mazo;
import logica.Mazo.palos;



/**
 *
 * @author Ninja
 */
public class ObliDDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mazo m = new Mazo();
        /*for (int i = 0; i < 52; i++){
            m.imprimirCarta();
        }*/
        Carta c1 = new Carta(palos.Corazon, 2);
        Carta c2 = new Carta(palos.Trebol, 2);
        if (c1.compareTo(c2) == 1) System.out.println("gana corazón"); else System.out.println("gana Trebol"); 
        Carta c3 = new Carta(palos.Corazon, 2);
        Carta c4 = new Carta(palos.Trebol, 10);
        if (c3.compareTo(c4) == -1) System.out.println("gana trebol"); else System.out.println("gana corazon");
        Carta c5 = new Carta(palos.Trebol, 2);
        Carta c6 = new Carta(palos.Trebol, 10);
        if (c5.compareTo(c6) == -1) System.out.println("gana trebol 10"); else System.out.println("gana trebol 2"); 
    }
    
}
