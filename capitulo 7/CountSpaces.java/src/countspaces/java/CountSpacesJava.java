/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces.java;

/**
 *
 * @author aivan
 */
public class CountSpacesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String frase = "The person who says something is impossible should not interrupt the person who is doing it";
        char e;
        for(int i=0;i<frase.length();i++){
        e = frase.charAt(i);
         System.out.println(e);
        if(e.equals(" ")){
          System.out.println(i);
           }
        }
    }
    
}