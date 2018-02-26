/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcalculator.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class PaintCalculatorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner tem = new Scanner(System.in);
      float d,f;
        System.out.println("ingres la alura");
       d = tem.nextInt();
        System.out.println("ingres  la base");
       f = tem.nextInt();
     PaintCalculatorJava x = new PaintCalculatorJava();
     System.out.println("La abitacion de:"+d+"x"+f+" "+"cuesta:"+x.computePercent(d, f));
      
     

     }
     public float computePercent (float d, float f) {
       float h = (float)(d*f);
        float j = (float)(h*2);
        float ñ = (float)(j/350);
        float l = (float)(ñ*32);
        return  (float) l;
        
     }
   
    
    

   
    }
    
}
