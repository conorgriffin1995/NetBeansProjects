/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111;

import java.util.Scanner;

/**
 *
 * @author conorgriffin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //Data
        
        int sum = 0;
        int i = 1;
        
        //Loop
        
        while (i <= 50) {
        sum += i;
        i++;
        }
        
        System.out.println("The Total Of The First 100 Integers is: " + sum);
    }
    
}
