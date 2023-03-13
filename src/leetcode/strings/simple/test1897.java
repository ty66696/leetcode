package leetcode.strings.simple;

import java.util.Arrays;

public class test1897 {
    public boolean makeEqual(String[] words) {
        int[] num = new int[26];
        String s = Arrays.toString(words);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                num[s.charAt(i)-'a']++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]%words.length!=0)
                return false;
        }
        return true;
    }
}
