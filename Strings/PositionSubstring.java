package Strings;

import java.util.Scanner;

public class PositionSubstring {

    public static int position(String s1,String s2)
    {

        for(int i=0;i<s1.length();i++)
        {
            int temp=i;
            int j=0;
            for(j=0;j<s2.length();j++){
                if(s1.charAt(temp)==s2.charAt(j))
                {
                    temp++;
                }
                else
                {
                    break;
                }
            }
          if(j==s2.length())
          {
              return i;
          }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(position(str1,str2));

    }
}
