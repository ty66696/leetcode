package leetcode.strings.simple;

import java.util.Arrays;

public class test0917 {
    public static void main(String[] args) {
        String s = "ab-cd";
        reverseOnlyLetters(s);
    }
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0,j=chars.length-1; i<=j; i++,j--) {


            while (!((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z'))){
                i++;
                if(i>=j){
                    return fanhui(chars);
                }
            }
            while (!((chars[j]>='a'&&chars[j]<='z')||(chars[j]>='A'&&chars[j]<='Z'))){
                j--;
                if(j<=i)
                    return fanhui(chars);
            }
            char c;
            c= chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }
        return fanhui(chars);
    }

    private static String fanhui(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
