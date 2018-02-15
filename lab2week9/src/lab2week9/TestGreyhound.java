package lab2week9;



public class TestGreyhound {
    
    public static void main(String[] args) {
        Greyhound flash;  //Object 1
        Greyhound speed;  //Object 2
        
        flash = new Greyhound(1234, 3,"Mr.Flash", 2,"Tom Foley","The Late Late Show");
        flash.updateWinningRecord(1, true);
        flash.updateWinningRecord(2, true);
        flash.updateWinningRecord(3, false);
        
        speed = new Greyhound(6788, 2, "Mr.Jones", 3, "Icarus", "Isis");
        speed.updateWinningRecord(1, true);
        speed.updateWinningRecord(2, false);
        
        flash.displayDetails();
        System.out.println();
        speed.displayDetails();
        
        if(speed.getNumOfRacesWon()>flash.getNumOfRacesWon()){
            System.out.println("Mr.Jones has won the most races with "+speed.getNumOfRacesWon());
            
        }
        else{
           System.out.println("Mr.Flash has won the most races with "+flash.getNumOfRacesWon()); 
        }
    }   
}
