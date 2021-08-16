package objeto3;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *
 * @author Raphael Mathias
 * @author Vinicius Barros
 */

public class Objeto3 {
       //  static Semaphore _pool = new Semaphore(12);
         static Random random = new Random();
         public int numeroTimes = 3;
         static int linhaChegada = 300;
         static int posicao = 1;
         static int NumeroGrilo=1;

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {


       // int numeroGrilos = 4;
        System.out.println("A linha de chegada é em " + linhaChegada);

        Time time2 = new Time(2,300,3);
        Time time1 = new Time(1,300,3);
        time2.FazerCorridaDeGrilo();
        time1.FazerCorridaDeGrilo();

        if(time1.numeroPulos<time2.numeroPulos){
            System.out.println("O vencedor é o time 1 ");
        }else{
              System.out.println("O vencedor é o time 2 ");
        }
             
               






    }





}