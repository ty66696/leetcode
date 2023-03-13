package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class test2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog",message ="vkbs bs t suepuv";
        decodeMessage(key,message);
    }
    public static String decodeMessage(String key, String message) {
        String s = "";
        int j = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < key.length(); i++) {
            if(!list.contains(key.charAt(i))&&key.charAt(i)!=' ')
                list.add(key.charAt(i));
        }
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ')
                s = s + " ";
            else {
                char c = message.charAt(i);
                int index = list.indexOf(c);
                char x = (char) ('a' + index);
                s = s + x;
            }
        }
        return s;
    }
}
