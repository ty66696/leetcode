package leetcode.strings.simple;

import java.util.HashSet;

public class test1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hs.add(c)) {
                int index = i;
                while (s.indexOf(c, index + 1) > 0) {
                    index = s.indexOf(c, index + 1);
                }
                max = Math.max(max,index - i - 1);
            }
        }
        return max;
    }
}
