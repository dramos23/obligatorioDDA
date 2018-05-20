/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import logica.JugadorParticipante.Estado;

/**
 *
 * @author Ninja
 */
public class Partida extends Observable {
    
//    private DateTime FechaInicio;
    private SistemaPartidas sp;
    private ArrayList<JugadorParticipante> jugadores;   
    private Mazo mazo;
    private Apuesta apuesta;
    private int pozo;
    private int luz;
    private int cantJugadores;
    private int totalApostado;
    private int cantManos;
    private String fechaHora;
    private int idPartida = 0;

    
    public enum Eventos{
        jAbandonaPartida, jApuesta, jPasa, jAceptaApuesta, entroJugador, comienzaPartida,
        comienzaTurno, finalizoPartida, cambiaLuz, cambiaCantJugadores, cambiaPozo,
        hayGanador, todosPasaron, ultimoJugadorGanador        
    }
    
    public Partida(int cantJug, int luz, SistemaPartidas sisP){
        this.idPartida = this.idPartida++;
        this.luz = luz;
        this.cantJugadores = cantJug;
        this.sp = sisP;
        this.jugadores = new ArrayList(); 
        this.mazo = new Mazo();
        this.apuesta = new Apuesta();
        this.fechaHora = "";
        this.totalApostado = 0;
        this.cantManos = 0;
    }

      

    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.    
    public void comenzarRonda(){        
        fechaHora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        mazo = new Mazo();
        apuesta = new Apuesta();
        agregarLuzAPozo();
        repartirCartas();
        resetearFlagsJugadores();
        avisar(Eventos.comienzaTurno);
    }
    
    public int getIdPartida() {
        return idPartida;
    }

    public int getPozo() {
        return pozo;
    }

    public int getLuz() {
        return luz;
    }
    
    public ArrayList<JugadorParticipante> getJugadoresParticipantes(){
        return this.jugadores;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public Apuesta getApuesta() {
        return apuesta;
    }
           
    public int getTotalApostado() {
        return totalApostado;
    }
    
    public String getFechaHora() {
        return fechaHora;
    }
    
    public int getCantManos() {
        return cantManos;
    }
    
    public void setLuz(int luz){
        if(this.jugadores.isEmpty()) {
            this.luz = luz;
        }
    }
     
    public void setCantJugadores(int cantJugadores) {
        if(this.jugadores.size() <= cantJugadores)        
        {
            this.cantJugadores = cantJugadores;
            if(revisarComienzoPartida()){
                comenzarRonda();      
                sp.iniciarProxPartida();      
            }
       }
    }
    
    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.       
    public void agregarLuzAPozo(){
        for(JugadorParticipante j:jugadores){
            j.apostar(luz);
        }
    }
    
    //Se asigna la mano de cada jugador recorriendo el array de jugadores y revisando 
    //los que van a jugar esta ronda.
    public void repartirCartas(){
        cantManos++;
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()) j.setMano(mazo.dar5());
        }              
    }

    
    public JugadorParticipante ingresar(Jugador j){        
        JugadorParticipante p = new JugadorParticipante(j, this);
        if(jugadores.size() >= cantJugadores ||
                jugadores.contains(p)) return null;
       
        jugadores.add(p);
        avisar(Eventos.entroJugador);        
        if(revisarComienzoPartida()) comenzarRonda();
        return p;
    }
    
    
    public void darGanador(){
       
        JugadorParticipante ganador = jugadores.get(0);
        for(int i = 1; i < jugadores.size(); i++){
            //Tomo la carta mas alta del ganador actual y de la posicion i
            //de la lista. Comparo con compareTo y reviso el valor. Si el get(i)
            //tiene mejor carta, este se vuelve el nuevo ganador.
            if(ganador.devolverMasAlta().compareTo
              (jugadores.get(i).devolverMasAlta()) == -1)
            {
                ganador = jugadores.get(i);
            }
        }                
        darPozoAGanador(ganador);
        apuesta.setGanador(ganador);
        avisar(Eventos.hayGanador);
    }

    public ArrayList<JugadorParticipante> devolverListaParticipantesRonda(){
        ArrayList<JugadorParticipante> juegan = new ArrayList();
        for(JugadorParticipante jug : jugadores){
            if(jug.isJuegaMano()) juegan.add(jug);
        }
        return juegan;
    }
        
    public void realizarApuesta(JugadorParticipante j, int dinero){        
        j.apostar(dinero);
        apuesta = new Apuesta(j, dinero);
        avisar(Eventos.jApuesta);
    } 
    
    public void jugadorAceptaApuesta(JugadorParticipante j, int dinero){
        j.apostar(dinero);
        if(todosApostaron()) darGanador();    
    }
    
    public void jugadorPasaApuesta(JugadorParticipante jugador) {
        jugador.setEstado(Estado.paso);
        if(todosPasaron()) avisar(Eventos.todosPasaron);
    }


    
    public boolean verificarApuesta(int dinero){
        for (JugadorParticipante h: jugadores){
            if (h.getSaldoJugador() < dinero ) return false;
        }
        return true;        
    }
    
    public boolean revisarComienzoPartida() {
        return this.cantJugadores == this.jugadores.size();
    }

    public void removerJugador(JugadorParticipante jugador) {
        if(finalizada()) {
            //this.jugadores.removeAll(jugadores);
            //sp.removerPartidaDeLista(this);
            //avisar(Eventos.finalizoPartida);
            this.jugadores.remove(jugador);
            darPozoAGanador(this.jugadores.get(0));
            apuesta.setGanador(this.jugadores.get(0));
            avisar(Eventos.ultimoJugadorGanador);
           
            this.jugadores.removeAll(jugadores);
            sp.removerPartidaDeLista(this);
            avisar(Eventos.finalizoPartida);
           
        } else {
            this.jugadores.remove(jugador);
            
            if(todosApostaron()) { 
                darGanador();
            } else if(todosPasaron()){
                avisar(Eventos.todosPasaron);
            }
            avisar(Eventos.jAbandonaPartida);
        }
    }
    
      
    public void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
        this.sp.avisarCambioEnPartida(evento);
    }

    public void sumarAPozo(int dinero) {
        this.pozo += dinero;
        this.totalApostado += dinero;
        avisar(Eventos.cambiaPozo);
    }
        
    public boolean finalizada() {
        return this.getJugadoresParticipantes().size() == 2;
    }
    
    private void darPozoAGanador(JugadorParticipante ganador) {
        ganador.ganarDinero(pozo);
        pozo = 0;
        avisar(Eventos.cambiaPozo);
    }

    private boolean todosApostaron() {
        for(int i = 0; i < jugadores.size(); i++){
            if(jugadores.get(i).getEstado() != Estado.aposto) return false;
        }
        return true;
    }
    
    private boolean todosPasaron(){
        for(int i = 0; i < jugadores.size(); i++){
            if(jugadores.get(i).getEstado() != Estado.paso) return false;
        }
        return true;
    }
        
    private void resetearFlagsJugadores() {
        for(JugadorParticipante jp : jugadores){
            jp.setEstado(Estado.sinActuar);
        }
    }

    
    
}
