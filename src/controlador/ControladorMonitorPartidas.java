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
        if(evento.equals()){
            //vista.mostrarValores(Sistema.getInstancia()., partida.getCantJugadores());
        }
    }
    
    public void iniciarVentana()
    {
        vista.mostrarValores(s.obtenerLuzPartida(), s.obtenerCantJugadores());
        mostrarPartidasAct();
    }
    
    public void modificarLuz(int luz) {
        s.modificarLuz(luz);
        vista.mostrarValores(s.obtenerLuzPartida(), s.obtenerCantJugadores());

    }

    public void modificarCantJugadores(int cantJ) {
        s.modificarCantJugadores(cantJ);
        vista.mostrarValores(s.obtenerLuzPartida(), s.obtenerCantJugadores());
        
    }
    
    public void mostrarPartidasAct(){
        vista.mostrarPartidasAct(s.obtenerPartidasAct());
    }
    
}
