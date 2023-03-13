package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test2138 {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        divideString(s,k,fill);
    }
    public static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        String s1 = s.substring(0, s.length() / k * k);
        String s2 = s.substring(s.length() / k * k);
        for (int i = 0; i < s1.length(); i=i+k) {
            String str = s.substring(i,i+k);
            list.add(str);
        }
        int length = s2.length();
        if(s2.length()!=0){
            for (int i = 0; i < k - length; i++) {
                s2=s2+fill;
            }
        }else
            return list.toArray(new String[0]);
        list.add(s2);
        return list.toArray(new String[0]);
    }
}
