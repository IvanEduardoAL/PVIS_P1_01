/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class InterestJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      int d,f;
        System.out.println("ingres invecion inicial");
       d = tem.nextInt();
        System.out.println("ingres el numero de años");
       f = tem.nextInt();
     InterestJava x = new InterestJava();
        System.out.println("su ganancia es de:" +x.ganancias(d, f));
     }
     public int ganancias (int d, int f) {
        int h = (int)(d*0.05);
        int l = (int)((h*f));
        return l;
        
     }
    
    
}
