/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Ninja
 */
public class JugadorApostando {
    private Jugador jugador;
    private ArrayList<Carta> mano = new ArrayList();
    private boolean juegaMano = true;

    public JugadorApostando(Jugador jugador) {
        this.jugador = jugador;
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
    
    public boolean apostar(int dinero){
        if(this.jugador.getSaldo() < dinero) return false;
        this.jugador.setSaldo(this.jugador.getSaldo() - dinero);
        return true;
    }
   
   
   public Carta devolverMasAlta(){
        Carta mejor = new Carta();
        for(Carta c:mano){
            if(mejor.compareTo(c) == -1) mejor = c;
        }
   
        return mejor;
   }
    
}
