package objeto3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yuri Silva
 */
public class Time {


    public int idtime;
    public int numeroGrilos;
    public int linhaChegada;
    public int numeroPulos;
      public int distanciaPercorrida;
        public Time(int idTime, int linhaChegada, int numeroGrilos){
            this.idtime = idTime;
            this.linhaChegada = linhaChegada;
            this.numeroGrilos = numeroGrilos;
        }


        public void FazerCorridaDeGrilo(){
             for(int i = 1; i <= numeroGrilos; i++)
        {
            Grilo grilo = new Grilo(idtime,linhaChegada);
            Thread t = new Thread(grilo);
            t.start();
                 try {
                     t.join(0);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
                 }

            int value = grilo.pegarNumeroPulos();
            int distancia = grilo.pegarDistanciaGrilo();
            distanciaPercorrida += distancia;
            numeroPulos += value;
            if(i==numeroGrilos){

                     System.out.println("Time "+ idtime + ": Total de Pulos: "+ numeroPulos + " Distância Percorrida: "+distanciaPercorrida); 
                 }
            }

        }



        }