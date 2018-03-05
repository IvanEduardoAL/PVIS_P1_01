/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasprices.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class GasPricesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner tem = new Scanner(System.in);
      float price;
        System.out.println("ingres el valor");
      price = tem.nextInt();
      GasPricesJava x = new GasPricesJava();
        System.out.println("el perco en la bomba  debe ser de :"+x.pricePerBarrel(price) 
       );
      
    }
    public float pricePerBarrel (float price ) {
       float n = (float)(price*3.50);
       float l = (float)(n/100);
        return l;
        
    }
}
