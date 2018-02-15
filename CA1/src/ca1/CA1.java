/*
 * Daragh Hallows X00104773
 * Conor Griffin  X00111602
 * Fíonn 
 */
package ca1;
import java.util.Scanner;
public class CA1 {
public static void main(String[] args) {
    
String userName, passWord, userNameCheck, passWordCheck;
String mag1, mag2, mag3, discountPercent, name, address, cardType, ccNum;
String type1, type2, type3, type4, type5, type6, type7, dd, mm, yyyy;

int mag1Num, mag2Num, mag3Num;
double mag1Price, mag2Price, mag3Price, discountAmount, netCost, totalCost;
final double type1Price=1.30, type2Price=2.45, type3Price=3.30, type4Price=3.40;
final double type5Price=4.50, type6Price=4.40, type7Price=5.00;

userName="DaraghH";
passWord="abcdef";
type1="Little Kid";
type2="Teen Scene";
type3="Economist";
type4="PC Today";
type5="Best Tech";
type6="Philosophy Today";
type7="Writer's Forum";



Scanner in= new Scanner(System.in);

System.out.println("Please Enter Username: ");
userNameCheck=in.next();
System.out.println("Please Enter Password: ");
passWordCheck=in.next();

if(userName.equals(userNameCheck)&&passWord.equals(passWordCheck))
{
System.out.println("Data Correct - please enter the following ");  
System.out.println(" ");
System.out.print("Enter your Full Name: ");
name=in.next();


System.out.print("Enter your Address: ");
address=in.next();


System.out.print("Enter you Credit Card number: ");
ccNum=in.next();


System.out.print("Enter you Credit Card type: ");
cardType=in.next();


System.out.print("Enter you day of birth: ");
dd=in.next();


System.out.print("Enter you month of birth: ");
mm=in.next();


System.out.print("Enter your year of birth: ");
yyyy=in.next();

System.out.println(" ");
System.out.println("The following is the selection of magazines we offer: ");
System.out.println("Type of Magazine      Cost"); 
System.out.printf(type1+"            %.2f %n",type1Price);
System.out.printf(type2+"            %.2f %n",type2Price);
System.out.printf(type3+"             %.2f %n",type3Price);
System.out.printf(type4+"              %.2f %n",type4Price);
System.out.printf(type5+"             %.2f %n",type5Price);
System.out.printf(type6+"      %.2f %n",type6Price);
System.out.printf(type7+"        %.2f %n",type7Price);
System.out.println(" ");


System.out.print("Enter the first type of Magazine: ");
mag1=in.next();
System.out.print("How many of these would you like to order? ");
mag1Num=in.nextByte();
System.out.println(" ");

System.out.print("Enter the second type of Magazine: ");
mag2=in.next();
System.out.print("How many of these would you like to order? ");
mag2Num=in.nextByte();
System.out.println(" ");

System.out.print("Enter the third type of Magazine: ");
mag3=in.next();
System.out.print("How many of these would you like to order? ");
mag3Num=in.nextByte();        
System.out.println(" ");   

totalCost = in.nextInt();      
System.out.println("Your total cost for this order is: "+totalCost);        
System.out.println(" ");        
System.out.println("Your net cost after the discount has been applied is: "+netCost);        
System.out.println("Thank You! ");        
        
        
    }
    

else
    System.out.println("Username or Password Incorrect!!! ");

        
}

}


