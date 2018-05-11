/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Ninja
 */
public class Jugador extends Usuario {
    
    private int saldo;
    
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
    
    public boolean apostar(int dinero){
        if(this.getSaldo() < dinero) return false;
        this.setSaldo(this.getSaldo() - dinero);
        return true;
    }
    
    public boolean tengoSaldo(int dinero){
        if(this.getSaldo() < dinero) return false;
        return true;
    }
    
    public void pagarDinero(int dinero){
        this.setSaldo(this.getSaldo() - dinero);
    }

    void ganarDinero(int dinero) {
        this.saldo += dinero;
    }

}
