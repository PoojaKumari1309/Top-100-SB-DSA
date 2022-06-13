package conversions;

import java.util.Scanner;

public class anybasetodecimal {

    static void base(int n,int b)
    {
        int p=1;
        int sum=0;
        int digit=0;
        while(n!=0)
        {
            digit=n%10;
            sum+=(digit*p);
            p*=b;
            n/=10;
        }
        System.out.println(sum);
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
