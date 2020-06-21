import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] text, substring;
        String string, sub;
        System.out.println("Input string");
        string = in.nextLine();
        text = string.toCharArray();

        System.out.println("Input substring, which do you want to see");
        sub = in.nextLine();
        substring = sub.toCharArray();

        double before = System.nanoTime();
        FindSubstring.KMP(substring, text);
        double after = System.nanoTime();

        boolean flag = true;

        for (int i = 0; i < FindSubstring.KMP(substring, text).length; i++) {
            if (String.valueOf(FindSubstring.KMP(substring, text)[i]) == "") {
                flag = false;
            }
            else {
                flag = true;
                System.out.print("Substring found at " + FindSubstring.KMP(substring, text)[i] + " position");
            }
        }

        if (flag == true) {
            System.out.println();
            System.out.println("Time of KMP search in nanos: " + (after - before));

            before = System.nanoTime();
            string.indexOf(string);
            after = System.nanoTime();

            System.out.println();
            System.out.println("Time of integrated java search in nanos: " + (after - before));
        }
        else
            System.out.print("substring not found");
    }
}
