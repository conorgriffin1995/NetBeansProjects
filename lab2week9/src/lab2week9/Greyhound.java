package lab2week9;


public class Greyhound extends Animal {
    
    private String name;
    private int age;
    private String Fname;
    private String Mname;
    private int numRaces;
    private int numRacesWon;
    private boolean [] result;
    
public Greyhound(int greyhoundID,int numRacesIn, String nameIn, int ageIn, String mNameIn, String fNameIn ){
    super(greyhoundID,"Greyhound");
    numRaces = numRacesIn;
    name = nameIn;
    age = ageIn;
    Mname = mNameIn;
    Fname = fNameIn;
    
    result = new boolean [numRacesIn];
}

public void updateWinningRecord(int raceNum, boolean resultRan){
    if (resultRan == true){
        numRacesWon++;
    }
    numRaces++;
    result[raceNum-1] = resultRan;
}

public String getName(){
    return name;
}

public int getNumOfRacesWon(){
    return numRacesWon;
}

public void displayDetails(){
    super.displayDetails();
    System.out.println("Name   :"+name);
    System.out.println("Age    :"+age);
    System.out.println("Father :"+Fname);
    System.out.println("Mother :"+Mname);
    System.out.println("Has run : "+numRaces+" and won : "+numRacesWon);
    
    for (int i = 0; i < result.length; i++){
    System.out.println("Race Number : "+(i+1)+ " was won : "+result[i]);  
    }
}

}
