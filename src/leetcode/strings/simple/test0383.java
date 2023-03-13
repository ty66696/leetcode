package leetcode.strings.simple;

import java.util.HashMap;

public class test0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                hm.put(c,hm.get(c)+1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if(hm.get(c)<1||(!hm.containsKey(c)))
                return false;
            else{
                hm.put(c,hm.get(c)-1);
            }
        }
        return true;
    }
}
