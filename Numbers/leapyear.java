package numbers;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        if(n%400==0)
        {
            System.out.println("leap year");
        }
        else if(n%100==0)
        {
            System.out.println("leap year");
        }
        else if(n%4==0)
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap");
        }
    }
}
