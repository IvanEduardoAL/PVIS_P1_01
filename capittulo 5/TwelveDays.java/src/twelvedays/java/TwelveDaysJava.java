/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelvedays.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class TwelveDaysJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System .in);
        System.out.println("ingrese l dia que  quiera:");
        int d = teclado.nextInt();
        if ( d==12){
            System.out.println("En el duodécimo día de Navidad, \n" +
"mi verdadero amor me las enviaron. \n" +
"Doce tambores Drummin");
        }
        if (d == 11){
            System.out.println("Once gaiteros de tuberías, \n" 
);
        }
        if (d==10){
            System.out.println("Diez señores a-salto");
                    
        }
        if (d==9){
            System.out.println("Nueve mujeres bailando, ");
    }
        if (d==8){
            System.out.println("Ocho doncellas a un ordeño" );
        }
        if (d== 7){
            System.out.println("Siete a un aumento de ");
        }
         if (d== 6){
            System.out.println("Seis gansos a-por el que se  ");
        } 
         if (d== 5){
            System.out.println("Cinco anillos de oro ");
        }
          if (d== 4){
            System.out.println("Cuatro aves llamadas ");
        }
           if (d== 3){
            System.out.println("Tres gallinas francesas, ");
        }
            if (d== 2){
            System.out.println("Dos tórtolas,  ");
        }
    }
    
}
