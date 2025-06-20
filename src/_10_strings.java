import java .util.*;
public class _10_strings {
    public static void main(String [] args) {
        String s = "vishwa";

        //1.print
        System.out.println(s);

        // 2.to get the length
        System.out.println(s.length());

        //3.to get
        System.out.println(s.charAt(2));

        // 4.set: directly is not possible but  u can use char
        // Convert to char array
        char[] chars = s.toCharArray();
        chars[2] = 'a';
        // Convert back to String
        s = new String(chars);
        System.out.println(s);

        // 5.search char
        char ch = 's';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                System.out.println(i);
            }
        }
        System.out.println();

        //6.

    }
}
