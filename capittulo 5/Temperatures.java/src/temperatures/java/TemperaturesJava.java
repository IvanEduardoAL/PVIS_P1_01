/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class TemperaturesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa la temperatura mas alta");
         int alta= teclado.nextInt();
         System.out.println("ingresa la temperatura mas baja");
         int baja= teclado.nextInt();
         int t= alta -baja;
             if (alta>=90){
                 System.out.println("ADVERTENCIA de calor");
              }   
         if (baja<= 32){
             System.out.println("ADVERTENCIA de congelación");
         }
        if(t>= 40){
            System.out.println("oscilación grande de la temperatura");
        }
    }
}   
     
    
   
