package leetcode.strings.simple;

import java.util.Arrays;

public class test2283 {
    public static void main(String[] args) {
        String num = "1210";
        digitCount(num);
    }
    public static boolean digitCount(String num) {
        int[] m = new int[10];
        char[] chars = num.toCharArray();
        for (int i = 0; i < num.length(); i++) {
            int k = Integer.parseInt(num.charAt(i)-'0'+"");
            m[k]++;
        }
        for (int i = 0; i < chars.length; i++) {
            int aChar = chars[i]-'0';
            if(aChar!=m[i])
                return false;
        }
        return true;
    }
}
