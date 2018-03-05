/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class deductMonthlyFee {
   Scanner tem = new Scanner(System.in);
      Integer d,f,j;
       BankAccount x = new BankAccount();
      System.out.println("nombre ");
       d = tem.nextInt();
        System.out.println("saldo");
       f = tem.nextInt();
      x.setnom  (d);
      x.setsal (f);
}
