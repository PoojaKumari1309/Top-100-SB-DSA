package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

    static int[] Atfirst(int [] arr,int element)
    {
        int [] arr1 = new int[arr.length+1];
        for(int i=1;i<=arr.length;i++)
        {
            arr1[i]=arr[i-1];
        }
        arr1[0]=element;
        arr=arr1;
        return arr;

    }
    static int[] Atend(int [] arr,int element)
    {
        int [] arr1= new int [arr.length+1];
        arr1[arr1.length-1]=element;
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        arr=arr1;
        return arr;
    }
    static int[] Atposition(int [] arr,int element, int position)
    {
        int [] arr1= new int[arr.length+1];
        for(int i=arr.length;i>position;i--)
        {
            arr1[i]=arr[i-1];
        }
        arr1[position]=element;
        for(int i=0;i<position;i++)
        {
            arr1[i]=arr[i];
        }
        arr=arr1;
        return arr;
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
        int[] a= Atfirst(arr,6);
        int[] b =Atend(a,7);
        int[] c= Atposition(b,8,4);
        arr=c;
        System.out.println(Arrays.toString(arr));
    }
}
