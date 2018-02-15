package payroll.application;

import java.util.Scanner;

public class PayrollApplication {


    
    public static void main(String[] args) {
        //Data
        
        double hoursWorked;
        double hourlyRate;
        double pay;
        
        //Begin
        
        Scanner in = new Scanner(System.in);
        
        //Hours
        
        System.out.println("Enter Amount Of Hours Worked : ");
        hoursWorked = in.nextDouble();
        
        //Rate
        
        System.out.println("Enter Your Hourly Rate Of Pay : € ");
        hourlyRate = in.nextDouble();
        
        //Pay
        
        pay = hoursWorked * hourlyRate;
        
        //Overtime
        
        if (hoursWorked > 40)
        {
            pay = pay + ((hoursWorked - 40) * (hourlyRate * 0.5));
        }
        else
        {
            System.out.println("No Overpay");
        }
        System.out.println("Your overall pay is : € " + pay );
    }
    
}
