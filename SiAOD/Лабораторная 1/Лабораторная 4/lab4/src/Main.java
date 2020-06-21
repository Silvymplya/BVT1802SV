import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) {
       int[] array = null;
       try (BufferedReader in = new BufferedReader(new FileReader("lab4.txt")))
       {
           array = in.lines().mapToInt(Integer::parseInt).toArray();
       }
       catch (IOException | NumberFormatException e)
       {
           e.printStackTrace();
       }
       Deque deq = new Deque(array.length);

       for (int i = 0; i < array.length; i++) {
           deq.addElementBot(array[i]);
       }
       String str = "";
       String str1 = "";
       while (deq.isEmpty() == false) {
           if (deq.getBot() < 0) {
               str += " " + Integer.toString(deq.getBot());
           }
           else {
               str1 += " " + Integer.toString(deq.getBot());
           }
           deq.deleteElementBot();
       }
        System.out.println(str + str1);
    }
}
