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
public class Jugador extends Usuario{
   
    private int saldo;
    private Observable obs = new Observable();
    private ArrayList<Partida> partidas = new ArrayList();
    
    public enum Eventos {
        cambioSaldo;
    }
    
    public Jugador(String nombre, String pass, String nombreCompleto, int dineroInicial) {
            super(nombre, pass, nombreCompleto);
            saldo = dineroInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
           
    //Throws
    public boolean apostar(int dinero){
        if(tengoSaldo(dinero)) 
        {
            this.setSaldo(this.getSaldo() - dinero);
            avisar(Eventos.cambioSaldo);
            return true;
        }     
        return false;
    }
    
    public boolean tengoSaldo(int dinero){
        if(this.getSaldo() < dinero) return false;
        return true;
    }
    

    void ganarDinero(int dinero) {
        this.saldo += dinero;
    }

    void agregarPartida(Partida miPartida) {
        this.partidas.add(miPartida);
    }
    
    private void avisar(Eventos evento) {
            setChanged();
            notifyObservers(evento);   
    }


}
