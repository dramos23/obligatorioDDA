/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import logica.Carta;
import logica.JugadorParticipante;

/**
 *
 * @author Daniel
 */
public interface VistaPartida {
    
    public void mostrarCartas(ArrayList<Carta> cartas);
    
    public void mostrarCartaGnadora(Carta carta);
    
    public void mostrarJugadores(ArrayList<JugadorParticipante> jugadores);
    
    public void mostrarValores(int luz, int pozo);
    
    public void mostrarEstado(String estado);
    
    public void mostrarApuesta(ArrayList<JugadorParticipante> jugador);
    
    public void responderApuesta(JugadorParticipante jugador);
    
    
}
