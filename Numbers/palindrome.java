package numbers;

import java.util.Scanner;

public class palindrome {
    static void palindrome2(int n) {
        int num = n;
        int digit = 0;
        int reverse = 0;
        while (n != 0)
        {
            digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n / 10;
        }
        if (num == reverse)
        {
            System.out.println("palindrome");
        } else
        {
            System.out.println("not palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
      int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        palindrome2(n);

    }
}
