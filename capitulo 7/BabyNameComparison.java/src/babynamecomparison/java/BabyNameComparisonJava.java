/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynamecomparison.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class BabyNameComparisonJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String n1="";
        String n2 =" ";
        String n = "";
        System.out.println("Ingrese el primer nombre: ");
        n1=entrada.nextLine();
        System.out.println("Ingrese el segundo nombre:");
        n2= entrada.nextLine();
        n=n1+n2;
        System.out.println("Posible nombre: "+n);
    }
    
}