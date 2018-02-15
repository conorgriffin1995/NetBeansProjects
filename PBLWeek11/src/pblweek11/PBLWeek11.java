package pblweek11;

import java.util.Scanner;

public class PBLWeek11 {


    
    public static void main(String[] args) {
     //Data
        
     //double
     double tax;
     
     double taxTypeA = 0;
     double taxTypeB = 0;
     double taxTypeC = 0;
     double taxTypeD = 0;
     
     //int
     final int NUM_EMPLOYEES = 5;
     int grossPay = 0;
     
     int totalTypeA = 0;
     int totalTypeB = 0;
     int totalTypeC = 0;
     int totalTypeD = 0;
     
     
     
     
     //Arrays
     String[] ppsNumber = new String[NUM_EMPLOYEES];
     double [] netPay = new double [5];
     
     Scanner in = new Scanner(System.in);
     
     
     for (int i = 1; i<NUM_EMPLOYEES; i++){
         
         System.out.println("Please Enter Employee's: " +i+ " PPS Number: ");
         ppsNumber[i]=in.next();
         
         System.out.println("Please Enter Employee's: " +i+ " gross pay: ");
         grossPay=in.nextInt();
         
         System.out.println( ppsNumber[i]+ " has a gross pay of " +grossPay);
         
         if (grossPay<=10000)
         {
            tax = 0;
            taxTypeA += tax;
            totalTypeA++;
         }
         
         else if (grossPay<=20000)
         {
            tax = (grossPay - 10000) * 0.30;
            taxTypeB += tax;
            totalTypeB++;
         }
         
         else if (grossPay<=50000)
         {
             tax = (grossPay - 10000) * 0.35;
             taxTypeC += tax;
             totalTypeC++;
         }
         else
         {
             tax = (grossPay - 15000) * 0.40;
             taxTypeD += tax;
             totalTypeD++;
         }
         
         netPay[i] = grossPay - tax;
         System.out.println("Paid tax of "+tax+" and has netpay of: " +netPay[i]);
         
         System.out.println(" ");
       
     }
         System.out.println("Employee payment details");
         
     for (int i = 1; i<NUM_EMPLOYEES; i++){
         
        System.out.println(ppsNumber[i]+ " " +netPay[i]);
        
    }
        System.out.println("Total Tax Paid In each bracket ");
        System.out.println("Total Tax Type B :" +taxTypeB);
        System.out.println("Total Tax Type C :" +taxTypeC);
        System.out.println("Total Tax Type D :" +taxTypeD);
        System.out.println("Total Numbers in each bracket");
        System.out.println("Number in Type A :" +totalTypeA);
        System.out.println("Number in Type B :" +totalTypeB);
        System.out.println("Number in Type C :" +totalTypeC);
        System.out.println("Number in Type D :" +totalTypeD);
     
        
    }
    
}
