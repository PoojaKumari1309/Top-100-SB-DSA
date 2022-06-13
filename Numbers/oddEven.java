package numbers;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=kb.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
