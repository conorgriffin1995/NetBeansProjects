package lab1week5;

//Conor Griffin
/*A Book class */

public class Book
{
	private String 	isbn;
	private String 	name;
	private String 	author;
	private String 	edition;
        
//Constructor
public Book(String ID, String bookName, String bookAuth, String bookEdit)
{
        isbn = ID;
        name = bookName;
        author = bookAuth;
        edition = bookEdit;
       
}   
//print details
public void print()
{
        System.out.println("--Book Details--");
        System.out.println("Book ISBN number is  : "+isbn);
        System.out.println("Name of the book is  : " + name);
        System.out.println("The author is        : "+ author);
        System.out.println("The edition is       : "+ edition);
        System.out.println(" ");
} 
//Getter Method for edition
public String getEdition()
{
        return this.edition;
}
//Setter Method for edition
public void setEdition(String newEdition)
{
//change the existing edition to the new value passed in.
        this.edition = newEdition;
}
//Getter method for the book name.
public String getName()
{
        return this.name;
}
public void setName(String newName)
{
        this.name = newName;
}
public String getISBN()
{
        return this.isbn;
}
public void setISBN(String newISBN)
{
        this.isbn = newISBN;
}
public String getAuthName()
{
        return this.author;
}
public void setAuthName(String newAuthName)
{
        this.author = newAuthName;
}
}