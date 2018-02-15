package nested.pkgif.pkg2;

import java.util.Scanner;

public class NestedIf2 {


    
    public static void main(String[] args) {
        //nested if to determine if x and y are equal to 30 and 10
        
        int x = 30;
        int y = 1000;
        
        if ( x==30)
        {
            if (y==10)
            {
                System.out.println("Both x and y are equal to 30 and 10");
            }
        }
        
        else if (x==30)
        {
            if ( y!=10)
            {
                System.out.println(" x = 30 but y does not = 10");
            }
        }
        
        else if (x!=30)
        {
            if (y==10)
            {
                System.out.println("x does not = 30 but y does = 10");
            }
        }       
        else
        {
            System.out.println("x and y does not equal 30 and 10");
        }
    }
    
}
