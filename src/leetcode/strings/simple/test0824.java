package leetcode.strings.simple;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class test0824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(toGoatLatin(sentence));
    }
    public static String toGoatLatin(String sentence) {
        String s = "aeiouAEIOU";

        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i].substring(0, 1);
            String s2 = split[i].substring(1);
            if(!s.contains(s1)){
                split[i] = s2+s1;
            }
            String s3="";
            for (int i1 = 0; i1 <= i; i1++) {
                s3=s3+"a";
            }
            split[i]=split[i]+"ma"+s3;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(i==split.length-1){
                sb.append(split[i]);
                return sb.toString();
            }
            sb.append(split[i]+" ");
        }
        return null;
    }
}
