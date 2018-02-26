/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class EggsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float d;
        System.out.println("ingres los huevos");
       d = tem.nextInt(); 
     int doce= (int) (d /12);
    float precio= (float) (doce*3.25);
        System.out.println("son:"+doce+" "+"docenas a solo:"+precio+" "+"pesos");
    float resi= (float) (d %12);
    float pres= (float)(resi*.45);
    System.out.println("sobran:"+resi+" "+"huevos a solo:"+pres+" "+"pesos");
     
     
     
    }
    
}
