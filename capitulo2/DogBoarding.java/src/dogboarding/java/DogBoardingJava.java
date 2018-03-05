/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogboarding.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class DogBoardingJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float p,d;
        System.out.println("ingres el peso");
       p = tem.nextInt(); 
       System.out.println("ingres los dias");
       d = tem.nextInt(); 
       float pp= (float)(p*.50);
       float pt= (float)(pp*d);
        System.out.println("Precio total:"+pt);
       
    }
    
}
