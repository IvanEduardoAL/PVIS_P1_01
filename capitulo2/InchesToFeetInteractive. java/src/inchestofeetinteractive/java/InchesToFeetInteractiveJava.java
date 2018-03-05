/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class InchesToFeetInteractiveJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tem = new Scanner(System.in);
      float d;
        System.out.println("ingres las pulgadas");
       d = tem.nextInt();
         int pulgadas= (int) d;
        int pp= 12;
        int pies= pulgadas/pp;
         float residuo= (float)(pulgadas%pp);
         float pulg= (float)(residuo*pp);
        System.out.println("son:"+pies +  "pies");
        System.out.println("y son :"+residuo+"pulgadas");
    }
    
}
