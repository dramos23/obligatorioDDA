package logica;

import logica.Mazo.palos;



public class Carta implements Comparable<Carta>{
 
    private palos palo;
    private int valor;
    private String codImagen;
    
    
    public Carta(palos unPalo, int unValor){
        this.palo = unPalo;
        this.valor = unValor;
        this.codImagen = unPalo.toString() +  unValor;
    }
    
    public Carta(){
        this.valor = 0;
    }

    public palos getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    public String getCodImagen() {
        return codImagen;
    }
 
    @Override
    public String toString(){
        return this.codImagen;
    }

    // se compra primero el valor y depues el palo en caso de tener dos cartas con mismo valor.
    // se toma como valor del palo el indice del enumerable palos, mientra menor el indice mas vale la carta 
    
    @Override
    public int compareTo(Carta c) {
        if(this.valor > c.valor) return 1;
        else if(this.valor < c.valor) return -1;
        else{
            if (this.palo.ordinal() > c.palo.ordinal() ) return -1;
            else return 1;
        }
    }
    
    
    
}