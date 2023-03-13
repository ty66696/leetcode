package leetcode.strings.simple;

import java.awt.event.MouseWheelListener;
import java.util.Arrays;

public class test0482 {
    public static void main(String[] args) {
        String s = "-";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));
    }
    public static String licenseKeyFormatting(String s, int k) {
        String str = s.replace("-", "");
        if(str.length()==0)
            return "";
        if (s.length() == 1)
            return s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int length =str.length();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            sb.append(c);
            if (length % k != 0) {
                if (i == length % k - 1) {
                    sb.append("-");
                }
            }
            if ((i+1-length%k)%k==0&&(i>length%k-1)){
                if(i==length-1)
                    break;
                sb.append("-");
            }
        }
        return sb.toString().toUpperCase();
    }
}
