/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.Observable;

/**
 *
 * @author Daniel
 */
public class Sistema extends Observable{
    
    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaPartidas sp = new SistemaPartidas();
    
    private static Sistema instancia = new Sistema();
    public static Sistema getInstancia() {
        return instancia;
    }
    
    private Sistema() {
        
    }
    
    public void agregar(Jugador j) {
        su.agregar(j);
    }
    
    
    public JugadorParticipante login(String u, String p) {
        return su.login(u, p);
    }
    
    public JugadorParticipante agregarJugadorAPartida(Jugador j){
        return sp.ingresar(j);
    }
    
    //Throws exception
    public void modificarLuz(int valor){
        this.sp.setLuz(valor);
    }
    
    public void modificarCantJugadores(int valor){
        this.sp.setCantJugadores(valor);
    }

}
