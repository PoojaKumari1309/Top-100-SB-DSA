package Strings;

import java.util.Scanner;

public class CountWords {
    static void counting(String str)
    {
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        counting(str);
    }

}
