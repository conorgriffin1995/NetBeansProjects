package ca.practice;
import java.util.Scanner;

public class CAPractice {


    public static void main(String[] args) {
        //Weekly Production Problem
        
        //Data
        final int NUM_MACHINES = 4;
        
        int production = 0;
        int maxDays;
        int numberOver = 0;
        
        //Arrays
        int[]machineCode = new int [4];
        
        double unitCost = 0;
        double weeklyCost = 0;
        double weeklyProd = 0;
        double totalCost= 0;
        double totalProd = 0;
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 1; i<=NUM_MACHINES; i++)  //i = machine number, it goes from 1 - 4
        {
            System.out.println("Enter machine "+machineCode[i]+" code :");
            machineCode[i] = in.nextInt();
            
            weeklyCost = 0;      //re-initialise for each machine
            weeklyProd = 0;
            
            
            System.out.println("How Many days was machine "+machineCode[i]+" operational?");
            maxDays = in.nextInt();    //max days is the number the user enters so the program 
                                       //will run that number of times or "days" 
        
        
        for (int j = 1; j<maxDays; j++ )     //j is equal to the number of days from the start to the max days
        {
            
            System.out.println("Machine " +machineCode[i]+" please enter your production for day "+j);
            production = in.nextInt();
            
            if (production<100)
            {
                unitCost = 0.50 * production;
            }
            
            else if (production >=100 && production <=400)
            {
               unitCost = 0.40 * production;
            }
            
            else
            {
                unitCost = 0.30 * production;
            }
            System.out.println("Machine "+machineCode[i]+" for day"+j+" produced "+production+
                               " at a cost of "+unitCost);
            
            System.out.println();
            
            weeklyCost += unitCost;
            weeklyProd += production;
        }
        
            System.out.println("Machine "+machineCode[i]+"Your weekly production for this week is "+weeklyProd+
                               "at a cost of "+weeklyCost);
            System.out.println();
            
            if (weeklyProd > 1000)
            {
              numberOver++;          
            }

           totalCost += weeklyCost;
           totalProd += weeklyProd;
           
    }
           System.out.println("The weekly cost for this week is "+totalCost);
           System.out.println("The weekly production for this week is "+totalCost);
           System.out.println("The number of machines who produced over 1000 is ");
           System.out.println("Thank You");
        
        
        
    }
    
}
