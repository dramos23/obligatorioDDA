/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Jugador;
import logica.JugadorParticipante;
import logica.Sistema;

/**
 *
 * @author danie
 */
public class ControladorLoginJ {
    
    private Sistema modelo = Sistema.getInstancia();
    private VistaLoginJugador vista;
    
    public ControladorLoginJ(VistaLoginJugador vista) {
        this.vista = vista;
    }

        public void login(String u,String p){
        JugadorParticipante jp = modelo.loginJ(u, p);
        
        if(jp==null) vista.mostrarError("Login incorrecto");
        else vista.mostrarPartida(jp);

    }
    
}
