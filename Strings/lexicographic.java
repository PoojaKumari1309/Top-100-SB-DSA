package Strings;

import java.util.Scanner;

public class lexicographic {

    static void lexo(String str)
    {
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            int ascii = (int)str.charAt(i);
            if(ascii==90)
            {
                ans.insert(i,(char)(65));
            }
            else if(ascii==122)
            {
                ans.insert(i,(char)(97));
            }
            else if( ( ascii>=65 && ascii<=90 )  || ( ascii>=97 && ascii<=122) )
            {
                ans.insert(i,(char)(ascii+1));
            }
        }
        System.out.println(ans.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        lexo(str);
    }
}
