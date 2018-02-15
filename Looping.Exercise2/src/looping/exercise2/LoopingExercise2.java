package looping.exercise2;
import java.util.Scanner;
/**
 *
 * @author conorgriffin
 */
public class LoopingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Data
        
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        
        int sum = 0;
        int userNumber;
        int count = 0;
        
        Scanner in = new Scanner(System.in);
        
            System.out.print("Enter first number, 0 to finish: ");
            userNumber = in.nextInt();
        
        while (userNumber != 0){
            
            sum = sum + userNumber;
            count++;
            
            System.out.print("Enter second number" + (count+1) + ", 0 to finish: ");
            userNumber = in.nextInt();
            
            System.out.print("Enter third number" + (count+2) + ", 0 to finish: ");
            userNumber = in.nextInt();
            
            System.out.print("Enter fourth number" + (count+3) + ", 0 to finish: ");
            userNumber = in.nextInt();
            
            System.out.print("Enter fifth number" + (count+4) + ", 0 to finish: ");
            userNumber = in.nextInt();
            
        }
        
        System.out.println("The sum of the" +count+ "numbers entered = " + sum);
    }
    
}
