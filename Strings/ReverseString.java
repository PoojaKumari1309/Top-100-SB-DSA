package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        int j=0;
        while(!st.isEmpty())
        {
            char ch= st.peek();
            st.pop();
            sb.insert(j,ch);
            j++;
        }
        System.out.println(sb);

    }
}
