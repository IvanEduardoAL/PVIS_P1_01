/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentajes.java;

/**
 *
 * @author aivan
 */
public class PorcentajesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d = 6;
        int f = 7;
        PorcentajesJava x = new PorcentajesJava();
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
        
     }
   
       
}   
     
    
    
}
