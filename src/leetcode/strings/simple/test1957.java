package leetcode.strings.simple;

import java.util.Scanner;

public class test1957 {
    public static void main(String[] args) {
        String s = "leeetcode";
        makeFancyString(s);
    }
    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n=1;
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)!=s.charAt(i)){
                n=1;
                sb.append(s.charAt(i));
            }else {
                n++;
                if(n<=2)
                    sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
