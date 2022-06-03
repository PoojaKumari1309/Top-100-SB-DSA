package Arrays;

import java.util.Scanner;

public class EquillibriumIndex {
    static void equillibrium(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            int leftsum=0 ;
            for(int j=0;j<i;j++)
            {
                leftsum+=arr[j];
            }
            int rightsum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                rightsum+=arr[j];
            }
            if(leftsum==rightsum)
            {
                System.out.println(i);
                break;
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
        equillibrium(arr);
    }
}
