package lab2week7;
import java.util.Scanner;
/**
 * Lab 2 Week 7 Q1
 * @author Conor Griffin
 */
public class TestDoorToDoor {
    
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       
       int numHouses;
       int numSales;
       double averageSales;
       System.out.println("How many houses are in your estate?");
       numHouses = in.nextInt();
       
       DoorToDoor myEstate = new DoorToDoor(numHouses); 
       myEstate.fillHouses();
       System.out.println();
       
       for (int i = 1; i <= numHouses; i++)
       {
          System.out.println("Please Enter the sales value for house "+ i);
          numSales = in.nextInt();
          myEstate.fillSales(i, numSales);
       }
       
       System.out.println();
       averageSales = myEstate.calcAverageSales();
       System.out.printf("The average sales value from all the sales made: %.2f%n ",averageSales);
       System.out.println();
       myEstate.minSales();
       System.out.println();
       System.out.println("Displaying all house numbers and there sales \n");
       myEstate.displayAll();
        
        
    }
    
}
