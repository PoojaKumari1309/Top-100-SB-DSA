package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElements {
    static void Repeating(int[]arr)
    {
        int cnt=0;
        int[]dul=new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                dul[cnt++]=arr[i];
            }
        }
    }

    for(int i=0;i<cnt;i++)
    {
        if(dul[i]!=dul[i+1])
        {
            System.out.println(dul[i]+" ");
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements");
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Repeating(arr);
    }
}
