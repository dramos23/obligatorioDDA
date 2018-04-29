package logica;

import logica.Carta;
import java.util.ArrayList;
import java.util.Random;


public class Mazo {
    
        //Constantes
        private static int CANTPALOS = 4;
        private static int CANTCARTASPALO = 13;
        
        ArrayList<Carta> cartas = new ArrayList();

         public enum palos{
             Corazon, Diamante, Trebol, Pique;
         }
        
        
        //String[] palos;
        
        public Mazo(){
                
            cargarMazo();
           
        }
        
        
   
   /*     
   public void cargarMazo()
   {
        for (int s = 0; s < CANTPALOS; s++)
        {                        
         
            for (int d = 2; d < CANTCARTASPALO + 2; d++)
            {                                                   
                cartas.add(new Carta(palos[s], d));
            }
        }
    }
   */

   public void cargarMazo()
   {
        for (int s = 0; s < CANTPALOS; s++)
        {                        
         
            for (int d = 2; d < CANTCARTASPALO + 2; d++)
            {           
                palos p = palos.values()[s];
                cartas.add(new Carta(p, d));
            }
        }
    }
        
        
    
        public void imprimirCarta(){
        
            Random r = new Random();   
            int index = r.nextInt(cartas.size());
            System.out.println(cartas.get(index));
            cartas.remove(index);
        }
        
        public Carta darCarta(){
            Random r = new Random();
            int index = r.nextInt(cartas.size());
            Carta c = cartas.get(index);
            cartas.remove(index);
            return c;
        }
        
        //Metodo que devuelve una arraylist de 5 cartas usando el método darCarta() y una repetitiva.
        public ArrayList<Carta> dar5(){
            ArrayList<Carta> mano = new ArrayList();
            for(int i = 0; i < 5; i++) mano.add(darCarta());
            return mano;
        }
}