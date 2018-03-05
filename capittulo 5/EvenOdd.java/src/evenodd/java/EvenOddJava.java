/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class EvenOddJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa el numero");
         int diaz= teclado.nextInt();
         if (diaz %2==0){
             System.out.println("el numero es impar");
         }
         else{
             System.out.println(" el numero es impar");
         }
    }
    
}
