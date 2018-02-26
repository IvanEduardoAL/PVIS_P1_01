/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsalesinteractive.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class ProjectedSalesInteractiveJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tem = new Scanner(System.in);
      float s,ñ;
        System.out.println("ingresa las ventas de este año totales en dólares del norte:  ");
      ñ=tem.nextInt();
       System.out.println("ingresa las ventas de este año totales en dólares del sur:  ");
      s=tem.nextInt();
        float conts = (float)0.10;
        int nort= (int) ñ;
        int sur= (int) s;
        int n= (int) (nort * conts);
        int m= (int)  (sur * conts);
        System.out.println("las  ventas totales en dolares de ñla divicion norte:"+nort+"y su  aumento  es "
        +n);
         System.out.println("las  ventas totales en dolares de la divicion sur:"+sur+"y su  aumento  es "
        +m);
    }
    
}
