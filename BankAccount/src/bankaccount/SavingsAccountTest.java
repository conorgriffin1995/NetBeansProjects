package bankaccount;

/**
 *
 * @author conorgriffin
 */
public class SavingsAccountTest {
    
    public static void main(String args[])
    {
    
    SavingsAccount s = new SavingsAccount(10,100);
    s.addInterest();
    s.print();
    s.withdraw(50);
    s.print();
    
    CurrentAccount c = new CurrentAccount(1500);
    c.deposit(400);
    c.print();
    c.deposit(600);
    c.print();
    
    }
}
