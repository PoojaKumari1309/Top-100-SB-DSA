package Strings;

import java.util.Scanner;

public class findNonRepeating {

    static void repeating(String s)
    {
        // 1 approach o(N*N)


//        int []freq=new int[s.length()];
//        char[]st=s.toCharArray();
//    for(int i=0;i<s.length();i++)
//    {
//         freq[i]=1;
//        for(int j=i+1;j<s.length();j++)
//        {
//            if(st[i]==st[j]){
//                freq[i]++;
//                st[j]='-';
//            }
//        }
//    }
//    for(int i=0;i<s.length();i++)
//    {
//        if(freq[i]==1 && st[i]!='-'){
//        System.out.print(st[i]+",");
//
//         }
//    }

        // o(N)

        int[]freq=new int[200];
        char[]st1=s.toCharArray();
        for(int i=0;i<st1.length;i++)
        {
            if(st1[i]!=' ')
            {
                freq[(int)(st1[i])]++;
            }
        }
        for(int i=0;i<s.length();i++)
        {
          if(freq[(int)(st1[i])]==1){
          System.out.print(st1[i]+",");
         }
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         repeating(str);

    }
}
