/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author FAT
 */
public class SistemaPartidas {
    
    private ArrayList<Partida> partidas = new ArrayList();
    private Partida proximaPartida;
    private int valorLuz;
    private int cantJugadoresPorPartida;
     
    public SistemaPartidas(){
        
    }

    public void ingresar(Jugador j){
        if(proximaPartida.ingresar(j)){
            
        }
    }
    
    
    
}
