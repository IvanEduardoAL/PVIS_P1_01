/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CondoSalesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa la el numero de la vta que quieres tener: 1 para la vista del parque, "
                 + "2 para la vista del campo de golf, o 3 para la vista del lago");
         int tipo= teclado.nextInt();
         if (tipo == 1 ){
             System.out.println("Park View  precio: $150.000,");
             
         }
         if (tipo== 2){
             System.out.println("campo de golf precio: $170.000");
         }
         if (tipo ==3){
             System.out.println("vistas al lago precio: $210.000");
         }
         else {
             System.out.println(" precio:00000");
         }
    }
    
}
