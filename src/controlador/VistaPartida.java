/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JButton;
import logica.Apuesta;
import logica.Carta;
import logica.JugadorParticipante;


/**
 *
 * @author Daniel
 */
public interface VistaPartida {
    
    public void mostrarCarta(Carta carta, JButton btn);
        
    public void mostrarJugadores(ArrayList<JugadorParticipante> jugadores);
    
    public void mostrarJugadoresMano(ArrayList<JugadorParticipante> jugadores);
    
    public void mostrarValores(int luz, int pozo, int dineroJugador);
    
    public void mostrarEstado(String estado);
    
    public void mostrarApuesta(Apuesta a);
    
    public void mostrarGanador(JugadorParticipante j);

    public void mostrarMano(ArrayList<Carta> cartas);    
        
    public void mostrarNombreJugador(String nombreCompleto);

    public void mostrarGanadorPorSerUltimo(JugadorParticipante ganador);
    
    public void mostrarMensaje(String msg);

    public void cambiaDinero(JugadorParticipante jugador);
    
    public void inicioRonda(JugadorParticipante jugador);

    public void esconderAndMostrarAlInicio();
    
    public void iniciarPartida(JugadorParticipante j);
    
    public void todosPasan();

    public void finMano();

    public void aceptarApuesta();

    public void actualizarPozo(int pozo);

    public void jugadorAposto();

    public void jugadorNoPuedeSeguir(String msg);
    
    public void cerrarVentana();

    public void iniciaContador(String toString);

    public void finalizarContador();

    public void actualizarContador(String contador);

    
}
