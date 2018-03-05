/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlistdemo.jav;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class NumberListDemoJav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
        ArrayList <Integer> arreglo = new ArrayList <Integer>();
        arreglo.add(1);
        arreglo.add(2);
        arreglo.add(7);
        arreglo.add(3);
        arreglo.add(6);
        arreglo.add(23);
        arreglo.add(17);
        arreglo.add(210);
        System.out.println("Ingresa la opcion: ");
        System.out.println("1)Mostrar valores\n2)Mostrar Valores al reves\n3)Suma de valores\n4)Valor mas chico\n4)Valor mas alto\n5)Valor ordenado del mas grande la mas chico");
        int o=entrada.nextInt();
        if(o==1){
            System.out.println(arreglo);
        }
        if(o==2){
            System.out.println(arreglo.get(7)+" "+arreglo.get(6)+" "+arreglo.get(5)+" "+arreglo.get(4)+" "+arreglo.get(3)+" "+arreglo.get(2)+" "+arreglo.get(1)+" "+arreglo.get(0));
        }
        if(o==3){
            int c=0;
            int aux;
            for(int i=0;i<arreglo.size();i++){
                aux=arreglo.get(i);
                c=c+aux;
            }
            System.out.println(c);
        }
        if(opcion==4){
            int m = 0;
            for(int i=1;i<arreglo.size();i++){
                if(arreglo.get(i)<arreglo.get(m)){
                m = i;
                }
            }
            System.out.println(m);
        }
    }
    
}