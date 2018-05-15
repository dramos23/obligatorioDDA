/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Admin;
import logica.Partida;
import logica.Sistema;

/**
 *
 * @author danie
 */
public class ControladorLoginA {
    
    private Sistema modelo = Sistema.getInstancia();
    private VistaLoginAdministrador vista;
    
    public ControladorLoginA(VistaLoginAdministrador vista) {
        this.vista = vista;
    }

    public void login(String u,String p){
        
        Admin adm = modelo.loginA(u, p);
        if(adm==null) vista.mostrarError("Login incorrecto");
        else vista.mostrarConfPartida(adm);

    }
    
}
