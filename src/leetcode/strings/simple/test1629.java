package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        TreeMap<Character,Integer> hm = new TreeMap<>();
        for (int i = 0; i < keysPressed.length(); i++) {
            int time = 0;
            char c = keysPressed.charAt(i);
            if(i==0){
                time = releaseTimes[0];
            }else
                time = releaseTimes[i]-releaseTimes[i-1];
            if(hm.containsKey(c)){
                if(hm.get(c)<time)
                    hm.put(c,time);
            }else
                hm.put(c,time);
        }
        int max = releaseTimes[0];
        char c= keysPressed.charAt(0);
        for (Map.Entry<Character, Integer> characterIntegerEntry : hm.entrySet()) {
            int value = characterIntegerEntry.getValue();
            char key = characterIntegerEntry.getKey();
            if(max<value){
                max = value;
                c = key;
            }else if(max ==value&&key>c){
                c = key;
            }
        }
        return c;
    }
}
