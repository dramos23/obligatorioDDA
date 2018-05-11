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
    
    public JugadorParticipante login(String u,String p){
        for(Jugador jug:jugadores){
            if(jug.getNombre().equalsIgnoreCase(u) && 
                    jug.getPass().equals(p)){                

                JugadorParticipante jp = Sistema.getInstancia().agregarJugadorAPartida(jug);            
                return jp;
            }
        }
        return null;
    }
    
    
        //Se devuelve admin o booleano? No hay datos de admin en la ventana de partidas entonces no parece necesario.
        /*
        public Admin loginAdmin(String u,String p){
        for(Admin ad:admins){
            if(ad.getNombre().equalsIgnoreCase(u) && 
                    ad.getPass().equals(p)){
                return true;
            }
        }
        return false;
    }
*/
    
    public void agregar(Jugador j){
        jugadores.add(j);
    }
}