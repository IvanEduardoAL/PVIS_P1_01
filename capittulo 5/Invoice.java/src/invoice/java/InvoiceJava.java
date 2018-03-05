/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.java;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class InvoiceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factura f=new factura();
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de factura");
        int n = teclado.nextInt();
        f.setnf(n);
        System.out.println("ingrese el saldo vencido");
        int s = teclado.nextInt();
        f.setsv(s);
        System.out.println("ingrese el dia");
        int d = teclado.nextInt();
        f.setdia(d);
        System.out.println("ingrese el mes");
        int m = teclado.nextInt();
        f.setmes(m);
        System.out.println("ingrese el año");
        int t = teclado.nextInt();
        f.setaño(t);
    
    if (f.getnf()<1000){ 
        f.setnf(0);
    }
    if(f.getmes()<1 && f.getmes()>12){
        f.setmes(0);
    }
    if(f.getdia()<1 && f.getdia()>31){
        f.setdia(0);
    }
    if (f.getaño()<2011 && f.getaño()>2017){
        f.setaño(0);
    }
    }         
}
