/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages2.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class Percentages2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tem = new Scanner(System.in);
      int d,f;
        System.out.println("ingres lel numero");
       d = tem.nextInt();
        System.out.println("ingres el numero");
       f = tem.nextInt();
     Percentages2Java x = new Percentages2Java();
     System.out.println(+d+" "+"es el"+" "+x.computePercent(d, f)+" "+"%"+" "+"de "+f);
     System.out.println(+f+" "+"es el"+" "+x.computePercent2(d, f)+" "+"%"+" "+"de "+d);

     }
     public int computePercent (int d, int f) {
        int h = (int)(d*100);
        int l = (int)(h/f);
        return l;
        
     }
   public int computePercent2 (int d, int f) {
        int h = (int)(f*100);
        int l = (int)(h/d);
        return l;
         // TODO code application logic here
    }

   
    
}
