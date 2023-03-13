package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test1408 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int i1 = 0; i1 < words.length; i1++) {
                if(words[i1].contains(word)&&words[i1].length()!=word.length()){
                    list.add(word);
                    break;
                }
            }
        }
        return list;
    }
}
