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

// La mas alta tiene que ser la última
public class Sistema{
    
    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaPartidas sp = new SistemaPartidas();
    private ArrayList<Figura> figuras = new ArrayList();
    
    private static Sistema instancia = new Sistema();
    public static Sistema getInstancia() {
        return instancia;
    }
    
    private Sistema() {
        CargarFiguras();
    }
    
    public void agregar(Jugador j) {
        su.agregar(j);
    }
    
    public void agregarA(Admin a) {
        su.agregarA(a);
    }
    
    
    public JugadorParticipante loginJ(String u, String p) throws PartidaException {
        return su.loginJ(u, p);        
    }
    
    public Admin loginA(String u, String p) throws PartidaException {
        return su.loginA(u, p);        
    }
    
    public JugadorParticipante agregarJugadorAPartida(Jugador j) throws PartidaException{
        return sp.ingresar(j);
    }
    
    //Throws exception
    public void modificarLuz(int valor) throws PartidaException{
         this.sp.setLuz(valor);
    }
    
    public void modificarCantJugadores(int valor) throws PartidaException{
         this.sp.setCantJugadores(valor);
    }
    
    public void addObsSP(ControladorMonitorPartidas o){
        this.sp.addObserver(o);
    }
    
    public ArrayList<Partida> obtenerPartidasAct(){
        return this.sp.getPartidas();
    }
    public ArrayList<Partida> obtenerTodasLasPartidas(){
        return this.sp.getTodasLasPartidas();
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

    public void iniciarProximaPartida() {
        sp.iniciarProxPartida();      
    }

    public void removerPartidaDeLista(Partida partida) {
        sp.removerPartidaDeLista(partida);
    }

    public void avisarCambioEnPartida(SistemaPartidas.Eventos eventos) {
        sp.avisar(eventos);
    }

    private void CargarFiguras() {
        figuras.add(new Color());
        figuras.add(new DoblePar());
        figuras.add(new Par());
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    void guardarPartida(Partida partida) {
        this.sp.guardarPartida(partida);
    }

    
    
}
