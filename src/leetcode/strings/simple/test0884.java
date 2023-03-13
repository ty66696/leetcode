package leetcode.strings.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class test0884 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        uncommonFromSentences(s1,s2);
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] m = s1.split(" ");
        String[] n = s2.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < m.length; i++) {
            if(!hm.containsKey(m[i])){
                hm.put(m[i],1);
            }else {
                hm.put(m[i],hm.get(m[i])+1);
            }
        }
        for (int i = 0; i < n.length; i++) {
            if(!hm.containsKey(n[i])){
                hm.put(n[i],1);
            }else {
                hm.put(n[i],hm.get(n[i])+1);
            }
        }
        HashSet<String> hs = new HashSet<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            Integer value = stringIntegerEntry.getValue();
            if(value==1){
                hs.add(stringIntegerEntry.getKey());
            }
        }
        return hs.toArray(new String[hs.size()]);
    }
}
