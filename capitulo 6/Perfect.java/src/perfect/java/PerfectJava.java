/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.java;

/**
 *
 * @author aivan
 */
public class PerfectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i, m, suma;
        System.out.println("Números entre 1 y 1000: ");
        for (i = 1; i <= 1000; i++) {    
            suma = 0;
            for (m = 1; m < i; m++) {  
                if (i % m == 0) {
                    suma = suma + m;     
                }
            }
            if (i == suma) {           
                System.out.println(i);
            }
        }
    }
}