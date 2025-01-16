package LEVEL2;

import java.util.Scanner;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text){
        this.text=text;
    }
    
    boolean isPalindrome(){
        StringBuffer sb = new StringBuffer();
        sb.append(text);
        String textReverse = sb.reverse().toString();
        
        if (text.equals(textReverse)) {
           return true;
        }
        else
        return false;
     }

    void display(boolean isPalindrome){
       System.out.println("Is string is Palindrome ? "+isPalindrome);
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text :");
        String text = input.next();

        PalindromeChecker res = new PalindromeChecker(text);
        
        boolean isPalindrome=res.isPalindrome();

        res.display(isPalindrome);

        input.close();
    }
}
