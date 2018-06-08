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
             H, D, C, S;
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
        
        public ArrayList<Carta> devolverColorGanador(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.H, 6));
            cartas.add(new Carta(palos.H, 5));
            cartas.add(new Carta(palos.H, 8));
            cartas.add(new Carta(palos.H, 11));
            cartas.add(new Carta(palos.H, 10));
            return cartas;
        }
        
            public ArrayList<Carta> devolverColorPerdedorr(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.S, 6));
            cartas.add(new Carta(palos.S, 5));
            cartas.add(new Carta(palos.S, 8));
            cartas.add(new Carta(palos.S, 11));
            cartas.add(new Carta(palos.S, 10));
            return cartas;
        }
            
           public ArrayList<Carta> devolverDobleParGanador(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.H, 11));
            cartas.add(new Carta(palos.D, 11));
            cartas.add(new Carta(palos.H, 8));
            cartas.add(new Carta(palos.D, 8));
            cartas.add(new Carta(palos.H, 13));
            return cartas;
        }
        
            public ArrayList<Carta> devolverDobleParPerdedor(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.S, 11));
            cartas.add(new Carta(palos.C, 11));
            cartas.add(new Carta(palos.S, 8));
            cartas.add(new Carta(palos.C, 8));
            cartas.add(new Carta(palos.C, 5));
            return cartas;
        }
            
            public ArrayList<Carta> devolverDobleParGanador2(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.H, 11));
            cartas.add(new Carta(palos.D, 11));
            cartas.add(new Carta(palos.H, 7));
            cartas.add(new Carta(palos.D, 7));
            cartas.add(new Carta(palos.H, 13));
            return cartas;
        }
        
            public ArrayList<Carta> devolverDobleParPerdedor2(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.S, 11));
            cartas.add(new Carta(palos.C, 11));
            cartas.add(new Carta(palos.S, 8));
            cartas.add(new Carta(palos.C, 8));
            cartas.add(new Carta(palos.C, 5));
            return cartas;
        }  
            
                       public ArrayList<Carta> devolverParGanador(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.H, 11));
            cartas.add(new Carta(palos.D, 11));
            cartas.add(new Carta(palos.H, 5));
            cartas.add(new Carta(palos.D, 3));
            cartas.add(new Carta(palos.H, 13));
            return cartas;
        }
        
            public ArrayList<Carta> devolverParPerdedor(){
            ArrayList<Carta> cartas = new ArrayList<>();
            cartas.add(new Carta(palos.S, 11));
            cartas.add(new Carta(palos.C, 11));
            cartas.add(new Carta(palos.S, 7));
            cartas.add(new Carta(palos.C, 2));
            cartas.add(new Carta(palos.C, 5));
            return cartas;
        }


}