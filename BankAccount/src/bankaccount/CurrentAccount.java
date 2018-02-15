package bankaccount;

/**
 *
 * @author conorgriffin
 */
public class CurrentAccount extends BankAccount {
    
    private int transactionCount;
    
    //Current Account Constructor
    public CurrentAccount(double initbal){
        
        super(initbal);
        transactionCount = 0;
        System.out.println("\t\t Current Account Constructor");
        
    }
    
    public void deposit(double amount){
        
        super.deposit(amount);
        transactionCount++;
    }
    
    public void print(){
        super.print();
        System.out.println("\t\t Number of transactions is :"+transactionCount);
    }
}
