package pkg3.letter.acronyms;

import java.util.Scanner;


public class LetterAcronyms {


    
    
    public static void main(String[] args) {
        //3 Letter Acronyms
        
        String fWord;
        String sWord;
        String tWord;
        
        char initial1, initial2, initial3;
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter First Word : ");
        fWord = in.next();
        fWord = fWord.toUpperCase();
        
        System.out.print("Enter Second Word : ");
        sWord = in.next();
        sWord = sWord.toUpperCase();
        
        System.out.print("Enter Third Word : ");
        tWord = in.next();
        tWord = tWord.toUpperCase();
        
        initial1 = fWord.charAt(0);
        initial2 = sWord.charAt(0);
        initial3 = tWord.charAt(0);
        
        System.out.println("The 3 Letter Acronym is : "+initial1 +initial2 +initial3);
        in.nextLine();
        
        
    }
    
}
