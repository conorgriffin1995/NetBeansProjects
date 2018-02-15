/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet4question3;
import java.util.Scanner;
/**
 *
 * @author x00111602
 */
public class Worksheet4question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Inputs
        int ENGINE_SIZE;
        int ENGINE_1 = 150;
        int ENGINE_2 = 175;
        int ENGINE_3 = 200;
        int ENGINE_4 = 250;
        int ENGINE_5 = 300;
        int ENGINE_6 = 350;
        int ENGINE_7 = 500;
        
        if (ENGINE_SIZE <= 1000)
        {
            System.out.println ("The price of your Engine is" + ENGINE_1);
        }
        else if (ENGINE_SIZE >1001)
        {
            System.out.println ("The price of your Engine is" + ENGINE_2);
        }
        else if (ENGINE_SIZE >1201)
        {
            System.out.println ("The price of your Engine" + ENGINE_3);
        }
        else if (ENGINE_SIZE >1401)
        {
            System.out.println ("The price of your Engine is" + ENGINE_4);
        }
        else if (ENGINE_SIZE >1601)
        {
            System.out.println ("The price of your Engine is" + ENGINE_5);
        }
        else if (ENGINE_SIZE >1801)
        {
            System.out.println ("The price of your Engine is" + ENGINE_6);
        }
        else
        {
            System.out.println ("The price of your Engine is" + ENGINE_7);
        }
    }
    
}
