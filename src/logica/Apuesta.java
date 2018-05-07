/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Diego
 */
public class Apuesta {
    private JugadorParticipante apostador;
    private int montoApostado;
    
    public Apuesta(JugadorParticipante jugador, int monto){
        this.apostador = jugador;
        this.montoApostado = monto;
    }
    
    public Apuesta(){        
    }

    public JugadorParticipante getApostador() {
        return apostador;
    }

    public void setApostador(JugadorParticipante apostador) {
        this.apostador = apostador;
    }

    public int getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(int montoApostado) {
        this.montoApostado = montoApostado;
    }
           
    @Override
    public String toString(){
        return this.apostador + " apostó $" + this.montoApostado + ".";
    }
    
}
