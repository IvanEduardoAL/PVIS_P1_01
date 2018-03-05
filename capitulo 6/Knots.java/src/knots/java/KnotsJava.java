/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knots.java;

/**
 *
 * @author aivan
 */
public class KnotsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double c = 1;
        double m2=1;
        int fac = 1;
        for (int i = 15; i <= 30; i++) {
            c = c * 1.852;
            m2 = m2*1.151;
            System.out.println("Kilometros: "+c);
            System.out.println("Millas: "+m2);
        }
    }
}