package employee;
import java.util.Scanner;
/**
 *
 * @author conorgriffin
 */
public class TestProductionWorker {
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        String Name;
        int employeeNumber;
        String hireDate;
        double payRate;
        int numDaysWorked;
        int shift;
        int hoursWorked;
        System.out.println("Please enter Name : ");
        Name = in.nextLine();
        System.out.println("Please enter Employee Number : ");
        employeeNumber = in.nextInt();
        System.out.println("Please enter Hire Date : ");
        hireDate = in.nextLine();
        System.out.println("Please enter Pay Rate : ");
        payRate = in.nextDouble();
        System.out.println("Please enter number of days worked : ");
        numDaysWorked = in.nextInt();
        for (int i = 0; i < numDaysWorked; i++){
        System.out.println("Did you work day or night for shift "+(i+1)+ "? Enter 1 for day, 2 for night : ");
        shift = in.nextInt();
        while((shift !=1)&&(shift!=2)){
            System.out.println("Error please re-enter number : ");
            shift = in.nextInt();   
        }
        System.out.println("How many hours did you work on day "+(i+1)+"?");
        hoursWorked = in.nextInt();
        
        }
        
    }
}
