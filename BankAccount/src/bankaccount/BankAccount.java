package bankaccount;

/**
 *
 * @author conorgriffin
 */

//Super class
public class BankAccount {

    protected double balance;
    
//default Constructor
public BankAccount() {

    balance = 0;
    
  }

//overloaded constructor
public BankAccount(double initialBalance){
    
    balance = initialBalance;
    
  }

//deposit method
public void deposit(double amount){
    
    balance = balance + amount;
    
}

//withdraw method
public void withdraw(double amount){
    
    balance = balance - amount;
    
  }

//getter method for getting balance
public double getBalance(){
    
    return balance;
    
  }

//print method
public void print(){
    
    System.out.println("\t\t Balance is "+balance);
    
  }
}