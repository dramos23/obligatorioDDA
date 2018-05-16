/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author FAT
 */
public class Usuario {
    
        public String nombre;
        public String pass;
        public String nombreCompleto;

    public String getNombre() {
        return nombre;
    }
    
    public String getPass() {
        return pass;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Usuario(String nombre, String pass, String nombreCompleto) {
        this.nombre = nombre;
        this.pass = pass;
        this.nombreCompleto = nombreCompleto;
    }
        
    //Preguntar a Dario si es importante el case sensitive de equals nombre.
    @Override
    public boolean equals(Object obj){
            if(obj == null) return false;
            Usuario u = (Usuario) obj;
            return u.nombre.equals(this.nombre);
    }
    
}
