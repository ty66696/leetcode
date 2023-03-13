package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;

public class test0409 {
    public int longestPalindrome(String s) {
        if(s=="")
            return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }
        }
        int sum = 0;
        boolean flag = false;
        for (Map.Entry<Character, Integer> characterIntegerEntry : hm.entrySet()) {
            Integer value = characterIntegerEntry.getValue();
            if (value % 2 == 0 ) {
                sum = sum + value;
            }
            if (value % 2 == 1) {
                sum = sum + (value/2)*2;
                flag = true;
            }
        }
        if (flag) {
            sum = sum + 1;
        }
        return sum;
    }
}
