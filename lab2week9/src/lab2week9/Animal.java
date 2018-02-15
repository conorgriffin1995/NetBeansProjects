package lab2week9;



public class Animal {

    private int ID;
    private String type;
    
    
  public Animal(int animalID, String typeIn){
    ID = animalID;
    type = typeIn;
       
  }
  public Animal(){
    ID = 0;
    type = "";
    
  }
  public void displayDetails(){
    System.out.println("Animal:       ");
    System.out.println("ID: "+ID);
    System.out.println("Type: "+type);
    
  }
    
}


