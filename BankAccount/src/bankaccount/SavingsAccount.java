package bankaccount;

/**
 *
 * @author conorgriffin
 */
public class SavingsAccount extends BankAccount {
    
    private double interestRate;
    
    //
    public SavingsAccount(double rate, double balance){
        
        super(balance);
        interestRate = rate;
        
    }
    //add interest method
    public void addInterest(){
        
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    
    //override print method
    public void print(){
        super.print();
        System.out.println("\t\t Called print() in SavingsAccount after super class print() ");
        System.out.println("\t\t Interest Rate is "+interestRate);
    }
}
