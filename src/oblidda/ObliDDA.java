/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblidda;

import logica.Carta;
import logica.Jugador;
import logica.Mazo;
import logica.Mazo.palos;
import logica.Partida;



/**
 *
 * @author Ninja
 */
public class ObliDDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Partida p = new Partida(5, 50);
        p.ingresar(new Jugador("Pepe123", "123", "Pepe", 500));
        p.ingresar(new Jugador("Juan123", "123", "Juan", 500));
        p.ingresar(new Jugador("Maria123", "123", "Mari", 500));
        p.ingresar(new Jugador("Joaquina123", "123", "Joaqui", 500));
        p.ingresar(new Jugador("Nicolas123", "123", "Nico", 500));
        
        p.repartirCartas();
        p.darGanador();

        /*
        // TODO code application logic here
        Mazo m = new Mazo();
        /*for (int i = 0; i < 52; i++){
            m.imprimirCarta();
        }
        Carta c1 = new Carta(palos.CORAZON, 2);
        Carta c2 = new Carta(palos.TREBOL, 2);
        if (c1.compareTo(c2) == 1) System.out.println("gana corazón"); else System.out.println("gana Trebol"); 
        Carta c3 = new Carta(palos.CORAZON, 2);
        Carta c4 = new Carta(palos.TREBOL, 10);
        if (c3.compareTo(c4) == -1) System.out.println("gana trebol"); else System.out.println("gana corazon");
        Carta c5 = new Carta(palos.TREBOL, 2);
        Carta c6 = new Carta(palos.TREBOL, 10);
        if (c5.compareTo(c6) == -1) System.out.println("gana trebol 10"); else System.out.println("gana trebol 2"); 
    */
    }
    
}
