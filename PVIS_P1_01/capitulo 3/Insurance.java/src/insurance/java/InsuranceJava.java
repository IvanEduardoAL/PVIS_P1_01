/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class InsuranceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float d,f;
        System.out.println("ingrese el año actual");
       d = tem.nextInt();
        System.out.println("ingrese año de nacimiento");
       f = tem.nextInt();
     InsuranceJava  x = new InsuranceJava ();
     System.out.println("su prima anual es de :"+x.Primaanual (d, f));
      
     

     }
     public float Primaanual (float d, float f) {
       float h = (float)(f-d);
        float j = (float)(h/10);
        float ñ = (float)(j+15);
        float l = (float)(ñ*20);
        return  (float) l;
        
     
    }
    
}
