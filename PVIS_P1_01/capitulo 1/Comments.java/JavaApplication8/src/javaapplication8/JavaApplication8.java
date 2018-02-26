/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author aivan
 */import java.util.Scanner;
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    
      public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int h=0, m=0, h2;
        System.out.println("Introduzca la hora (sin los minutos) en formato de 24 horas.");
        h=teclado.nextInt();
        h2=(Math.abs(h-12));
        
        System.out.println("Introduzca los minutos.");
        m=teclado.nextInt();
        
        if ((h==00) || (12<h)){
            if (h==00){
                if (10<=m){
                    System.out.println("La hora exacta es: " +h2+ ":"+m+"AM.");
                    
                }else{
                    System.out.println("La hora exacta es: " +h2+ ":0"+m+"AM.");
                }
                
            }else{
                if (10<=m){
                    System.out.println("La hora exacta es: " +h2+":"+m+"PM.");
                }else{
                    System.out.println("La hora exacta es: " +h2+":0"+m+"PM.");
                    
                }
                 
            }
            
        }else{
           if(h==12){
               if(10<=m){
                   System.out.println("La hora exacta es: " +h+ ":"+m+"PM.");
               
               }else{
                   System.out.println("La hora exacta es: " +h+ ":0"+m+"PM.");
               }
               
           }else{
               if (10<=m){
                   System.out.println("La hora exacta es: " +h+":"+m+"AM.");
               }else{
                   System.out.println("La hora exacta es: " +h+":0"+m+"AM.");
               }
            
            
          
        
           }
        }
    }  // TODO code application logic here
    }
    

