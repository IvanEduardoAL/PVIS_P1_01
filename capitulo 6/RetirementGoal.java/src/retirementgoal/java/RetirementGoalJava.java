/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementgoal.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class RetirementGoalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("La jubilacion es a los 80 años");
        System.out.println("Ingrese la edad que tiene: ");
        int k = entrada.nextInt();
        int r = 80-k;
        System.out.println("Le faltan "+r+" años para jubilarse");
        System.out.println("Ingrese la cantidad de dinero ganado al año: ");
        int d = entrada.nextInt();
        int c=0;
        int res=d*r;
        for(int i=k;i<=80;i++){
            c=c+d;
        }
        System.out.println("La cantidad de dinero que puede ganar hasta su jubilacion es: "+res);
    }
    
}