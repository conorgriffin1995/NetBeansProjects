package nestedifstatements;



public class NestedIfStatements {


    
    public static void main(String[] args) {
        //Nested If Statements
        
        //Inputs
        
        int testScore = 95;
        int studentAge = 9;
        
        if (testScore > 90)
        {
            System.out.println("Well Done");
            if (studentAge < 10)
            {
                System.out.println("Excellent for your age");
            }
        }
        else
        {
            System.out.println("Your score is less than 90 and your age is over 10");
        }
        
        
        
        
    }
    
}
