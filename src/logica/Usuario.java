/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Observable;

public class Usuario extends Observable {
    
        private int oid;
        private String nombre;
        private String pass;
        private String nombreCompleto;

        
        
            public Usuario(String nombre, String pass, String nombreCompleto) {
        this.nombre = nombre;
        this.pass = pass;
        this.nombreCompleto = nombreCompleto;
    }
    
        public Usuario(){}
        
    public String getNombre() {
        return nombre;
    }
    
    public String getPass() {
        return pass;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    @Override
    public boolean equals(Object obj){
            if(obj == null) return false;
            Usuario u = (Usuario) obj;
            return u.nombre.equals(this.nombre);
    }
    
}
