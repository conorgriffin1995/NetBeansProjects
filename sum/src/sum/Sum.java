package sum;

/**
 *
 * @author conorgriffin
 */
public class Sum {


    public static void main(String[] args) {
          int sum = 0;
          int i = 1;
          
          while ( i <= 60)
          {
              sum += i;
              i++ ;
                      
          }
          System.out.println("The sum of the first 50 numbers = " + sum);
    }
    
}
