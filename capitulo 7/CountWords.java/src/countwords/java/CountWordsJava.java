/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CountWordsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        String p = ""; 
        int c=0;
        System.out.println("Ingresa una palabra: ");
        p=entrada.nextLine();
        for(int i = 0;i<p.length();i++){
            c=c+1;
        }
        System.out.println("La palabra tiene "+c+" letras");
    }
    
}