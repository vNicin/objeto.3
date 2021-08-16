/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto3;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


class Grilo implements Runnable {
    public static final Semaphore SEMAFORO = new Semaphore(4);
      int id;
      int time;
      int linhaChegada;
      public int numeroPulos=0; 
      public int distanciaPercorrida=0;
    Grilo(int time,int linhaChegada) {
         this.time = time;
         this.id = objeto3.Objeto3.NumeroGrilo;
         objeto3.Objeto3.NumeroGrilo++;
         this.linhaChegada = linhaChegada;
     }
      static Random random = new Random();
	public void run() {
          
	    int posicao =0;   
        try {
            SEMAFORO.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Grilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            do{
                
                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo_" + id +" " +"pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){
                
                 System.out.println(" O Grilo_" + id +" " +"chegou em "+ objeto3.Objeto3.posicao + "º lugar com "+ numeroPulos + " pulos");
                 distanciaPercorrida = posicao;
                 if(objeto3.Objeto3.posicao ==1){
                     objeto3.Objeto3.numeroTimeVencedor = time;
                 }
                  objeto3.Objeto3.posicao++;
                 
                // System.out.println(" O Grilo_" +id +" " +"alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
            SEMAFORO.release();
	}
        public int pegarNumeroPulos(){
             return numeroPulos;
        }
        public int pegarDistanciaGrilo(){
            return distanciaPercorrida;
        }
}
 