package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Subset {


    // 1 approach

//    static int  subsetArray(int []arr1,int []arr2)
//    {
//        for(int i=0;i<arr1.length;i++)
//        {
//            boolean present =false;
//            for(int j=0;j<arr2.length;j++)
//            {
//                if(arr1[i]==arr2[j])
//                {
//                    present=true;
//                    break;
//                }
//            }
//            if(present==false) return -1;
//        }
//        return 1;
//    }


    // 2 approach
    static int binarySearch(int ele, int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == ele) {
                return 1;
            } else if (arr[mid] < ele) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
        }
        return -1;
    }
    static int subset1(int [] arr1 ,int[]  arr2)
    {
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            int val=binarySearch(arr1[i],arr2);
            if(val==-1)
                return -1;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of Elements in first array");
        int n1 =sc.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the No. of Elements in second array");
        int n2 =sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        // 1 approach
//        int index=subsetArray(arr1,arr2);
//        if(index==1)
//        {
//            System.out.println("arr1[] is as subset arr2[]");
//        }
//        else
//        {
//            System.out.println("arr1[] is not a subset arr2[]");
//        }

        // 2 approach
        if(subset1(arr1,arr2)==1)
        {
            System.out.println("arr1 is a subset of arr2");
        }
        else
        {
            System.out.println("arr1 is not a subset of arr2");
        }

    }
}
