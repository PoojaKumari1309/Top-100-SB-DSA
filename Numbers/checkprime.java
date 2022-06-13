package numbers;

import java.util.Scanner;

public class checkprime {
    static void prime2(int n)
    {
        int flag=0;
        if(n==1)
        {
            flag=1;
        }

        for (int i = 2; (i * i)<=n; i++)
        {
            if (n % i == 0)
            {

                flag=1;
                break;

            }

        }
        if(flag==0)
        {
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max, min;
        max = kb.nextInt();
        min = kb.nextInt();
        for (int i = min; i <= max; i++)
        {
            prime2(i);
        }
    }
}
