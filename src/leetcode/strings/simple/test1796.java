package leetcode.strings.simple;

import java.util.Collections;
import java.util.HashSet;

public class test1796 {
    public int secondHighest(String s) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                int num = Integer.parseInt(c + "");
                hs.add(num);
            }
        }
        if(hs.size()<=1)
            return -1;
        int max = Collections.max(hs);
        hs.remove(max);
        max=Collections.max(hs);
        return max;
    }
}
