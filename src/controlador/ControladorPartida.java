/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import logica.Apuesta;
import logica.Jugador;
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
        jugador.getJugador().addObserver(this);
        vista.mostrarNombreJugador(jugador.getNombreCompleto());
        iniciarVentana();
    }

    @Override
    public void update(Observable o, Object evento) {
        
        if(evento.equals(Partida.Eventos.jAbandonaPartida)){            
              vista.mostrarJugadores(partida.getJugadoresParticipantes());            
        }  
        
        if(evento.equals(Partida.Eventos.finalizoPartida)){
            vista.jugadorNoPuedeSeguir("Debido a la falta de jugadores se há terminado la partida.");
        }
        
        if(evento.equals(Partida.Eventos.jApuesta))
        {         
            if(!this.jugador.equals(partida.getApuesta().getApostador())) 
                vista.mostrarApuesta(partida.getApuesta());
            else
                vista.jugadorAposto();
        }
        
        if(evento.equals(Partida.Eventos.jAceptaApuesta)){
            vista.cambiaDinero(jugador);           
        }
        
        if(evento.equals(Partida.Eventos.entroJugador))
        {
            vista.mostrarJugadores(partida.getJugadoresParticipantes());
        }
        if(evento.equals(Partida.Eventos.comienzaPartida))
        {
            vista.iniciarPartida(jugador);
        }
            
        if(evento.equals(Partida.Eventos.cambiaPozo)){
            vista.cambiaDinero(jugador);
        }
        if(evento.equals(Partida.Eventos.hayGanador)){
            vista.mostrarGanador(partida.getApuesta().getGanador());
        }if(evento.equals(Partida.Eventos.todosPasaron)){
            vista.todosPasan();
        }

    }

    public void removerJugador() {
        if (this.partida.finalizada()){
            
            partida.deleteObserver(this);
        }
        vista.cerrarVentana();
        this.partida.removerJugador(jugador);
        
    }

    public void aceptarApuesta() {
        Apuesta a = partida.getApuesta();     
        this.jugador.setJuegaMano(true);
        partida.jugadorAceptaApuesta(jugador, a.getMontoApostado()); 
        vista.aceptarApuesta();
    }
    
    public boolean comenzoPartida(){
          return this.partida.revisarComienzoPartida();
    }

    public void realizarApuesta(JugadorParticipante jugador, int dinero) {
        if(partida.verificarApuesta(dinero)){
            partida.realizarApuesta(jugador, dinero);         
        }else
        {
            //vista.darError("Uno de los jugadores no puede pagar esta apuesta.");
        }
    }

    public void juegaMano() {
        this.jugador.setJuegaMano(true);
        this.vista.mostrarMano(jugador.getMano());
    }
    
    public void iniciarVentana()
    {
        vista.esconderAndMostrarAlInicio();
        vista.mostrarJugadores(partida.getJugadoresParticipantes());
        if(comenzoPartida()) vista.iniciarPartida(jugador);
    }
    
    public void revisarSiPuedeContinuar()
    {
        if(!jugador.puedeSeguir()) {
            vista.jugadorNoPuedeSeguir("No hay saldo suficiente para continuar jugando. Ha sido removido de la partida.");
            partida.removerJugador(jugador);
        }
    }

    public void pasarApuesta() {
        partida.jugadorPasaApuesta(jugador);
    }
    
}
