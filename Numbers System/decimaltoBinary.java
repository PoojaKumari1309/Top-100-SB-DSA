package conversions;

import java.util.Scanner;

public class decimaltoBinary {
    static void base(int n, int b)
    {
        int p1 = 1;
        int digit1 = 0;
        int rev = 0;
        while (n != 0) {
            digit1 = n % b;
            rev += (digit1 * p1);
            p1 *= 10;
            n /= b;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        System.out.println("enter the base");
        int b=kb.nextInt();
        base(n,b);
    }
}


