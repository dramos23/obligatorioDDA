/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblidda;

import iu.InicioDialogo;
import java.util.ArrayList;
import logica.Admin;
import logica.Carta;
import logica.Jugador;
import logica.Mazo;
import logica.Partida;
import logica.PartidaException;
import logica.Sistema;
import mapeadores.MapeadorAdministrador;
import mapeadores.MapeadorJugador;
import persistencia2.BaseDatos;
import persistencia2.Persistencia;

/*123*/

/**
 *
 * @author Ninja
 */
public class ObliDDA {

    /**
     * @param args the command line arguments
     * @throws logica.PartidaException
     */
    public static void main(String[] args) throws PartidaException {
   
        cargarDatos();
        new InicioDialogo(null,false).setVisible(true);        
    }
    
    private static void cargarDatos() throws PartidaException {

        Sistema logica = Sistema.getInstancia();
        logica.modificarLuz(50);
        logica.modificarCantJugadores(2);
        
        cargarJugadores();
        cargarAdmins();
        cargarPartidas();
                
        
        
       
        /*
        logica.agregarA(new Admin("0", "", "Jonas"));
        
        logica.agregar(new Jugador("1", "", "Pepe", 300));
        logica.agregar(new Jugador("2", "", "Juan", 500));
        logica.agregar(new Jugador("3", "", "Maria", 500));
        logica.agregar(new Jugador("Joaquina123", "123", "Joaqui", 500));
        logica.agregar(new Jugador("Nicolas123", "123", "Nico", 500));
        
        
        Jugador pepe = new Jugador("Pepe123", "123", "Pepe", 500);
        Jugador juan = new Jugador("Juan123", "123", "Juan", 500);
        Jugador maria = new Jugador("Maria123", "123", "Mari", 500);
        Jugador joaqui = new Jugador("Joaquina123", "123", "Joaqui", 500);
        Jugador nico = new Jugador("Nicolas123", "123", "Nico", 500);
        
        */
    }

    private static void cargarJugadores() {
            MapeadorJugador m = new MapeadorJugador();
            ArrayList lista = Persistencia.getInstancia().todos(m);
            Sistema s = Sistema.getInstancia();
            for(Object obj : lista){
                s.agregar((Jugador) obj);                
            }    
    }
    
        private static void cargarAdmins() {
            MapeadorAdministrador m = new MapeadorAdministrador();
            ArrayList lista = Persistencia.getInstancia().todos(m);
            Sistema s = Sistema.getInstancia();
            for(Object obj : lista){
                s.agregarA((Admin) obj);                
            }    
    }

    private static void cargarPartidas() {
    }

    
}
