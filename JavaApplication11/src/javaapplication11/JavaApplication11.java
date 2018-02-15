package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    
    
    public static void main(String[] args) {
        //A program that allows the user to enter a GPA value 
        //and the the program displays the appropriate award classification.
        
        double GPA;
        int numFails = 0;
        int numPass = 0;
        int numMerit = 0;
        
        //Begin
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter Your GPA : ");
        GPA = in.nextDouble();
        
        if (GPA < 2.0)
        {
             System.out.print("Your GPA Award = Fail");
             numFails++;
        }       
        else if (GPA < 2.50)
        {
             System.out.print("Your GPA Award = Pass");
             numPass++;
        }
        else
        {
            System.out.print("You GPA Award = Merit");
            numMerit++;
        }
    }
    
}
