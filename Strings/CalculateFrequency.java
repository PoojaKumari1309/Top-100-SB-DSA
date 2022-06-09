package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateFrequency {
        static String sort(String str)
        {
            char[] c= str.toCharArray();
            Arrays.sort(c);
            return new String(c);
        }

     static void frequency(String str)
     {
         str=sort(str);
         int count =1;
         char ch=str.charAt(0);
         for(int i=1;i<str.length();i++) {
             if (str.charAt(i) == ch) {
                 count++;
             } else {
                 System.out.print(ch);
                 System.out.print(count+" ");
                 ch=str.charAt(i);
                 count=1;
             }

         }

     }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            frequency(str);

    }
}
