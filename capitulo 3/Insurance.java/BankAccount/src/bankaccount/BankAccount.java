/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author aivan
 */
public class BankAccount {
Integer n;
Integer s;
        public String  datos(){
      return + n+"/"+s; 
      } 
      public void setnom (Integer n){
              this.n=n;
          
      }
      public void setsal (Integer s){
          this.s=s;
      }
      
      public  Integer getnom(){
          return n;
      }
      public  Integer getsal(){
          return s;
      }
     
   
    
    
}
