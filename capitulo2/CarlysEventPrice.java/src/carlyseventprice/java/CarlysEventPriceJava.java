/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlyseventprice.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CarlysEventPriceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xCarly’s makes the food that makes it a partyx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Scanner tem = new Scanner(System.in);
      float p;
        System.out.println("ingres el numero de invitados");
       p = tem.nextInt();
       int pt =(int)(p*35);
        System.out.println("costo total:"+pt);
       if ( p>=50){
           System.out.println("verdadero"); 
       }
       else{System.out.println(" falso");
    }
    
}
