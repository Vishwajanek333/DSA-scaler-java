import java .util.*;

class _10_1_string_opr {
     public static void main(String[] args){

          String s1="vishwa";
          String s2 ="r22eh072";

         // 1.check same strings
          if(s1.equals(s2)){
              System.out.println(true);
          }
          else{
              System.out.println(false);
          }

        //2.string concatenation: used in formatting message
         System.out.println(s1+s2); // or
         String res =s1.concat(s2);
         System.out.println(res);

        //3.reverse a string : used  in  data encryption
         // using 2 pointers
         char[] chars = s1.toCharArray();// method to  convt string to char array
         int left = 0, right = chars.length - 1;
         while (left < right) {
             char temp = chars[left];
             chars[left] = chars[right];
             chars[right] = temp;
             left++;
             right--;
         }
         System.out.println(chars);

         //4.rotate a string: it roted base  pos to complete
         // vishwa,po= 3 .output:wavish  it will be sequence
         int d=3;

         // Make sure d is within string length
         d = d % s1.length();
         int n = s1.length();
         // Create a temporary character array to hold rotated result
         char[] temp = new char[n];
         // Copy characters from position d to end of string to start of temp
         for (int i = 0; i < n - d; i++) {
             temp[i] = s1.charAt(d + i);
         }
         // Copy the first d characters to the end of temp
         for (int i = 0; i < d; i++) {
             temp[n - d + i] = s1.charAt(i);
         }
         // Convert character array to string
         String rotated = new String(temp);
         // Print the result
         System.out.println("Rotated String: " + rotated);

         //5.palindrome String
         String st="madam";
         int i=0;
         int j=st.length()-1;

         while( i< j) {
             if (st.charAt(i) != st.charAt(j)) {
                 System.out.println("not palindrome");
             }
                  i++;
                 j--;
             }
                 System.out.println(" palindrome");

         // 6.sub-sstringds
         String s = "abc";
         int n2 = s.length();

         System.out.println("All Substrings:");
         for ( i = 0; i < n2; i++) {
             for (j = i + 1; j <= n2; j++) {
                 System.out.println(s.substring(i, j));// i include ,jnot include
             }

         }
         }
     }

