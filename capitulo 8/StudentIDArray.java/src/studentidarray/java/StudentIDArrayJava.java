/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentidarray.java;

import java.util.ArrayList;

/**
 *
 * @author aivan
 */
public class StudentIDArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <String> a = new ArrayList<String>();
        ArrayList <Integer> i = new ArrayList<Integer>();
        ArrayList <String> g = new ArrayList<String>();
        a.add("Luis");
        a.add("Pedro");
        a.add("Lucas");
        a.add("Antonio");
        i.add(0144);
        i.add(0145);
        i.add(0146);
        i.add(0147);
        g.add("A");
        g.add("B");
        g.add("C");
        g.add("D");
        System.out.println("Alumno: "+a.get(0)+" ID: "+i.get(0)+" Grado: "+g.get(0));
        System.out.println("Alumno: "+a.get(1)+" ID: "+i.get(1)+" Grado: "+g.get(1));
        System.out.println("Alumno: "+a.get(2)+" ID: "+i.get(2)+" Grado: "+g.get(2));
        System.out.println("Alumno: "+a.get(3)+" ID: "+i.get(3)+" Grado: "+g.get(3));
    }
    
}