/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.pkg2014exam;

/**
 *
 * @author conorgriffin
 */
public class Sample2014Exam {

   private double [] numbers;
   int n;
   
   public Sample2014Exam(int size){
       
       numbers = new double [size];
       
   }
   public double average(double average){
       return average;
       
   }
   public void addArray(double [] numbers2){
       
       for (int i = 0; i < numbers2.length; i++){
           numbers[i] += numbers2[i];
       }
       
     
   }

    
}
