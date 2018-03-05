/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasproyectadas.java;

/**
 *
 * @author aivan
 */
public class VentasProyectadasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float conts = (float)0.10;
        int nort= 4000;
        int sur= 5500;
        int n= (int) (nort * conts);
        int m= (int)  (sur * conts);
        System.out.println("las  ventas totales en dolares de ñla divicion norte:"+nort+"y su  aumento  es "
        +n);
         System.out.println("las  ventas totales en dolares de la divicion sur:"+sur+"y su  aumento  es "
        +m);
    }
    
}
