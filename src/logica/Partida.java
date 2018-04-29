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
    private ArrayList<JugadorParticipante> jugadores;
    
    private Mazo mazo = new Mazo();
    
    private int pozo;
    
    public Partida(ArrayList<Jugador> jug){
        for (Jugador j:jug){
            jugadores.add(new JugadorParticipante(j));
        }
    }
    
    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.
    
        public void comenzarRonda(){
        mazo = new Mazo();
        agregarLuzAPozo();
        repartirCartas();        
        }

    
      //Se quita el valor de la luz a los jugadores. Si no quieren poner la luz, no juegan la mano o se van de la partida. (cual?)
        public void agregarLuzAPozo(){
        //Como obtenemos el valor de la luz? Estarìa en SistemaPartidas, pero como hacer para que llegue a clase Partida?
        int luz = obtenerValorLuz();
        for(JugadorParticipante j:jugadores){
            //Se llama al metodo que quita la el valor de la luz a cada jugador. El metodo esta en el jugador, no en partida, 
            //porque es el jugador el que tiene que entregar su dinero. Si devuelve true, el jugador decidio jugar.
            if(j.apostar(luz)) pozo += luz;
            else {}//El jugador no puso la luz, habría que sacarlo de la partida.
        }
    }
    
    //Se asigna la mano de cada jugador recorriendo el array de jugadores y revisando los que van a jugar esta ronda.
        public void repartirCartas(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()) j.setMano(mazo.dar5());
        }              
    }
        
         //Queda a definir este método
        public int obtenerValorLuz()
        {
                return 0;
        }  
     
    
    
    
 /*
    jugadorApuesta(int 50peso){
        //Poner 50 pesos en el pozo, se resta de jugador
        //Le pregunto a todos si se suman o no
        //Si te sumas pones guita en el pozo, sino booleano = false y estas
        //deshabilitado.
        //Se juega y se determina ganador, se reparte pozo
        //Se reinicia mano, jugadores se pueden ir, resetear booleanos
        
    }
    */
}
