package leetcode.strings.simple;

import java.util.HashMap;

public class test0205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> hm1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            hm.put(c1,c);
            hm1.put(c,c1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if((!hm.get(c1).equals(c))||(!hm1.get(c).equals(c1)))
                return false;
        }
        return true;
    }
}
