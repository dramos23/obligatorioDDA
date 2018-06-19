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
public class HiloContador extends Thread{

    private int contador;
    private Partida partida;
    private boolean activo = true;
    
    public HiloContador(String name, Partida p) {
        super(name);
        this.partida = p;
    }

    public int getContador() {
        return contador;
    }

    public void detener() {
        this.activo = false;
    }
        
    @Override
    public void run(){
        contador = 5;
        while(contador > 0 && activo) {            
            try {
                sleep(1000);
                contador--;
                if(contador == 0){
                    partida.finalizarTurnoJugadoresInactivos();
                }
                partida.avisar(Partida.Eventos.actualizarContador);
            } catch (InterruptedException ex) {
            
            }
        }             
    }
        
    
}
