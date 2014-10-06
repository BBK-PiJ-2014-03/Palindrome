import java.util.Scanner;

public class PalindromeCreator {
    public static void main(String[] args) {
        
        String userString;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter some text > ");
        userString = keyboard.nextLine();
        
        StringBuilder userPalindrome = new StringBuilder(userString).reverse();
        
        System.out.println(userString + userPalindrome);
    }
}