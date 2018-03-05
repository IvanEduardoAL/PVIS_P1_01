/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class FahrenheitToCelsiusJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner tem = new Scanner(System.in);
      float f;
        System.out.println("ingres  latemperatura en  Fahrenheit");
       f = tem.nextInt();
       float b=(float) (f-32);
       float c=(float) (b*0.55);
        System.out.println(" temperatura en Fahrenheit:"+f+"  "+"temperatura en celsius:"+c);
       
    }
    
}
