/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author FAT
 */
public class SistemaUsuarios {
    
    public ArrayList<Jugador> jugadores = new ArrayList();
    public ArrayList<Admin> admins = new ArrayList();
    
    public JugadorParticipante loginJ(String u,String p){
        for(Jugador jug:jugadores){
            if(jug.getNombre().equalsIgnoreCase(u) && 
                    jug.getPass().equals(p)){                

                JugadorParticipante jp = Sistema.getInstancia().agregarJugadorAPartida(jug);            
                return jp;
            }
        }
        return null;
    }
    
    public Partida loginA(String u,String p){
        for(Admin adm:admins){
            if(adm.getNombre().equalsIgnoreCase(u) && 
                    adm.getPass().equals(p)){

                Partida proxP = Sistema.getInstancia().obtenerProximaPartida();
                return proxP;
            }
        }
        return null;
    }
    
    public void agregar(Jugador j){
        jugadores.add(j);
    }
    
    public void agregarA(Admin a){
        admins.add(a);
    }
}