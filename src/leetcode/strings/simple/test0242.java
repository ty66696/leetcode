package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;

public class test0242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean anagram = isAnagram(s, t);
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                int i1 = hm.get(c) + 1;
                hm.put(c,i1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!hm1.containsKey(c)){
                hm1.put(c,1);
            }else {
                int i1 = hm1.get(c) + 1;
                hm1.put(c,i1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : hm.entrySet()) {
            Character key = characterIntegerEntry.getKey();
            if(hm1.get(key)==null||!(hm1.get(key).equals(characterIntegerEntry.getValue()))){
                return false;
            }
        }
        return true;
    }
}
