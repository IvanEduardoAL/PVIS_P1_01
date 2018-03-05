/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.java;

/**
 *
 * @author aivan
 */
public class factura {
    int NF;
    int Sv;
    int dia ;
    int mes;
    int año;
          
      public void setsv (Integer sv){
          
         this. Sv=sv;
          
      }
      public void setnf (Integer nf){
         this.NF=nf;
     }
      public void setdia (Integer d){
          
          dia=d;
          
      }
      public void setmes (Integer m){
          mes=m;
      }
      public void setaño (Integer a){
          año=a;
      }
      public  Integer getnf(){
          return NF;
      }
      public  Integer getsv(){
          return Sv;
      }
      
      public  Integer getdia(){
          return dia;
      }
      public  Integer getmes(){
          return mes;
      }
     
      public  Integer getaño(){
          return año ;
      }
   
}
