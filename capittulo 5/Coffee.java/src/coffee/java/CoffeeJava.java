/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CoffeeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          int i=5; 
          while ( i > 0 ) {
        System.out.println("(1) Americano 1.99"
        +" (2) Espresso 2.50"
        +"(3) Latte 2.15");
         System.out.println("ingrese el numero  de la bebida que dece");
         float tipo= teclado.nextInt();
         if(tipo == 1){
             float p=(float)1.99;
             System.out.println(" precio:"+p);
         }
         else if(tipo == 2){
             float p=(float)2.50;
             System.out.println(" precio:"+p);
         }
         else if(tipo == 3){
             float p=(float)2.15;
             System.out.println(" precio:"+p);
         }
        else {
          i=0;   
       System.out.println("precio:0");
         }
         
          }
        
    }
    
}
