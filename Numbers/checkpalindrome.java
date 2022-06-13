package numbers;
import java.util.*;
public class checkpalindrome {
    static boolean palindrome(int n) {
        int num = n;
        int digit = 0;
        int reverse = 0;
        while (n != 0) {
            digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n / 10;
        }
        if (num == reverse) {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args)
    {Scanner kb=new Scanner(System.in);
        int max,min;
        max=kb.nextInt();
        min=kb.nextInt();
        for(int i=min;i<=max;i++)
        {
         if( palindrome(i)==true)
         {
             System.out.println(i);
         }

        }


    }
}