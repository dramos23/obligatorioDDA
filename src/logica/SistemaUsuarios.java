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
    
    public boolean login(String u,String p){
        for(Jugador jug:jugadores){
            if(jug.getNombre().equalsIgnoreCase(u) && 
                    jug.getPass().equals(p)){
                //LO ENCONTRE, RETORNO LA AGENDA
                Sistema.getInstancia().agregarPartida(jug);            
                //Sistema.getInstancia().avisar(Sistema.Eventos.listaJugadores);
                return true;
            }
        }
        return false;
    }
    
    public void agregar(Jugador j){
        jugadores.add(j);
    }
}