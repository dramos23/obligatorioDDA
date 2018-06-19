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
    
    public enum Eventos {
        cambioSaldo;
    }
    
    public Jugador(String nombre, String pass, String nombreCompleto, int dineroInicial) {
            super(nombre, pass, nombreCompleto);
            saldo = dineroInicial;
    }
    
    public Jugador()
    {
    
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
           
    //Throws
    public void apostar(int dinero) throws PartidaException{
        if(tengoSaldo(dinero)) 
        {
            pagarDinero(dinero);
        }else throw new PartidaException("No tiene saldo suficiente para realizar esa apuesta.");
    }
    
    public void pagarDinero(int dinero){
        this.saldo -= dinero;
        avisar(Eventos.cambioSaldo);
    }
    
    public boolean tengoSaldo(int dinero){
        if(saldo < dinero) return false;
        return true;
    }
    
    void ganarDinero(int dinero) {
        this.saldo += dinero;
        avisar(Eventos.cambioSaldo);
    }
    
    private void avisar(Eventos evento) {
            setChanged();
            notifyObservers(evento);   
    }


}
