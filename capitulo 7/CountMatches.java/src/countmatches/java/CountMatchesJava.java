/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countmatches.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CountMatchesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        String c = "";
        String c2 = "";
        char a;
        char b;
        int i, k;
        System.out.println("Ingresa una palabra: ");
        c=entrada.nextLine();
        System.out.println("Ingresa otra palabra: ");
        c2=entrada.nextLine();
        for(i=0;i<c.length();i++){
            a=c.charAt(i);
           
            for(k=0;k<c2.length();k++){
                b=c2.charAt(k);
              
                if(a==b){
                    System.out.println("Las letras que se repiten en la palabra son : "+a+" "+b);
                }
            }
        }
    }
}