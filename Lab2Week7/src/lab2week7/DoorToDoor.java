package lab2week7;

/**
 * Lab 2 Week 7 Q1
 * @author: Conor Griffin
 */
public class DoorToDoor {

    private int [] houses;
    private int [] sales;
    
  public DoorToDoor(int size){
     
    houses = new int [size];
    sales = new int [size];
       
  }
  public void fillHouses(){
    
    for (int i = 0; i < houses.length; i++ )
    {
        houses[i] = i+1;
    }
      
  }
  public void fillSales(int houseNum, int saleQuantity){
      
     sales[houseNum - 1] = saleQuantity;
           
  }
  public void displayAll(){
      
    for(int i = 0; i < houses.length; i++)
    {
        System.out.println("House number "+houses[i]+" had a sales of "+sales[i]);
    }
    
  }
  public double calcAverageSales(){
      double total = 0;
      for(int i = 0; i < sales.length; i++){
          total += sales[i];
          
      }
      return (total/sales.length);
  
  }
  public void minSales(){
      int minIndex = 0;
      for (int i = 0; i < sales.length; i++){
          if (sales[i] < sales[minIndex]){
              minIndex = i;
          }
      
      }
      System.out.println("The house with the minimum sales is house number: "+(minIndex+1)+" with sales: "+sales[minIndex]);
  }
  
    
}
