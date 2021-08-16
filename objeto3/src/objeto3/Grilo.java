/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto3;
import java.util.Random;


class Grilo implements Runnable {
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

            do{

                int pulo = random.nextInt(30);
                posicao += pulo;
                numeroPulos++;
                System.out.println("O Grilo" + id +" " +"pulou "+ pulo + "cms e já percorreu " + posicao +"cms");
            }while (posicao<=linhaChegada);
            if(posicao>linhaChegada){

                 System.out.println(" O Grilo" + id +" " +"chegou em "+ objeto3.Objeto3.posicao + "º lugar com "+ numeroPulos + " pulos");
                 distanciaPercorrida = posicao;
                  objeto3.Objeto3.posicao++;

                // System.out.println(" O Grilo_" +id +" " +"alcançou a linha de chegada com "+ numeroPulos + " pulos");
            }
    }
        public int pegarNumeroPulos(){
             return numeroPulos;
        }
        public int pegarDistanciaGrilo(){
            return distanciaPercorrida;
        }
}