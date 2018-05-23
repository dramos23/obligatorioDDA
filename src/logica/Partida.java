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
        mazo = new Mazo();
        apuesta = new Apuesta();
        agregarLuzAPozo();
        repartirCartas();
        resetearFlagsJugadores();
        cantManos++;
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
     
    public void setCantJugadores(int cantJugadores){
        if(this.jugadores.size() <= cantJugadores)        
        {
            this.cantJugadores = cantJugadores;
            if(revisarComienzoPartida()){
                comenzarPartida();
                sp.iniciarProxPartida();      
            }
       }
    }
    
    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.       
    public void agregarLuzAPozo(){
        for(JugadorParticipante j:jugadores){
            j.pagarDinero(luz);
        }
    }
    
    //Se asigna la mano de cada jugador recorriendo el array de jugadores y revisando 
    //los que van a jugar esta ronda.
    public void repartirCartas(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()) j.setMano(mazo.dar5());
        }              
    }

    
    public JugadorParticipante ingresar(Jugador j) throws PartidaException{        
        JugadorParticipante p = new JugadorParticipante(j, this);
        
        if(jugadores.contains(p)) throw new PartidaException("Ya està en cola para la próxima partida.");
        if(j.getSaldo() < this.luz) throw new PartidaException("No tiene suficiente saldo para entrar en la partida.");
            
        jugadores.add(p);
        avisar(Eventos.entroJugador);        
        if(revisarComienzoPartida()) comenzarPartida();
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
        
    public void realizarApuesta(JugadorParticipante j, int dinero) throws PartidaException{                
        if(!verificarApuesta(dinero)) throw new PartidaException("Usted u otro de los jugadores no tiene el saldo suficiente para aceptar esta apuesta.");        
        j.apostar(dinero);
        apuesta = new Apuesta(j, dinero);
        avisar(Eventos.jApuesta);
    } 
    
    public void jugadorAceptaApuesta(JugadorParticipante j, int dinero){
        j.pagarDinero(dinero);
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
            this.jugadores.remove(jugador);
            removerUltimoJugador();
            sp.removerPartidaDeLista(this);
           
        } else {
            this.jugadores.remove(jugador);            
            terminarTurno();
            avisar(Eventos.jAbandonaPartida);
        }
    }
    
    
    public void removerJugador2(JugadorParticipante jugador) {
        if (this.cantJugadores > 2) { 
            removerJugadorX(jugador);
            terminarTurno();
        } else if (this.cantJugadores == 2){
            removerJugadorX(jugador);
            darPozoAGanador(this.jugadores.get(0));
        } else {
            removerUltimoJugador();
        }
        
    }
    
    public void removerUltimoJugador(){
            darPozoAGanador(this.jugadores.get(0));
            if(this.pozo != 0){
                apuesta.setGanador(this.jugadores.get(0));
                avisar(Eventos.ultimoJugadorGanador);
            }
            avisar(Eventos.finalizoPartida);
    }
    
    public void removerJugadorX(JugadorParticipante jugador){
        this.jugadores.remove(jugador);
        avisar(Eventos.jAbandonaPartida);
    }
    
    public void terminarTurno(){
    
        if(todosApostaron()) { 
                darGanador();
        } else if(todosPasaron()){
                avisar(Eventos.todosPasaron);
        }    
    }
    
    public void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
        this.sp.avisarCambioEnPartida(SistemaPartidas.Eventos.cambioEnPartida);
    }

    public void sumarAPozo(int dinero) {
        this.pozo += dinero;
        this.totalApostado += dinero;
        avisar(Eventos.cambiaPozo);
    }
        
    public boolean finalizada() {
        return this.getJugadoresParticipantes().size() == 2;
    }
    
    public boolean finalizada2() {
        return this.getJugadoresParticipantes().size() == 1;
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
    
    private boolean revisarTodosListosParaProxima(){
           for(int i = 0; i < jugadores.size(); i++){
            if(jugadores.get(i).getEstado() != Estado.juegoProxima) return false;
        }
        return true;
    }
        
    private void resetearFlagsJugadores() {
        for(JugadorParticipante jp : jugadores){
            jp.setEstado(Estado.sinActuar);
        }
    }
    
    private void comenzarPartida(){
            fechaHora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            comenzarRonda();
    }

    public void revisarComienzoRonda(){
        if(revisarTodosListosParaProxima()){
            comenzarRonda();
        }
    }
    
}
