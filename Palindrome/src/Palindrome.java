import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title = reader.readLine();
        int del = 0;
        int dl = title.length(), arg = 0, n = el(title);
        String[] Text = new String[n];
        while (arg != (n))
        {
            Text[arg] = Input(title);
            arg ++;
            del = 0;
            while (title.charAt(del) != ' ')
            {
                del ++;
            }
            del++;
            title = delete(title, del);
        }
        for (int i = 0; i < n; i++) 			// Перебор входных данных
        {
            String s = Text[i];
            if (isPalindrome(s))						// Проверка на палиндром
            {
                System.out.println(s);					// Вывод слова если оно прошло проверку
            }
        }
    }
    public static String reverse(String s)
    {
        String rev = "";
        for (int i=s.length()-1; i>=0; i--)				// Перебор букв в обратном порядке
        {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static String Input(String title) throws IOException
    {
        int i = 0;
        String s = "";
        while (title.charAt(i) != ' ')
        {
            s += title.charAt(i);
            i ++;
        }
        return s;
    }
    public static boolean isPalindrome(String s)
    {
        return s.equals(reverse(s)); 					// Сравнение слова с этим же словом, перевернутым наоборот
    }
    static String delete(String str, int to)
    {
        return str.substring(0,0)+str.substring(to);
    }
    public static int el(String s)
    {
        int i = 0, n = s.length(), el = 0;
        while(i != n)
        {
            if(s.charAt(i) == ' ')
            {
                el++;
            }
            i++;
        }
        return el;
    }
}