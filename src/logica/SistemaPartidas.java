/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Observable;
import logica.Partida.Eventos;

/**
 *
 * @author FAT
 */
public class SistemaPartidas extends Observable{
    
    private ArrayList<Partida> partidas = new ArrayList();
    private Partida proximaPartida;
    private int valorLuz;
    private int cantJugadoresPorPartida;

    
    
    public enum Eventos{
        comienzaPartida
    }
    
    public SistemaPartidas(){
        proximaPartida = new Partida(valorLuz, cantJugadoresPorPartida, this);
    }

    
    public JugadorParticipante ingresar(Jugador j){
        JugadorParticipante jp = proximaPartida.ingresar(j);
        
        if(jp != null)
        {
            if(proximaPartida.completa()){
                //Empezar proxima partida y crear una nproximaPartida nueva.
                Partida nuevaProx = new Partida(cantJugadoresPorPartida, valorLuz, this);
                partidas.add(nuevaProx);
                avisar(Eventos.comienzaPartida);
                proximaPartida = nuevaProx;
            }
        }
        return jp;
    }

        //Throws exception

    public void setLuz(int valorLuz) {
        this.valorLuz = valorLuz;
        if(proximaPartida.getJugadoresParticipantes().isEmpty()) proximaPartida.setLuz(valorLuz);
        //avisar(Eventos.cambiarLuz);
    }

        //Throws exception
    public void setCantJugadores(int cantJugadoresPorPartida) {
        this.cantJugadoresPorPartida = cantJugadoresPorPartida;
        if(proximaPartida.getJugadoresParticipantes().isEmpty()) proximaPartida.setCantJugadores(cantJugadoresPorPartida);
        //avisar(Eventos.cambiarCantJugadores);
    }
    
    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public int getValorLuz() {
        return valorLuz;
    }

    public int getCantJugadoresPorPartida() {
        return cantJugadoresPorPartida;
    }

    public Partida getProximaPartida() {
        return proximaPartida;
    }
    
    public void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
    }

    public void avisarCambioEnPartida(Partida.Eventos evento) {
        setChanged();
        notifyObservers(evento);
    }

    
}
