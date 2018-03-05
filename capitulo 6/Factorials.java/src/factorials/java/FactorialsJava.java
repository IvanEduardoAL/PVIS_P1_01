/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class FactorialsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero:");
        int factorial=entrada.nextInt();
        int v = 1;
        for(int i=factorial;i>0;i--){
            v = v *i;
            System.out.println(v);
        }
    }
    
}
