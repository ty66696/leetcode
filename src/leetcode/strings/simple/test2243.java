package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test2243 {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        digitSum(s,k);
    }
    public static String digitSum(String s, int k) {
        if(s.length()<=k)
            return s;
        do {
            int m = 0;
            String str = "";
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                m++;
                int n = Integer.parseInt(s.charAt(i) + "");
                num = num + n;
                if (m == k||i==s.length()-1) {
                    m = 0;
                    str = str + num;
                    num = 0;

                }
            }
            s=str;
        }while (s.length()>k);
        return s;
    }
}
