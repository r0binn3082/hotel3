/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class singly_rooms extends rooms{
   
    public singly_rooms(){
     for(int i=0;i<floor1st.length;i++){
     floor1st[i]=i+101;
     
    }
        
    }
     public void reservation(){
     if (count1st!=(floor1st.length-1)){
     arrl.add( floor1st[count1st]);
     count1st++;
         System.out.println("your reservation has been done");
     }
     }}
    


