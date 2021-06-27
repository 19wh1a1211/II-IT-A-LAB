import java.util.Scanner;
 
public class PalindromeUsingFOR
{
    public static void main(String[] args) 
    {
        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);
        String origString = in.nextLine();
        String reverseString = "";
         
        char[] characters = origString.toCharArray();
 
        for( int i = characters.length - 1 ; i >= 0 ; i-- ) {
            reverseString = reverseString + characters[i];
        }
 
        
        if (origString.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}