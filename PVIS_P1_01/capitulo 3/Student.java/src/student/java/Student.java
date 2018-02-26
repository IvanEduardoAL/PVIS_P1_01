/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       Scanner tem = new Scanner(System.in);
      Integer d,f,j;
      datosestudiante x = new datosestudiante();
        System.out.println("codigo de studante ");
       d = tem.nextInt();
        System.out.println("creditos ganados");
       f = tem.nextInt();
      x.setn(d);
      x.setc(f);
      
     Integer c = x.getc()*4;
        System.out.println("el codigo de laumno "+d +" "+"logoro conseguir:"+c+" "+"puentos401361");

     }
    
        
     
    }
    
    
}
