import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter size of array: ");
        int ArrSize = scan1.nextInt();


        double [] testArr = new double[ArrSize];

        System.out.println("Please enter array values: ");

        for(int i=0; i<ArrSize; i++)
        {
            //reading array elements from the user
            testArr[i]=scan1.nextInt();
            System.out.println(testArr[i]/5);
        }




    }
}
