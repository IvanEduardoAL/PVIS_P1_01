/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inbetween.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class InBetweenJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        int n1=teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        int n2=teclado.nextInt();
        for(int i=n2;i<n1;i++){
            System.out.println(i);
        }
    }
    
}