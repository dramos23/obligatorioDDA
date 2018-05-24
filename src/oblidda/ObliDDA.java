/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oblidda;

import iu.InicioDialogo;
import logica.Admin;
import logica.Jugador;
import logica.PartidaException;
import logica.Sistema;

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
        
        /*
        
        p.ingresar(pepe);
        p.ingresar(juan);
        p.ingresar(maria);
        p.ingresar(joaqui);
        p.ingresar(nico);

        */
        
        
        //for(JugadorParticipante j : p.getJugadoresParticipantes()){
        //    new PartidaDialogo(null, false, j).setVisible(true);            
        //}

       
        /*
        // TODO code application logic here
        Mazo m = new Mazo();
        /*for (int i = 0; i < 52; i++){
            m.imprimirCarta();
        }
        Carta c1 = new Carta(palos.CORAZON, 2);
        Carta c2 = new Carta(palos.TREBOL, 2);
        }*/
        /*Carta c1 = new Carta(palos.Corazon, 2);
        Carta c2 = new Carta(palos.Trebol, 2);
        if (c1.compareTo(c2) == 1) System.out.println("gana corazón"); else System.out.println("gana Trebol"); 
        Carta c3 = new Carta(palos.CORAZON, 2);
        Carta c4 = new Carta(palos.TREBOL, 10);
        if (c3.compareTo(c4) == -1) System.out.println("gana trebol"); else System.out.println("gana corazon");
        Carta c5 = new Carta(palos.TREBOL, 2);
        Carta c6 = new Carta(palos.TREBOL, 10);
        if (c5.compareTo(c6) == -1) System.out.println("gana trebol 10"); else System.out.println("gana trebol 2"); 
    */
    }
    
    private static void cargarDatos() throws PartidaException {
    
        Sistema logica = Sistema.getInstancia();
        logica.modificarLuz(50);
        logica.modificarCantJugadores(3);
        
        logica.agregarA(new Admin("0", "", "Jonas"));
        
        logica.agregar(new Jugador("1", "", "Pepe", 300));
        logica.agregar(new Jugador("2", "", "Juan", 500));
        logica.agregar(new Jugador("3", "", "Maria", 500));
        logica.agregar(new Jugador("Joaquina123", "123", "Joaqui", 500));
        logica.agregar(new Jugador("Nicolas123", "123", "Nico", 500));
        
        /*
        
        Jugador pepe = new Jugador("Pepe123", "123", "Pepe", 500);
        Jugador juan = new Jugador("Juan123", "123", "Juan", 500);
        Jugador maria = new Jugador("Maria123", "123", "Mari", 500);
        Jugador joaqui = new Jugador("Joaquina123", "123", "Joaqui", 500);
        Jugador nico = new Jugador("Nicolas123", "123", "Nico", 500);
        
        */
        
    }
    
}
