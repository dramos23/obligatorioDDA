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
        comienzaPartida, cambiarLuz, cambiarCantJugadores, cambioEnPartida
    }
    
    public SistemaPartidas(){
        proximaPartida = new Partida(valorLuz, cantJugadoresPorPartida, this);
    }

    
    public JugadorParticipante ingresar(Jugador j) throws PartidaException{
        JugadorParticipante jp = proximaPartida.ingresar(j);        
         
        if(proximaPartida.revisarComienzoPartida())                
                iniciarProxPartida();
        return jp;
    }

        //Throws exception

    public void setLuz(int nuevaLuz) throws PartidaException {
        if (nuevaLuz <= 0) throw new PartidaException("El valor de la luz debe ser mayor a 0");
        if(nuevaLuz == valorLuz) return;
        this.valorLuz = nuevaLuz;
        proximaPartida.setLuz(nuevaLuz);
        avisar(Eventos.cambiarLuz);   
    }

        //Throws exception
    public void setCantJugadores(int cantJug) throws PartidaException{
        
        if (cantJug < 2 || cantJug > 5) throw new PartidaException("La cantidad de jugadores debe estar entre 2 y 5");
        if(cantJug == this.cantJugadoresPorPartida) return;        
        this.cantJugadoresPorPartida = cantJug;
        proximaPartida.setCantJugadores(cantJug);
        avisar(Eventos.cambiarCantJugadores);
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

    public void avisarCambioEnPartida(Eventos evento) {
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
