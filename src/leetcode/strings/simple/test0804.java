package leetcode.strings.simple;

import java.util.HashMap;

public class test0804 {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            String m = "";
            for (int i = 0; i < word.length(); i++) {
                int i1 = word.charAt(i) - 'a';
                String s = str[i1];
                m= m+s;
            }
            hm.put(m,1);
        }
        return hm.size();
    }
}
