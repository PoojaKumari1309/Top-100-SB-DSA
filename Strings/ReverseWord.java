package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String> st = new Stack<>();
        String str1= "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                st.push(str1);
                str1="";
            }
            else
            {
                str1+= str.charAt(i);
            }
        }
        st.push(str1);
        String ans="";
        while(st.size()!=1)
        {
            ans+=st.peek()+" ";
            st.pop();
        }
        ans+=st.peek();
        System.out.println(ans);

    }
}
