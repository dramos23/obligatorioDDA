/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import logica.Admin;
import logica.Partida;
import logica.Sistema;
import logica.SistemaPartidas;

/**
 *
 * @author danie
 */
public class ControladorMonitorPartidas implements Observer{
    
    private VistaMonitorPartidas vista;
    private Admin adm;
    private Sistema s = Sistema.getInstancia();
    
    public ControladorMonitorPartidas(VistaMonitorPartidas vista, Admin a) {
        this.vista = vista;
        this.adm = a;
                
        Sistema.getInstancia().addObsSP(this);
        iniciarVentana();
    }

    @Override
    public void update(Observable o, Object evento) {
        
        if(evento.equals(SistemaPartidas.Eventos.cambiarLuz)){
            vista.mostrarLuz(s.obtenerLuzPartida());
        }
        
        if(evento.equals(SistemaPartidas.Eventos.cambiarCantJugadores)){
            vista.mostrarCantJugadores(s.obtenerCantJugadores());
        }
        
        if(evento.equals(Partida.Eventos.comienzaPartida)){
            vista.mostrarPartidasAct(s.obtenerPartidasAct());
        }
        
        if(evento.equals(Partida.Eventos.finalizoPartida) || evento.equals(Partida.Eventos.jAbandonaPartida)){
            vista.mostrarPartidasAct(s.obtenerPartidasAct());
        }
        
        if(evento.equals(Partida.Eventos.cambiaPozo)){
            vista.mostrarPartidasAct(s.obtenerPartidasAct());
        }            
        
    }
    
    public void iniciarVentana()
    {
        vista.mostrarLuz(s.obtenerLuzPartida());
        vista.mostrarCantJugadores(s.obtenerCantJugadores());
        //vista.mostrarValores(s.obtenerLuzPartida(), s.obtenerCantJugadores());
        mostrarPartidasAct();
    }
    
    public void modificarLuz(int luz) {
        
        if (s.modificarLuz(luz)){
            vista.mostrarLuz(s.obtenerLuzPartida());
        } else {
            vista.mostrarError("El valor luz debe ser mayor a cero.");
        }
        //vista.mostrarValores(s.obtenerLuzPartida(), s.obtenerCantJugadores());

    }

    public void modificarCantJugadores(int cantJ) {        
        if (s.modificarCantJugadores(cantJ)){
            vista.mostrarCantJugadores(s.obtenerCantJugadores());
        } else {
            vista.mostrarError("La cantidad de jugadores debe estar entre 2 y 5.");
        }
        
    }
    
    public void mostrarPartidasAct(){
        vista.mostrarPartidasAct(s.obtenerPartidasAct());
    }
    
    public void obtenerPartidaAct(String f){
        Partida p = s.obtenerPartidaAct(f);
        vista.mostrarDatosPartida(p.getJugadoresParticipantes());
    }
    
}
