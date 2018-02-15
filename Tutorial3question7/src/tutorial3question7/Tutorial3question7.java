/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial3question7;
import java.util.Scanner;
/**
 *
 * @author conorgriffin
 */
public class Tutorial3question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int choice;
        double price;
        
        int OAK;
        OAK = 225;
        int PINE;
        PINE = 100;
        int MAHOGANY;
        MAHOGANY = 310;
        
        System.out.println("Please enter choice 1-Oak, 2-Pine, 3-Mahogany");
        choice = in.nextInt();
        
        if (choice==1)
        {
            price = 225;
            System.out.println("You chose Oak, price is: €"+ OAK);
        }
        else if (choice==2)
        {
            price = 100;
            System.out.println("You chose Pine, price is: €"+ PINE);
        }
        else if (choice ==3)
        {
            price = 310;
            System.out.println("You chose Mahogany, price is: €");
        }
        else
        {
            System.out.println("Invalid Entry");
        }
                
    }
    
}
