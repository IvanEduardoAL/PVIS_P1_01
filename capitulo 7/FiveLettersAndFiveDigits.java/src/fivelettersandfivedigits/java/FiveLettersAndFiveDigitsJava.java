/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivelettersandfivedigits.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class FiveLettersAndFiveDigitsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
        String c = "";
        System.out.println("Ingresa un caracteres: ");
        c=entrada.nextLine();
        if(c.length()<5){
            System.out.println("No ingreso 5" );
        }
        System.out.println("Ingreso mas de 5 ");
    }
    
}