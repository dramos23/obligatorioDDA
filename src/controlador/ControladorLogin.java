/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Sistema;

/**
 *
 * @author danie
 */
public class ControladorLogin {
    
    private Sistema modelo = Sistema.getInstancia();
    private VistaLoginJugador vista;
    
    public ControladorLogin(VistaLoginJugador vista) {
        this.vista = vista;
    }

        public void login(String u,String p){
        boolean a = modelo.login(u, p);
        if(a==false) vista.mostrarError("Login incorrecto");
        else vista.mostrarPartida();

    }
    
}
