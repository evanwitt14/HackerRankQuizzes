import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        String string1 = scan1.next();
        String reverseString = new String();
        char testchar;

        for (int i = 0; i<string1.length(); i++) {
            testchar = string1.charAt(i);
            reverseString = testchar + reverseString;
            System.out.println(reverseString);
        }

        if (reverseString.equals(string1)){
            System.out.println("Palindrome deteced: " + reverseString + " " + string1);
        }

        }
    }

