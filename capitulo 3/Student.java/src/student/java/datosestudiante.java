/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.java;
     

/**
 *
 * @author aivan
 */
public class datosestudiante  {
    private Integer n;
    private Integer c;
    
    
      public String  studen(){ 
        // TODO code application logic here
        return +n+"/"+c;
      } 
      public void setn (Integer n){
          
          this. n=n;
          
      }
      public void setc(Integer c){
         this.c=c;
      }
     
      public  Integer getn(){
          return n;
      }
      public  Integer getc(){
          return c;
      }
      
    
}
