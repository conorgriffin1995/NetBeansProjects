
package loop.calculate.pay;

import java.util.Scanner;

public class LoopCalculatePay {


    
    public static void main(String[] args) {
        //assigning grades
        
        //inputs

        char grade = 0;
        int studentId;
        double points;
        
        Scanner in = new Scanner(System.in);
        
        //Begin
        
        System.out.println("Enter Student ID, 2...200 : ");
        studentId = in.nextInt();
        
        while (studentId<2 || studentId>200)
        {
          System.out.println("Student ID is out of range please re-enter");
          studentId = in.nextInt();
        }
        
        System.out.println("Enter number of points, 0...100 : ");
        points = in.nextDouble();
        
        while (points<0 || points>100)
        {
          System.out.println("points are out of range, please re-enter");
          points = in.nextDouble();  
        }
        
        if (points>90)
        {
            grade = 'A';
        }
        else if (points>80)
        {
            grade = 'B';
        }
        else if (points>60)
        {
            grade = 'C';
        }
        else if (points>30)
        {
            grade = 'D';
        }
        else if (points>14)
        {
            grade = 'E';
        }
        else
        {
            System.out.print("You Got An F");
        }
        
        System.out.println("Student Id Number : " + studentId + " recieved a Grade : " + grade);
    }
    
}
