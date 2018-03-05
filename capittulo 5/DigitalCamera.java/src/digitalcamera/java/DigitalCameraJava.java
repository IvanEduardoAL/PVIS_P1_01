/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalcamera.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class DigitalCameraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        System.out.println("ingres ele numero de pixceles");
        int k = teclado.nextInt();
        if(k<=6){
            System.out.println("precio: $99");
        }
        if(k<=10){
            System.out.println("percio: $129");
        }
        else {System.out.println("0");
            
        }
    }
    
}
