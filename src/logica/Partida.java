/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Ninja
 */
public class Partida {
    private ArrayList<JugadorApostando> jugadores;
    
    public Partida(ArrayList<Jugador> jug){
        for (Jugador j:jug){
            jugadores.add(new JugadorApostando(jug));
        }
    }
    
    
    jugadorApuesta(int 50peso){
        //Poner 50 pesos en el pozo, se resta de jugador
        //Le pregunto a todos si se suman o no
        //Si te sumas pones guita en el pozo, sino booleano = false y estas
        //deshabilitado.
        //Se juega y se determina ganador, se reparte pozo
        //Se reinicia mano, jugadores se pueden ir, resetear booleanos
        
    }
    
}
