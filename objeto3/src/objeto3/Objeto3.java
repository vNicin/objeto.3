package objeto3;

import java.util.Random;

/*
 *
 * @author Raphael Mathias
 * @author Vinicius Barros
 */
public class Objeto3 {

         static Random random = new Random();
         static int linhaChegada = 300;

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroGrilos = 6;
        System.out.println("A linha de chegada é em " + linhaChegada);

        for(int i = 1; i <= numeroGrilos; i++)
        {
            Thread t = new Thread(new Grilo(i,linhaChegada));


            t.start();
        }







    }




}