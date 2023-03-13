package leetcode.strings.simple;

import java.util.HashSet;

public class test1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        countConsistentStrings(allowed,words);
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            hs.add(c);
        }
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag =true;
            for (int i1 = 0; i1 < words[i].length(); i1++) {
                if(hs.add(words[i].charAt(i1))){
                    hs.remove(words[i].charAt(i1));
                    flag = false;
                    break;
                }
            }
            if(flag)
                index++;
        }
        return index;
    }
}
