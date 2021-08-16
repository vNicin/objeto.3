/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto3;

import java.util.Random;

/**
 *
 * @author Raphael Mathias
 */
public class Objeto3 {
        
         static Random random = new Random();
         static int linhaChegada = 300;
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A linha de chegada é em " + linhaChegada);
         Grilo grilo1 = new Grilo(1,linhaChegada);
         new Thread(grilo1).start();
         Grilo grilo2 = new Grilo(2, linhaChegada);
         new Thread(grilo2).start();
         Grilo grilo3 = new Grilo(3, linhaChegada);
         new Thread(grilo3).start();
         
      
         
         
    
        
    }
    
  
          
    
}
