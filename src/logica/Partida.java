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
public class Partida extends Observable {
    
//    private DateTime FechaInicio;
    private ArrayList<JugadorParticipante> jugadores = new ArrayList();    
    private Mazo mazo = new Mazo();
    private Apuesta apuesta = new Apuesta();
    private int pozo;
    private int luz;
    private int cantJugadores;
    private int totalAposstado = 0;

    
    public enum Eventos{
        jAbandonaPartida, jApuesta, jPasa, jAceptaApuesta, empiezaPartida, 
        entroJugador
    }
    
    public Partida(int cantJug, int luz){
        this.luz = luz;
        this.cantJugadores = cantJug;
    }

    //Metodo que inicializa todas las variables necesarias para comenzar una nueva ronda.    
    public void comenzarRonda(){
        mazo = new Mazo();
        apuesta = new Apuesta();
        agregarLuzAPozo();
        repartirCartas();
    }

    public int getPozo() {
        return pozo;
    }

    public int getLuz() {
        return luz;
    }
    
    
    public void agregarLuzAPozo(){
        for(JugadorParticipante j:jugadores){
            pozo += luz;
        }
    }
    
    //Se asigna la mano de cada jugador recorriendo el array de jugadores y revisando 
    //los que van a jugar esta ronda.
    public void repartirCartas(){
        for(JugadorParticipante j:jugadores){
            if(j.isJuegaMano()) j.setMano(mazo.dar5());
        }              
    }

    //Esto va a ser void.
    public boolean ingresar(Jugador j){
        
        JugadorParticipante p = new JugadorParticipante(j, this);
        if(jugadores.size() >= cantJugadores ||
                jugadores.contains(p)) return false;
       
        jugadores.add(p);

        if(jugadores.size() == cantJugadores)
        {
            comenzarRonda();
            avisar(Eventos.empiezaPartida);
        }else
        {
            avisar(Eventos.entroJugador);
        }
        return true;
    }
    
    public void setLuz(int luz){
        if(this.jugadores.isEmpty()) this.luz = luz;
    }
    
    public boolean completa(){
        return this.cantJugadores == jugadores.size();
    }
    
    public JugadorParticipante darGanador(){
       
        ArrayList<JugadorParticipante> juegan = devolverListaParticipantesRonda();
        JugadorParticipante ganador = juegan.get(0);
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
        ganador.ganarDinero(pozo);
        this.pozo = 0;    
        return ganador;
    }

    public ArrayList<JugadorParticipante> devolverListaParticipantesRonda(){
        ArrayList<JugadorParticipante> juegan = new ArrayList();
        for(JugadorParticipante jug : jugadores){
            if(jug.isJuegaMano()) juegan.add(jug);
        }
        return juegan;
    }
        
    //Esto iria con manejador de eventos.
    public void realizarApuesta(JugadorParticipante j, int dinero){        
        j.apostar(dinero);
        apuesta = new Apuesta(j, dinero);
        avisar(Eventos.jApuesta);
    } 
    
    public boolean verificarApuesta(int dinero){
        for (JugadorParticipante h: jugadores){
            if (h.getSaldoJugador() < dinero ) return false;
        }
        return true;        
    }
/*
    jugadorApuesta(int 50peso){
        //Poner 50 pesos en el pozo, se resta de jugador
        //Le pregunto a todos si se suman o no
        //Si te sumas pones guita en el pozo, sino booleano = false y estas
        //deshabilitado.
        //Se juega y se determina ganador, se reparte pozo
        //Se reinicia mano, jugadores se pueden ir, resetear booleanos
        
    }
    */
    
    public ArrayList<JugadorParticipante> getJugadoresParticipantes(){
        return this.jugadores;
    }

    public void removerJugador(JugadorParticipante jugador) {
        this.jugadores.remove(jugador);
        avisar(Eventos.jAbandonaPartida);
    }

    
    public ArrayList<JugadorParticipante> getJugadoresSinMi(JugadorParticipante jugador){
     
        ArrayList<JugadorParticipante> jugadoresSM = new ArrayList();
        for (JugadorParticipante j:jugadores){
            if (!j.equals(jugador)) jugadoresSM.add(j);
        }
        return jugadoresSM;
    }

    public Apuesta getApuesta() {
        return apuesta;
    }
    
    private void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
    }

    
}
