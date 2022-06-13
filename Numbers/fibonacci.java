package numbers;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class fibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = 0, b = 1;
        int n;
        n = kb.nextInt();
        System.out.println("enter the number");
        System.out.print(a+" ");
        System.out.print(b+" ");
        int sum = 0;
        for (int i = 2; i <= n; i++) {

            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}

