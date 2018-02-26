/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestofeetinteractive.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class MilesToFeetInteractiveJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tem = new Scanner(System.in);
      float
        d;
        System.out.println("ingres la distancia a la cas de tus tios:");
       d = tem.nextInt();
       float constante= (float)5280;
        float DistenciaT =( float)(d);
      float distanciaP=  ( float)(constante*DistenciaT);
        System.out.println("La distancia  al acas de mis tios en millas es :"+DistenciaT +"millas");
        System.out.println("La distancia  al acas de mis tios en pies es :"+distanciaP +"pies");
    }
    
}
