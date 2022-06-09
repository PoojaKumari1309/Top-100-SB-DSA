package Strings;

import java.util.Scanner;

public class changeCases {
    static void case1(String s)
    {
        char[] str= s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int ascii=(int)s.charAt(i);
            if(ascii>=97&&ascii<=122)
            {
                 str[i]=((char)(ascii-32));
            }
            else if(ascii>=65&&ascii<=90)
            {
                str[i]=((char)(ascii+32));
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        case1(str);
     }
}

