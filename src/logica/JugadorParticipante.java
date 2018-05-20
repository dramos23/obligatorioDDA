/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import controlador.ControladorPartida;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Ninja
 */
public class JugadorParticipante{
    
    public enum Estado {
        sinActuar, aposto, paso, juegoProxima
    }

    private Partida miPartida;
    private Jugador jugador;
    private ArrayList<Carta> mano = new ArrayList();
    private Estado miEstado;
    int saldoInicial;
    int totalGanado = 0;
    int totalApostado = 0;
    private boolean juegaMano = true;

    public JugadorParticipante(Jugador jugador, Partida par) {
        this.jugador = jugador;
        this.miPartida = par;
        this.saldoInicial = jugador.getSaldo();
        this.miEstado = Estado.sinActuar;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public boolean isJuegaMano() {
        return juegaMano;
    }

    public void setJuegaMano(boolean juegaMano) {
        this.juegaMano = juegaMano;
    }
    
    /* Metodo apostar viejo
    public boolean apostar(int dinero){
        if(this.jugador.getSaldo() < dinero) return false;
        this.jugador.setSaldo(this.jugador.getSaldo() - dinero);
        return true;
    }
    */ 
    
    //Metodo apostar nuevo
    
    
    public void darLuz(int dinero){
        
    }

    public void ganarDinero(int dinero){
        this.totalGanado += dinero;
        this.jugador.ganarDinero(dinero);
    }
    
   public Carta devolverMasAlta(){
        Carta mejor = new Carta();
        for(Carta c:mano){
            if(mejor.compareTo(c) == -1) mejor = c;
        }   
        return mejor;
   }
   
   public int getSaldoJugador(){
       return this.jugador.getSaldo();
   }
   
   public Partida getPartida(){
       return this.miPartida;
   }
   
   public String getNombre(){
       return this.jugador.getNombre();
   }
   
   public String getNombreCompleto(){
       return this.jugador.nombreCompleto;
   }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public int getTotalApostado() {
        return totalApostado;
    }

    public int getTotalGanado() {
        return totalGanado;
    }
   
   public String toString(){
       return this.jugador.getNombre();
   }
    

    public void apostar(int dinero) throws PartidaException{
        jugador.apostar(dinero);
        cambiarValoresCartera(dinero);
    }
    
    public void pagarDinero(int dinero){
        jugador.pagarDinero(dinero);
        cambiarValoresCartera(dinero);        
    }
   
    public void cambiarValoresCartera(int dinero){
        miEstado = Estado.aposto;    
        this.totalGanado -= dinero;
        this.totalApostado += dinero;
        miPartida.sumarAPozo(dinero);
}
    
    @Override
    public boolean equals(Object o){
        JugadorParticipante jp = (JugadorParticipante) o;
        return jp.getNombre().equalsIgnoreCase(this.getNombre());
    }   

    public boolean puedeSeguir() {
        if(getSaldoJugador() < miPartida.getLuz()) return false;
        return true;
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    
    public Estado getEstado() {
        return miEstado;
    }

    public void setEstado(Estado miEstado) {
        this.miEstado = miEstado;
    }

    
}
