package conversions;

import java.util.Scanner;

public class anybaseToanybase {
    static void function(int num, int b1,int b2)
    {
        int p=1;
        int sum=0;
        int digit=0;
        while(num!=0)
        {
            digit=num%10;
            sum+=(digit*p);
            p*=b1;
            num/=10;
        }
        int p1=1;
        int digit1=0;
        int rev=0;
        while(sum!=0)
        {
            digit1=sum%b2;
            rev+=(digit1*p1);
            p1*=10;
            sum/=b2;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=kb.nextInt();
        System.out.println("Enter the base of Number");
        int base1=kb.nextInt();
        System.out.println("Enter the base of Number u want to convert");
        int base2=kb.nextInt();
        function(num,base1,base2);
    }
}
