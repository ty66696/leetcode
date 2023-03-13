package leetcode.strings.simple;

import com.sun.xml.internal.ws.util.StringUtils;

public class test1945 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        getLucky(s,k);
    }
    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c-'a'+1);
        }
        String string = sb.toString();
        for (int i = 0; i < k; i++) {
            int sum=0;
            for (int i1 = 0; i1 < string.length(); i1++) {
                int i2 = Integer.parseInt(string.charAt(i1)+"");
                sum=sum+i2;
            }
            string = sum+"";
        }
        return Integer.parseInt(string);
    }
}
