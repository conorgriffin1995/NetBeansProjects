package pkgswitch.statements;

import java.util.Scanner;

public class SwitchStatements {


    
    public static void main(String[] args) {
        // Switch Statement to read a month and out put the number of days
        
        //31 days jan, mar, may, july, aug, oct, dec
        //30 days sep, apr, jun, nov
        //28 days feb
        
        final int numberOfDays;
        int month = 0;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter a number from 1-12 for month: ");
        month = in.nextInt();
        
        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
            numberOfDays = 31;
            System.out.print("There are 31 days in month: " + month);
            break;
                
            case 9: case 4: case 6: case 11:
            numberOfDays = 30;
            System.out.print("There are 30 days in month: " + month);
            break;
            
            case 2:
            numberOfDays = 28;
            System.out.print("There are 28 days in month: " + month);
            break;
            
            default:
            System.out.print("invalid month number");
            break;
        }
        
    
        
        
        
    }
    
}
