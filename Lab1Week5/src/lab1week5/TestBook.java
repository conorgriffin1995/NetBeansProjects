package lab1week5;
import java.util.Scanner;


public class TestBook {
    public static void main(String args[]){
        
        String bookEdit; 
        String isbnNum;
        String bookName;
        String authName;
        
    //Two Book Objects
        Book Book1 = new Book("123", "The Book of Eli", "Denzel Washington", "1st edition");
        
        Book Book2 = new Book("666", "The Lord Of The Rings", "J. R. R. Tolkien", "1st edition");
        
        Book Book3 = new Book(" "," "," "," ");
        
        Book1.print();
        Book2.print();
    
        Scanner in = new Scanner (System.in);
        System.out.print("Enter new edition value: ");
        bookEdit = in.nextLine();
        Book1.setEdition(bookEdit);                    
        System.out.println(" ");
        
        System.out.print("Enter isbn number: ");
        isbnNum = in.nextLine();
        Book3.setISBN(isbnNum);
        System.out.print("Enter Name of book: ");
        bookName = in.nextLine();
        Book3.setName(bookName);
        System.out.print("Enter Author Name: ");
        authName = in.nextLine();
        Book3.setAuthName(authName); 
        System.out.print("Enter edition value: ");
        bookEdit = in.nextLine();
        Book3.setEdition(bookEdit); 
        
        System.out.println("---Complete Data---");
        System.out.println(" ");
        Book1.print();
        Book2.print();
        Book3.print();
        
    }
}
