/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeet.java;

/**
 *
 * @author aivan
 */
public class MilesToFeetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float constante= (float)5280;
       float DistenciaT =(float)6.213;
       float distanciaP=  constante*DistenciaT;
        System.out.println("La distancia  al acas de mis tios en millas es :"+DistenciaT +"millas");
        System.out.println("La distancia  al acas de mis tios en pies es :"+distanciaP +"pies");
        
        
    }
    
}
