package numbers;

import java.util.Scanner;

public class strong {
    static int factorial(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {

            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        int num=n;
        int digit=0;
        int sum=0;
        while(n!=0)
        {
            digit =n%10;
           sum+= factorial(digit);
            n=n/10;

        }
        if(num==sum)
        {
            System.out.println("strong number");
        }
        else {
            System.out.println("not strong");
        }


    }
}
