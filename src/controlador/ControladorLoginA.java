/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import logica.Admin;
import logica.Partida;
import logica.PartidaException;
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
        
        try{
            Admin adm = modelo.loginA(u, p);
            vista.mostrarConfPartida(adm);
        }catch(PartidaException ex){
            vista.mostrarError(ex.getMessage());
        }
 
    }
    
}
