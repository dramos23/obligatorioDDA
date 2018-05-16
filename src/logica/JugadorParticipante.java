/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Ninja
 */
public class JugadorParticipante{
    
    private Partida miPartida;
    private Jugador jugador;
    private ArrayList<Carta> mano = new ArrayList();
    int saldoInicial;
    int totalGanado = 0;
    private boolean juegaMano = true;

    public JugadorParticipante(Jugador jugador, Partida par) {
        this.jugador = jugador;
        this.miPartida = par;
        this.saldoInicial = jugador.getSaldo();
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
   
   public String toString(){
       return this.jugador.getNombre();
   }
    
   public void pagarDinero(int dinero){
       if(jugador.apostar(dinero)) miPartida.sumarAPozo(dinero);
   }

    public boolean apostar(int dinero){
        if(jugador.apostar(dinero))
        {
            miPartida.sumarAPozo(dinero);
            return true;
        }
        return false;
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
}
