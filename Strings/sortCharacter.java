package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class sortCharacter {
    static String sort(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=sort(str);
        System.out.println(str);
    }
}