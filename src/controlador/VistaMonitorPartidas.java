/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import logica.JugadorParticipante;
import logica.Partida;

/**
 *
 * @author danie
 */
public interface VistaMonitorPartidas {
    
    public void mostrarPartidasAct(ArrayList<Partida> partidas);

    public void mostrarLuz(int obtenerLuzPartida);

    public void mostrarCantJugadores(int obtenerCantJugadores);

    public void mostrarDatosPartida(ArrayList<JugadorParticipante> jugadoresParticipantes);

    public void mostrarError(String el_valor_luz_debe_ser_mayor_a_cero);
    
}
