/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import logica.Partida;

/**
 *
 * @author danie
 */
public class ControladorMonitorPartidas implements Observer{
    
    private VistaMonitorPartidas vista;
    private Partida partida;
    
    public ControladorMonitorPartidas(VistaMonitorPartidas vista, Partida p) {
        this.vista = vista;
        this.partida = p;
        partida.addObserver(this);
        iniciarVentana();
    }

    @Override
    public void update(Observable o, Object evento) {
        if(evento.equals(Partida.Eventos.cambiarLuz)){
            vista.mostrarValores(partida.getLuz(), partida.getCantJugadores());
        }
    }
    
    public void iniciarVentana()
    {
        vista.mostrarValores(partida.getLuz(), partida.getCantJugadores());
    }
    
    public void modificarLuz(Partida p, int luz) {
        if(this.partida.equals(p)){
            this.partida.setLuz(luz);
            vista.mostrarValores(partida.getLuz(), partida.getCantJugadores());
        }
    }

    public void modificarCantJugadores(Partida p, int cantJ) {
        if(this.partida.equals(p)){
            this.partida.setCantJugadores(cantJ);
            vista.mostrarValores(partida.getLuz(), partida.getCantJugadores());
        }
    }
    
}
