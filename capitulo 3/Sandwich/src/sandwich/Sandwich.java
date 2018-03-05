/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

/**
 *
 * @author aivan
 */
public class Sandwich {
 String a;
 String b;
 Double c;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public void seting (String a){
          
          this.a=a;
          
      }
      public void setpan (String b){
          this.b=b;
      }
      public void setprecio (Double c){
          this.c=c;
      }
      public  String geting(){
          return a;
      }
      public  String getpan(){
          return b;
      }
      public  Double getprecio(){
          return c;
      }
  
}
