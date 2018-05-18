/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import controlador.ControladorMonitorPartidas;
import java.util.ArrayList;


/**
 *
 * @author Daniel
 */
public class Sistema{
    
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
    
    public void agregarA(Admin a) {
        su.agregarA(a);
    }
    
    
    public JugadorParticipante loginJ(String u, String p) {
        return su.loginJ(u, p);        
    }
    
    public Admin loginA(String u, String p) {
        return su.loginA(u, p);        
    }
    
    public JugadorParticipante agregarJugadorAPartida(Jugador j){
        return sp.ingresar(j);
    }
    
    //Throws exception
    public boolean modificarLuz(int valor){
        return this.sp.setLuz(valor);
    }
    
    public boolean modificarCantJugadores(int valor){
        return this.sp.setCantJugadores(valor);
    }
    
    public void addObsSP(ControladorMonitorPartidas o){
        this.sp.addObserver(o);
    }
    
    public ArrayList<Partida> obtenerPartidasAct(){
        return this.sp.getPartidas();
    }
    
    public int obtenerLuzPartida(){
        return this.sp.getValorLuz();
    }
    
    public int obtenerCantJugadores(){
        return this.sp.getCantJugadoresPorPartida();
    }
    
    public Partida obtenerPartidaAct(String f){
        return this.sp.getPartidaAct(f);
    }
}
