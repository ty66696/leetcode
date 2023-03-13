package leetcode.strings.simple;

import java.util.HashMap;

public class test2451 {
    public String oddString(String[] words) {
        HashMap<int[],Integer> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] num = new int[word.length()-1];
            int l = 0;
            for (int i1 = 1; i1 < word.length(); i1++) {
                int k = word.charAt(i) - word.charAt(i - 1);
                num[l] = k;
                l++;
            }

        }
    return null;
    }

}
