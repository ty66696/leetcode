package leetcode.strings.simple;

import java.util.HashMap;

public class test0290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length)
            return false;
        for (int i = 0; i < str.length; i++) {
            char c = pattern.charAt(i);
            String s1 = str[i];
            if(!hm.containsKey(c)){
                if(hm.containsValue(s1))
                    return false;
                hm.put(c,s1);
            }else {
                String s2 = hm.get(c);
                if(!s1.equals(s2)){
                    return false;
                }
            }
        }
        return true;
    }
}
