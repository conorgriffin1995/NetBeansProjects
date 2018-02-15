package employee;

/**
 * Lab 1 Week 10
 * @author conorgriffin
 */
public class ProductionWorker extends Employee {
    
    private final int DAY_SHIFT = 1;
    private final int NIGHT_SHIFT = 2;
    private double payRateDay;
    private double payRateNight;
    
    int shiftType;
    
    //Array for daily pay
    private double dailyPay [];
    
    
public ProductionWorker(String NameIn, String empNumberIn, String hireDateIn, 
                        double payRateDaysIn, double payRateNightsIn, int daysWorked ){
    
    super(NameIn, empNumberIn, hireDateIn);
    payRateDay = payRateDaysIn;
    payRateNight = payRateNightsIn;
    dailyPay = new double [daysWorked];
}
public ProductionWorker(){
    super();
    payRateDay = 0;
    payRateNight = 0;
    dailyPay = new double[5];
}   
public void setShift(int Type){
    
   shiftType = Type;
    
}

public void setPayRate(double p){
    payRateDay = p;
}

public int getShift(int shiftType){
    return shiftType;
}

public double getPayRateDay(){
    return payRateDay;
}

public double getPayRateNight(){
    return payRateNight;
}


public void calculatePay(int dayNumber, int hoursWorked, int shiftType){
    if(shiftType == DAY_SHIFT){
        dailyPay[dayNumber - 1] = hoursWorked * payRateDay;
    }
    else{
        dailyPay[dayNumber - 1] = hoursWorked * payRateNight;
    }
    
}

public double totalPay(){
    double total = 0;
    for (int i = 0; i < dailyPay.length; i++ ){
        total += dailyPay[i];
    }
    return total;
}
public void printPay(){
    for (int i = 0; i < dailyPay.length; i++){
        System.out.println("Pay for day "+(i+1)+ " : "+dailyPay[i]);
    }
    
}

public void print(){
    super.print();
    System.out.println("Pay due is €"+totalPay());
}

}
