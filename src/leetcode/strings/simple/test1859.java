package leetcode.strings.simple;

import java.util.Arrays;

public class test1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        sortSentence(s);
    }
    public static String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
            int num = s1[i].charAt(s1[i].length()-1)-'0'-1;
            s1[i]=s1[i].substring(0,s1[i].length()-1);
            s2[num] = s1[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s2.length; i++) {
            if(i==s2.length-1) {
                sb.append(s2[i]);
                break;
            }
            sb.append(s2[i]).append(" ");
        }
        return sb.toString();
    }
}
