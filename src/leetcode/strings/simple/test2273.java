package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if(yiwei(words[i],list.get(list.size()-1))){
                list.add(words[i]);
            }
        }
        return list;
    }
    public  static boolean yiwei(String s1,String s2){
        if(s1.length()!=s2.length())
            return true;
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            char c2 = s2.charAt(i);
            num1[c-'a']++;
            num2[c2-'a']++;
        }
        for (int i = 0; i < num1.length; i++) {
            if(num1[i]!=num2[i])
                return true;
        }
        return false;
    }
}
