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
    
    public HiloContador(String name, Partida p) {
        super(name);
        this.partida = p;
    }

    public int getContador() {
        return contador;
    }
        
    @Override
    public void run(){
        partida.setContador(20);
        for(int x=1;x<=20;x++)
        {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {}
        }
        int contador = partida.getContador();
        partida.setContador(contador--);
        partida.avisar(Partida.Eventos.actualizarContador);
    }
    
}
