/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconversion.java;

/**
 *
 * @author aivan
 */
public class MetricConversionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float c = 5;
        float l = 2;
       MetricConversionJava x = new MetricConversionJava();
        System.out.println("convercion de galones a litros:"+x.litroConversion(l));
         System.out.println("convercion de galones a centimetros:"+x.MetricConversion(c));
        
       
    }
        public float MetricConversion (float c ) {
       float n = (float)(c*2.54);
       float l = (float)(n/1);
        return l;
        
    }
       public float litroConversion (float l) {
       float n = (float)(l* 3.7854);
       float m = (float)(n/1);
        return m;
        
    }
    
}
