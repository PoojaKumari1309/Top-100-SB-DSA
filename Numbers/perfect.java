package numbers;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("enter the number");
        n=kb.nextInt();
        int num=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
            sum+=i;
            }
        }
        if(num==sum)
        {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect number");
        }
        }
    }