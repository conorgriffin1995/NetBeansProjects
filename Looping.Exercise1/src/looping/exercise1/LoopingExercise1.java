package looping.exercise1;
import java.util.Scanner;
/**
 *
 * @author conorgriffin
 */
public class LoopingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Data
        
        int i   = 1;
        int sum = 0;
        while (i <= 50) {
        sum += i;
        i++;
        }
        System.out.println("result: " + sum);
    }
    
}
