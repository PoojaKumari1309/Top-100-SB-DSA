//package Strings;
//
//import java.util.Scanner;
//
//public class maximumOccCharater {
//    static void occuring(String s)
//    {
//        int[]freq=new int[26];
//        for(int i=0;i<s.length();i++)
//        {
//           freq[s.charAt(i)-'A']++;
//        }
//        char ans;
//        int max=0;
//        for(int i=0;i<26;i++)
//        {
//            if(freq[i]>max)
//            {
//                max=freq[i];
//                ans= (char)(i+'A');
//            }
//        }
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        occuring(str);
//    }
//}
