package leetcode.strings.simple;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class test0387 {
    public static void main(String[] args) {
        String s = "leetcode";
        int i = firstUniqChar(s);
        System.out.println(i);
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                hm.put(c,hm.get(c)+1);
            }
        }
        int index=100000;
        char c = '1';
        for (Map.Entry<Character, Integer> characterIntegerEntry : hm.entrySet()) {
            Integer value = characterIntegerEntry.getValue();
            if(value ==1){
                Character key = characterIntegerEntry.getKey();
                int index1 = s.indexOf(key);
                if(index1<=index){
                    index = index1;
                   c = key;
                }
            }
        }
        if(c =='1'){
            return -1;
        }
        return s.indexOf(c);
    }
}
