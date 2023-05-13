/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ll");
        rooms r=new rooms(); 
       if(r.x==1){ 
          if(r.y==1){
        r.reservation();
        }else if(r.y==2){
            r.reservation2();}
         else if(r.y==3){
         r.reservation(4);
         }
         }else if(r.x==2){
         r.check_out();
         }else if(r.x==3){
         r.empty_rooms();
         }
         else{ System.out.println("your expectation out of bound");}
               
        
       
        // TODO code application logic here
    }
    
}
