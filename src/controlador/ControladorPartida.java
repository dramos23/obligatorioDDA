/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import logica.JugadorParticipante;

import logica.Partida;

/**
 *
 * @author Daniel
 */
public class ControladorPartida implements Observer {
    
    private JugadorParticipante jugador;
    private VistaPartida vista;
    
    public ControladorPartida(JugadorParticipante jugador, VistaPartida vista){
        this.jugador = jugador;
        this.vista = vista;
        jugador.getPartida().addObserver(this);
        vista.mostrarCartas(jugador.getMano());
        vista.mostrarJugadores(jugador.getPartida().getJugadoresParticipantes());
        //vista.mostrarEstado()
        
    }

    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Partida.Eventos.jAbandonaPartida)){
           vista.mostrarJugadores(jugador.getPartida().getJugadoresParticipantes());
        }
        if(evento.equals(Partida.Eventos.jApuesta)){
           vista.mostrarApuesta(jugador.getPartida().getJugadoresSinMi(jugador));
           
        }
        
    }
    
}
