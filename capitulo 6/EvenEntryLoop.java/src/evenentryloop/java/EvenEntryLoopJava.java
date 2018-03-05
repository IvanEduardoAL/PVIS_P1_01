/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenentryloop.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class EvenEntryLoopJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n= entrada.nextInt();
        if (n % 2 == 0) {
            System.out.println("Felicidad");
            for (int i = n; i < 999; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i < 999; i++) {
                System.out.println(i);
            }
        }

    }
}