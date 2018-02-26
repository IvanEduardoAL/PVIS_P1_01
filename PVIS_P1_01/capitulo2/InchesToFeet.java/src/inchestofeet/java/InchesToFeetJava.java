/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeet.java;

/**
 *
 * @author aivan
 */
public class InchesToFeetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pulgadas= 86;
        int pp= 12;
        int pies= pulgadas/pp;
         float residuo= (float)(pulgadas%pp);
         float pulg= (float)(residuo*pp);
        System.out.println("son:"+pies +  "pies");
        System.out.println("y son :"+residuo+"pulgadas");
    }
    
}
