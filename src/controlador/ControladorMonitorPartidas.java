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
import logica.PartidaException;
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
        
        if(evento.equals(SistemaPartidas.Eventos.cambioEnPartida)){
            vista.mostrarPartidasAct(s.obtenerTodasLasPartidas());
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
    
        try{
            s.modificarLuz(luz);
            vista.mostrarLuz(s.obtenerLuzPartida());
        }catch(PartidaException ex){
             vista.mostrarError(ex.getMessage());
        }        
    }

    public void modificarCantJugadores(int cantJ) {        
        try{
            s.modificarCantJugadores(cantJ);
            vista.mostrarCantJugadores(s.obtenerCantJugadores());         
        }catch(PartidaException ex){
             vista.mostrarError(ex.getMessage());
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
