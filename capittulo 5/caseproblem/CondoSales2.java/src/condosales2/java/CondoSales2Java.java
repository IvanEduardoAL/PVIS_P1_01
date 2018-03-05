/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CondoSales2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa la el numero de la vta que quieres tener: 1 para la vista del parque, "
                 + "2 para la vista del campo de golf, o 3 para la vista del lago");
         
             
         int tipo= teclado.nextInt();
         if (tipo == 1 ){
             float p=(float) 150.000;
        System.out.println("Park View  precio: $"+p);
             
             
         }
         if (tipo== 2){
             float p= (float)170.000;
                     
             System.out.println("campo de golf precio: "+p);
         }
         if (tipo ==3){
             float  p= (float)210.000;
             System.out.println("vistas al lago precio: $"+p);
         }
         else {
             System.out.println(" precio:00000");
         }
         
      System.out.println("ingres el numero de tipo de estacionamiento:(1) garage o un (2) espacio de estacionamiento");
         int esta= teclado.nextInt();
         if (esta==1){
         float price = p +5.00; 
         }
         else {}
    }
    }
    
}
