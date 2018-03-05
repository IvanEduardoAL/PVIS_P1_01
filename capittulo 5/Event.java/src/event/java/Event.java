/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event.java;

/**
 *
 * @author aivan
 */
import java.util.Scanner;

public class Event {
    private Integer invitados;
    public void setInvitados(Integer k) {
        invitados = k;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public Integer operacion() {
        Integer res = invitados*35;
        return res;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Event x=new Event();
        System.out.println("    ****************************************************");
        System.out.println("    *\tCarly’s makes the food that makes it a party.  *");
        System.out.println("    ****************************************************");
        System.out.println("Ingrese los invitados: ");
        x.setInvitados(entrada.nextInt());
        if (x.getInvitados()>=50){
            System.out.println("¡¡¡Fiesta Grande!!!");
            System.out.println("El precio es : " + x.operacion()+" pesos");
        }else{
            System.out.println("¡¡¡Fiesta Pequeña!!!");
            System.out.println("El precio es : " + x.operacion()+" pesos");
        }
    }
}
}
