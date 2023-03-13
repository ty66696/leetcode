package leetcode.strings.simple;

import java.util.*;

public class test2423 {
    public static void main(String[] args) {
        String word = "aazz";
        equalFrequency(word);
    }
    public static boolean equalFrequency(String word) {
        int[] num = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            num[c-'a']++;
        }

return true;
    }
}
