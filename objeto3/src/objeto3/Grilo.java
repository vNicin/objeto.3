/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto3;
import java.util.Random;


class Grilo implements Runnable {
      int id;
      int linhaChegada;
    Grilo(int id, int linhaChegada) {
         this.id = id;
         this.linhaChegada = linhaChegada;
     }
      static Random random = new Random();
	public void run() {
          
	    int posicao =0;   
            int numeroPulos=0; 
            do{
                
                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo_" + id +" " +"pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){
                  System.out.println(" O Grilo_" +id +" " +"alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
	}
}
 