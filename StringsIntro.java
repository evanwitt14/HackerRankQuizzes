

public class StringsIntro {
    public static void main(String[] args) {

        String string1 = "hello";
        String string2 = "java";

        int StringLength1 = string1.length();
        int StringLength2 = string2.length();

        int TotalLength = StringLength1 + StringLength2;

        if (StringLength1 > StringLength2) {
            System.out.println("no");
        }
            else{
            System.out.println("Test");
        }

        System.out.println(TotalLength);
        System.out.println(string1 + " " + string2);

    }
}
