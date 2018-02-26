/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammysrentalprice.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class SammysRentalPriceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("sssssssssssssssssssssssssssssssssss");
        System.out.println("ssSammy’s makes it fun in the sunss");
        System.out.println("sssssssssssssssssssssssssssssssssss");
        Scanner tem = new Scanner(System.in);
      float p;
        System.out.println("icantidade de minutos que laquilara la piesa");
       p = tem.nextInt();
        int h= (int) (p/60);
        int precio= (int) (h*40);
        int r= (int) (p%60);
        int precior= (int) (r*1);
        System.out.println("precio por horas usadas:"+precio);
        System.out.println("precio del residuo:"+precior);
    }
    
}
