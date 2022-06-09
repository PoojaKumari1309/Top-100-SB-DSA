package Strings;

import java.util.Scanner;

public class SumStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum=0;
        String tem="0";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                tem+=ch;
            }
            else
            {
                sum+=Integer.parseInt(tem);
                tem="0";
            }
        }
        System.out.println(sum+Integer.parseInt(tem));
    }
}
