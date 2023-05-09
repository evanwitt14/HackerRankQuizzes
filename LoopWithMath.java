import java.util.Scanner;

public class LoopWithMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int setNum = scan.nextInt();
        for (int i = 2; i <= 20; i++) {
            int multiple = setNum * i;
            System.out.println(multiple);

        }
    }
}