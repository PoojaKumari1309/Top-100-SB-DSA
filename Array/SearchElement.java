package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

    static int binarySearch(int [] arr, int ele)
    {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
             int mid=(start+end)/2;
            if(arr[mid]==ele)
            {
                return mid;
            }
            else if(arr[mid]>ele)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
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
        Arrays.sort(arr);
        int k=sc.nextInt();
        int index= binarySearch(arr,k);
        System.out.println("Your Element Present At "+index+" position ");
    }
}
