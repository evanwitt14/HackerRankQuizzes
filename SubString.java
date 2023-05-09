import java.util.*;

public class SubString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String you wish to test: ");

        String testString = in.next();


        System.out.println("Enter the index range to read from the string: (2 separate numbers)");

        Scanner numIn1 = new Scanner(System.in);
        Scanner numIn2 = new Scanner(System.in);

        int range1 = numIn1.nextInt();
        int range2 = numIn2.nextInt();

        System.out.println("Range selected is: " + range1 + " and " +range2);
        System.out.println(testString.substring(range1, range2));
        }



    }



