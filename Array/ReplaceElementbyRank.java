package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementbyRank {
    static void replaceElement(int [] arr)
    {
        int[] arr3 = new int[arr.length];
        arr3=arr;
        Arrays.sort(arr3);
        int [] arr2= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr3[j])
                {
                    arr2[i]=j+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
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
        replaceElement(arr);
    }

}
