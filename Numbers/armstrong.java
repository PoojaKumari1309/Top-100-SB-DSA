package numbers;

import java.util.Scanner;

public class armstrong {
   static void arm(int n)
   {      int count=0;
       int num=n;
       int num2=n;
       while(n!=0)
       {
           count++;
           n=n/10;
       }
       int a=count;
       int sum=0;

       while(num!=0)
       {
           int digit=num%10;
           sum+=Math.pow(digit,a);
           num=num/10;
       }
       if(sum==num2)
       {
       System.out.println("armstrong");
       }
       else
       {
       System.out.println("not armstrong");
       }
   }

    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        arm(n);
    }
}
