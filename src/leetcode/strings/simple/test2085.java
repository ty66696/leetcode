package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;

public class test2085 {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            String s = words1[i];
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else
                hm.put(s, 1);
        }
        int m = 0;
        for (int i = 0; i < words2.length; i++) {
            String s = words2[i];
            if (hm2.containsKey(s)) {
                hm2.put(s, hm2.get(s) + 1);
            } else
                hm2.put(s, 1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            String key = stringIntegerEntry.getKey();
            int value = stringIntegerEntry.getValue();
            if(value==1&&hm2.containsKey(key)&&hm2.get(key)==1)
                m++;
        }
        return m;
    }
}
