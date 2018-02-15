package exam2014q4.b.ii;
import java.util.Random;
/**
 *
 * @author Conor Griffin
 */
public class Exam2014Q4BIi {


    public static void main(String[] args) {
        
        
        
        double [][] scores = new double [3][4];
        
        
        double highestScore = 0;
        int compNum = 0;
        Random rand = new Random();
        
        for (int i = 0; i < scores.length; i++)
        {
            
            for (int j = 0; j < scores[i].length; j++)
            {
               
                scores[i][j] = rand.nextDouble();
                
                if (scores[i][j] > highestScore)
            {
                highestScore = scores[i][j];
                compNum = i+1;
            }    

            }
   
        }
        
        System.out.printf("Competitor number %d had the highest score of %.2f%n ", compNum, highestScore);
        
    }
    
}
