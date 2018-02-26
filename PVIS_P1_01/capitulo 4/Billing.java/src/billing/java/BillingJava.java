/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing.java;

/**
 *
 * @author aivan
 */
public class BillingJava {

  public Double computeBill(){
        Double precio = 50*0.08;
        return precio;
    }
    public Double computeBill2(){
        Double precio = (50*2)*0.08;
        return precio;
    }
    public static void main(String[] args){
        Billing x = new Billing();
        System.out.println("cuaesta $50");
        System.out.println("El costo con  8% es: "+x.computeBill()+"Pesos");
        System.out.println("El precio es $50");
        System.out.println("Son dos fotografias y el costo con  8% es: "+x.computeBill2()+"Pesos");
    }// TODO code application logic here
    }
    
}
