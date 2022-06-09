package Strings;

import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(str1);

        for(int i=0;i<str1.length();i++)
        {
            if((i==0 || i== str1.length()-1) && (int)str1.charAt(i) >= 97)
            {
                sb.setCharAt(i, (char)((int) str1.  charAt(i) - 32));
            }
            else if(str1.charAt(i)==' ')
            {
                if((int)str1.charAt(i-1)>=97)
                {
                    sb.setCharAt(i-1, (char)((int) str1.  charAt(i-1) - 32));
                }
                if((int)str1.charAt(i+1)>=97)
                {
                    sb.setCharAt(i+1, (char)((int) str1.  charAt(i+1) - 32));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
