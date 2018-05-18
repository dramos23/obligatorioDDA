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
        comienzaPartida, cambiarLuz, cambiarCantJugadores
    }
    
    public SistemaPartidas(){
        proximaPartida = new Partida(valorLuz, cantJugadoresPorPartida, this);
    }

    
    public JugadorParticipante ingresar(Jugador j){
        JugadorParticipante jp = proximaPartida.ingresar(j);        
        if(jp != null)
        {
            if(proximaPartida.revisarComienzoPartida()) 
                
                iniciarProxPartida();
        }
        return jp;
    }

        //Throws exception

    public boolean setLuz(int nuevaLuz) {
        if (nuevaLuz > 0 && nuevaLuz != valorLuz){
            this.valorLuz = nuevaLuz;
            proximaPartida.setLuz(nuevaLuz);
            avisar(Eventos.cambiarLuz);   
            return true;
        } else {
            return false;
        }
    }

        //Throws exception
    public boolean setCantJugadores(int cantJug) {
        if (cantJug > 1 && cantJug < 6 &&
                cantJug != this.cantJugadoresPorPartida){
            this.cantJugadoresPorPartida = cantJug;
            proximaPartida.setCantJugadores(cantJug);
            avisar(Eventos.cambiarCantJugadores);
            return true;
        } else {
            return false;
        }
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

    public Partida getPartidaAct(String f) {
        for(Partida p:partidas){
            if (p.getFechaHora().equals(f)){
                return p;
            }
        }
        return null;
    }
    
    public void removerPartidaDeLista(Partida p) {
        this.partidas.remove(p);
    }
    
    public void iniciarProxPartida(){
            partidas.add(proximaPartida);
            proximaPartida.avisar(Partida.Eventos.comienzaPartida);
            proximaPartida = new Partida(cantJugadoresPorPartida, valorLuz, this);            
    }
}
