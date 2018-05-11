/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Jugador;
import logica.JugadorParticipante;

/**
 *
 * @author danie
 */
public interface VistaLoginJugador {
    
    public void mostrarError(String msg);

    public void mostrarPartida(JugadorParticipante jp);
    
}
