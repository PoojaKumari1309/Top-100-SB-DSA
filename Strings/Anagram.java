package Strings;

import java.util.Scanner;

public class Anagram {
    static boolean anagram(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int [] freq=new int[26];
        for(int i=0;i< str1.length();i++)
        {
            freq[str1.charAt(i)-'A']++;
        }
        for(int i=0;i< str2.length();i++)
        {
            freq[str2.charAt(i)-'A']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(anagram(str1,str2));
    }
}
