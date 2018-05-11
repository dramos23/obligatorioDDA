/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import logica.Apuesta;
import logica.Carta;
import logica.JugadorParticipante;
import logica.Partida;

/**
 *
 * @author Daniel
 */
public interface VistaPartida {
    
    public void mostrarCartas(ArrayList<Carta> cartas);
    
    public void mostrarCartaGanadora(Carta carta);
    
    public void mostrarJugadores(ArrayList<JugadorParticipante> jugadores);
    
    public void mostrarValores(int luz, int pozo, int dineroJugador);
    
    public void mostrarEstado(String estado);
    
    public void mostrarApuesta(Apuesta a);
    
    public void cambiaDinero(JugadorParticipante jugador);
    
    //public void cambiarPozo(int dinero);

    public void esconderAndMostrarAlInicio();
    
    public void iniciarPartida(JugadorParticipante j);

    public void esconderPanelAceptarApuesta();

    public void esconderPanelRealizarApuesta();

    public void togglePanelJuegaMano();
    
}
