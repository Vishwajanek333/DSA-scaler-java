import java .util.*;
public class _10_strings {
    public static void main(String[] args) {
        String s = "vishwa";
        // basic operation of strings:
        //1.print
        System.out.println(s);

        // 2.to find  length
        System.out.println(s.length());

        //3.to get element
        System.out.println(s.charAt(2));

        // 4.insert ele
        char y = 'x';
        StringBuilder sb = new StringBuilder(s);
        sb.insert(3, y); // Insert 'X' at index 3
        s = sb.toString();

        System.out.println("ins car"+s);


        // 5.search char
        char ch = 'w';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                System.out.println(" sea char"+i);
            }
        }

        // 6.remove char
        int pos = 5;
        StringBuilder s1 = new StringBuilder("vishwa"); // or pass existing string variable
        System.out.println("del char: " + s1.deleteCharAt(1));
    }
}
