/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import static java.lang.System.out;

/**
 *
 * @author aivan
 */
public class NewClass {
    public static void main (String arg[]){
     Sandwich x =new Sandwich();
     x.seting("atun");
     x.geting();
    System.out.println(x.geting());
    
     x.setpan("integral");
     x.getpan();
    System.out.println(x.getpan());
     x.setprecio(15);
     x.getprecio();
    System.out.println(x.getprecio());
    } 
    
}
