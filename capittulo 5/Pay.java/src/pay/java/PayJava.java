/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class PayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el tipo  de trabajador");
        int tipo = teclado.nextInt();
        if (tipo==1){
            int p =(int) 17.00;
            System.out.println("PAGO :"+p);
        }
         if (tipo==2){
             int p =(int) 20.00;
            System.out.println("PAGO :"+p);
        }
          if (tipo==3){
              int p =(int) 22.00;
            System.out.println("PAGO :"+p);
        }
      
    }
    
}
