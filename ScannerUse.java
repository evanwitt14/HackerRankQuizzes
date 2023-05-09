import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        double secondInt = scanner.nextDouble();

        Scanner word = new Scanner(System.in);
        String myString = word.nextLine();



        System.out.println("String: " + myString);
        System.out.println("Int: " + myInt);
        System.out.println("Double: " + secondInt);
    }
}
