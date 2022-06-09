package Strings;

import java.util.Scanner;

public class RemoveCharacterString {
    static void remove(String s1,String s2)
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            int flag=0;
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)== s2.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                ans.append(s1.charAt(i));
            }
        }
        System.out.println(ans.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        remove(str1,str2);

    }
}


