/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import logica.Partida;

/**
 *
 * @author danie
 */
public interface VistaMonitorPartidas {
    
    public void mostrarValores(int luz, int cantJugadores);
    
    public void mostrarPartidasAct(ArrayList<Partida> partidas);
    
}
