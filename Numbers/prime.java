package numbers;

import java.util.Scanner;
public class prime {
    static void prime2(int n)
    {
        int flag=0;
        if(n==1)
        {
            System.out.println("not prime");
        }
        for (int i = 2; (i * i)<n; i++)
        {
            if (n % i == 0)
            {
                System.out.println(" not prime");
                flag=1;
                break;

            }

        }
        if(flag==0)
        {
            System.out.println("prime");
        }
    }
        public static void main (String[]args)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("enter the num");
            int n = kb.nextInt();
            prime2(n);
        }
    }

