package Strings;

import java.util.Scanner;

public class isPallindrome {
    static boolean pallindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
         if(s.charAt(i)!=s.charAt(s.length()-1-i))
         {
             return false;
         }
        }
        return  true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans= pallindrome(str);
        if(ans== true)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }
}
