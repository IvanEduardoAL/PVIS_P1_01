/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpentrychoice.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class CarpentryChoiceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
        String o = "";
        System.out.println("Objetos disponibles: Mesa, Escritorio, Ropero, Centro de entrentenimiento");
        System.out.println("Selecciona una opcion: ");
        o=entrada.nextLine();
        if(o=="Mesa"){
            System.out.println("Precio: $250");
        }
        if(o=="Escritorio"){
            System.out.println("Precio: $350");
        }
        if(o=="Ropero"){
            System.out.println("Precio: 450");
        }
        if(o=="Centro de entretenimioento"){
            System.out.println("Precio: $1250");
        }
    }
    
}