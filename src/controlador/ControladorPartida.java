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

/**W
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
        vista.esconderAndMostrarAlInicio();
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
        
        if(evento.equals(Partida.Eventos.jAceptaApuesta)){
            vista.cambiaDinero(jugador);           
        }
        
        if(evento.equals(Partida.Eventos.empiezaPartida))
        {
            vista.iniciarPartida(this.jugador);
        }
        
        if(evento.equals(Partida.Eventos.entroJugador))
        {
            vista.mostrarJugadores(partida.getJugadoresParticipantes());
        }
    }

    public void removerJugador() {
        this.partida.removerJugador(jugador);
    }

    public void aceptarApuesta() {
        //Codigo de aceptar apuesta.
    }

    public void realizarApuesta(JugadorParticipante jugador, int dinero) {
        if(partida.verificarApuesta(dinero)){
            partida.realizarApuesta(jugador, dinero);            
        }else
        {
            //vista.darError("Uno de los jugadores no puede pagar esta apuesta.");
        }
    }
    
}
