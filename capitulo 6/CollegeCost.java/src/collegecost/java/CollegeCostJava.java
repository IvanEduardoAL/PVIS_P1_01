/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegecost.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CollegeCostJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de su hijo: ");
        int edad = entrada.nextInt();
        int a = 0;
        int año = 0;
        if (edad <= 18) {
            if (edad <= 10) {
                System.out.println("Tiene menos de 10 anios por lo tanto el gasto es de $10,000");
            }
            if (edad >= 10) {
                System.out.println("Tiene mas de 10 aanios por lo tanto el gasto es de $5,000");
            }
            for (int i = 0; i <= edad; i++) {
                a= a + 1;
                año = 18 - edad;
            }
            System.out.println("Faltan " + año + " anios para que su hijo tenga 18 anios");
        } else {
            System.out.println("Su hijo no tiene 18 anios");
        }
    }

}