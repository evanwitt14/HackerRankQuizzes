import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDec {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int int1 = scan1.nextInt();
        String [] stringArray = new String[int1];

        for(int i = 0; i< int1; i++){
            stringArray[i] = scan1.next();
        }
        Arrays.sort(stringArray, new Comparator<Object>() {
            @Override
            public int compare(Object a1, Object a2){
                BigDecimal bigDec1 = new BigDecimal((String)a1);
                BigDecimal bigDec2 = new BigDecimal((String)a2);
                return bigDec2.compareTo(bigDec1);
            }
        });
        for(int i= 0 ; i < int1; i++){
            System.out.println(stringArray[i]);
        }

    }
}
