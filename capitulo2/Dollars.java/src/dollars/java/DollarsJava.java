/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollars.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class DollarsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float p;
        System.out.println("ingres los dolares");
       p = tem.nextInt();
       float vs= (float)(p/.20);
        System.out.println(" son :"+vs+" "+"monedas de 20c");
        float ds= (float)(p/.100);
         System.out.println(" son :"+ds+" "+"monedas de 10c");
         float cs= (float)(p/.05);
        System.out.println(" son :"+cs+" "+"monedas de 5c");
        float us= (float)(p/.01);
        System.out.println(" son :"+us+" "+"monedas de 1c");
        
        
    }
    
}
