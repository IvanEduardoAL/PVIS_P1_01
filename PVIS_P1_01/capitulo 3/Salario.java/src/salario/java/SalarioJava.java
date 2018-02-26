/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class SalarioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float d,f,j;
        System.out.println("tarifa de pago por hora");
       d = tem.nextInt();
        System.out.println("horas regualres");
       f = tem.nextInt();
      System.out.println("horas extra");
       j = tem.nextInt();
    SalarioJava   x = new SalarioJava  ();
     System.out.println("su pago es de  :"+x.Prago (d, f,j));
      
     

     }
     public float Prago(float d, float f,float j) {
       float h = (float)(f*d);
        float p = (float)(d*1.5);
        float ñ = (float)(j*p);
        float l = (float)(ñ+h);
        return  (float) l;
        
     
    }
    }
    
}
