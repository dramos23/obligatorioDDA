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
    
    
    
    
    
}
