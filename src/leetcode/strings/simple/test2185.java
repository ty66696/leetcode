package leetcode.strings.simple;

import com.sun.xml.internal.ws.util.StringUtils;

public class test2185 {
    public int prefixCount(String[] words, String pref) {
        int index=0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.startsWith(pref))
                index++;
        }
        return index;
    }
}
