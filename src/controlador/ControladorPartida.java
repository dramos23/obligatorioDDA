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
    private Partida partida;
    private VistaPartida vista;
    
    public ControladorPartida(JugadorParticipante jugador, VistaPartida vista){
        this.jugador = jugador;
        this.partida = jugador.getPartida();
        this.vista = vista;
        partida.addObserver(this);
        vista.mostrarCartas(jugador.getMano());
        vista.mostrarJugadores(partida.getJugadoresParticipantes());
        //vista.mostrarEstado()        
    }

    @Override
    public void update(Observable o, Object evento) {
        
        if(evento.equals(Partida.Eventos.jAbandonaPartida)){
            vista.mostrarJugadores(partida.getJugadoresParticipantes());
        }
        
        if(evento.equals(Partida.Eventos.jApuesta))
        {
            if(!this.jugador.equals(partida.getApuesta().getApostador())) 
                vista.mostrarApuesta(partida.getApuesta());
        }
    }

    public void removerJugador() {
        this.partida.removerJugador(jugador);
    }

    public void aceptarApuesta() {
        //Codigo de aceptar apuesta.
    }
    
}
