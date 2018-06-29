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
    
    private ArrayList<JugadorParticipante> jugadores;   
    private ArrayList<JugadorParticipante> jugadoresAlInicio;   
    
    private int oid;
    private Mazo mazo;
    private Apuesta apuesta;
    private int pozo;
    private int luz;
    private int cantJugadores;
    private int totalApostado;
    private int cantManos;
    private String fechaHora;
    private HiloContador hilo;

      
    public enum Eventos{
        jAbandonaPartida, jApuesta, jAceptaApuesta, entroJugador, comienzaPartida,
        comienzaTurno, finalizoPartida, cambiaPozo, hayGanador, 
        todosPasaron, ultimoJugadorGanador, jPasa, actualizarContador, finTurnoPorContador    
    }
    
    public Partida(int cantJug, int luz, SistemaPartidas sisP){
        this.luz = luz;
        this.cantJugadores = cantJug;
        this.jugadores = new ArrayList(); 
        this.mazo = new Mazo();
        this.apuesta = new Apuesta();
        this.fechaHora = "";
        this.totalApostado = 0;
        this.cantManos = 0;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
          
    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.    
    public void comenzarRonda(){        
        mazo = new Mazo();
        apuesta = new Apuesta();
        agregarLuzAPozo();
        repartirCartas();
        cantManos++;
        prepararJugadoresParaTurno();
        avisar(Eventos.comienzaTurno);
    }

    public int getPozo() {
        return pozo;
    }

    public int getLuz() {
        return luz;
    }

    public HiloContador getHilo() {
        return hilo;
    }
    
    private void guardarPartida() {
        Sistema.getInstancia().guardarPartida(this);
    }

    public ArrayList<JugadorParticipante> getJugadoresAlInicio() {
        return jugadoresAlInicio;
    }
    
    
    
    public ArrayList<JugadorParticipante> getJugadoresParticipantes(){
        return this.jugadores;
    }
    
    public ArrayList<JugadorParticipante> getJugadoresParticipantesMano(){
        ArrayList<JugadorParticipante> lista = new ArrayList();
        for(JugadorParticipante jp : jugadores){
            if (jp.getEstado() != Estado.pasoDeApuesta){
                lista.add(jp);
            }
        }
        return lista;
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
                Sistema.getInstancia().iniciarProximaPartida();
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
    
    public void repartirCartasPrueba1(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()){
                if (j.getNombre() == "1"){
                    j.setMano(mazo.devolverColorGanador());
                }
                if (j.getNombre() == "2"){
                    j.setMano(mazo.devolverColorPerdedorr());
                }else{
                    //j.setMano(mazo.dar5());
                }
            }
        }              
    }
    
    public void repartirCartasPrueba2(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()){
                if (j.getNombre() == "1"){
                    j.setMano(mazo.devolverDobleParGanador());
                }
                if (j.getNombre() == "2"){
                    j.setMano(mazo.devolverDobleParPerdedor());
                }else{
                    //j.setMano(mazo.dar5());
                }
            }
        }              
    }
    
     public void repartirCartasPrueba3(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()){
                if (j.getNombre() == "1"){
                    j.setMano(mazo.devolverDobleParGanador2());
                }
                if (j.getNombre() == "2"){
                    j.setMano(mazo.devolverDobleParPerdedor2());
                }else{
                    //j.setMano(mazo.dar5());
                }
            }
        }              
    }
     
     public void repartirCartasPrueba4(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()){
                if (j.getNombre() == "1"){
                    j.setMano(mazo.devolverParGanador());
                }
                if (j.getNombre() == "2"){
                    j.setMano(mazo.devolverParPerdedor());
                }else{
                    //j.setMano(mazo.dar5());
                }
            }
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
     
        ArrayList<JugadorParticipante> lista = devolverJugadoresQueJueganTurno();
        JugadorParticipante ganador = lista.get(0);
        for(int i = 1; i < lista.size(); i++){
            if(ganador.compararFigurasConJugador(lista.get(i)) == 1) ganador = lista.get(i);
        }                
        darPozoAGanador(ganador);
        apuesta.setGanador(ganador);
        hilo.detener();
        avisar(Eventos.hayGanador);
    }
    
    public void realizarApuesta(JugadorParticipante j, int dinero) throws PartidaException{                
        j.apostar(dinero);
        apuesta = new Apuesta(j, dinero);
        hilo = new HiloContador("partida", this);
        hilo.start();
        avisar(Eventos.jApuesta);
    } 
    
    public void jugadorAceptaApuesta(JugadorParticipante j, int dinero){
        j.setEstado(Estado.aposto);
        j.pagarDinero(dinero);        
        revisarAceptacionDeApuesta();
    }
    
    public void jugadorNoApuesta(JugadorParticipante jugador) {
        jugador.setEstado(Estado.noApuesto);
        if(todosPasaron()) avisar(Eventos.todosPasaron);
    }
    
    void finalizarTurnoJugadoresInactivos() {
        for(JugadorParticipante j : jugadores){
            if(j.getEstado().equals(Estado.sinActuar)) {
                j.setEstado(Estado.pasoDeApuesta);
                avisar(Eventos.finTurnoPorContador);
            }
        }
        darGanador();
    }
    
    
    public void verificarApuesta(int dinero) throws PartidaException{
        if (dinero <= 0) throw new PartidaException("Debe ingresar un monto mayor a cero.");
        for (JugadorParticipante h: jugadores){
            if (h.getSaldoJugador() < dinero )throw new PartidaException("Usted u otro de los jugadores no tiene el saldo suficiente para aceptar esta apuesta.");
        }
    }
    
    public boolean revisarComienzoPartida() {
        return this.cantJugadores == this.jugadores.size();
    }

    public void removerJugador(JugadorParticipante jugador) {
  
        if (this.fechaHora.isEmpty()) this.jugadores.remove(jugador);
        if(finalizada()) {
            this.jugadores.remove(jugador);        
            removerUltimoJugador();
            guardarPartida();
            Sistema.getInstancia().removerPartidaDeLista(this);           
        } else if(!this.jugadores.isEmpty()) {
            this.jugadores.remove(jugador);
            if (this.jugadores.size() > 1) terminarTurno();
        } 
        avisar(Eventos.jAbandonaPartida);
    }
            
    public void removerUltimoJugador(){
        JugadorParticipante ultimo = this.jugadores.get(0);
        if(this.pozo != 0){
            darPozoAGanador(ultimo);
            apuesta.setGanador(ultimo);
            this.jugadores.remove(ultimo);
            avisar(Eventos.ultimoJugadorGanador);
        }
        avisar(Eventos.finalizoPartida);
    }
    
    public void terminarTurno(){
    
        if(todosApostaron()) { 
                darGanador();
        } else if(todosPasaron()){
                avisar(Eventos.todosPasaron);
        }else{
            revisarComienzoRonda();
        }            
    }
    
    public void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
        Sistema.getInstancia().avisarCambioEnPartida(SistemaPartidas.Eventos.cambioEnPartida);
        
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
            if(jugadores.get(i).getEstado() != Estado.noApuesto) return false;
        }
        hilo.detener();
        return true;
    }
    
    private boolean revisarTodosListosParaProxima(){
           for(int i = 0; i < jugadores.size(); i++){
            if(jugadores.get(i).getEstado() != Estado.juegoProxima) return false;
        }
        return true;
    }
        
    private void prepararJugadoresParaTurno() {
        for(JugadorParticipante jp : jugadores){
            jp.setEstado(Estado.sinActuar);
        }
    }
    
    private ArrayList<JugadorParticipante> devolverJugadoresQueJueganTurno()
    {
        ArrayList<JugadorParticipante> lista = new ArrayList();
        for(JugadorParticipante jp : jugadores)
        {
            if(jp.getEstado() == Estado.aposto)
            {
                lista.add(jp);
            }
        }
        return lista;
    }
    
    private void comenzarPartida(){
            fechaHora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            this.jugadoresAlInicio = (ArrayList<JugadorParticipante>) this.jugadores.clone();
    
            comenzarRonda();
    }

    public void revisarComienzoRonda(){
        if(revisarTodosListosParaProxima()){
            comenzarRonda();
        }
    }
    
    public void revisarAceptacionDeApuesta() {
        for(int i = 0; i < jugadores.size(); i++)
        {
            if(jugadores.get(i).getEstado() == Estado.aposto 
                    || jugadores.get(i).getEstado() == Estado.pasoDeApuesta)
            {
                
            }else return;
        }               
        avisar(Eventos.jPasa);
        darGanador();            
    }
    
}
