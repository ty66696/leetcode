package leetcode.strings.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class test0819 {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String exception = "[\n!?',;.]";
        paragraph = paragraph.replaceAll(exception," ");
        paragraph = paragraph.toLowerCase();
        String[] s = paragraph.split("\\s+");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            boolean flag =true;
            for (int i1 = 0; i1 < banned.length; i1++) {
                if(banned[i1].equals(s1)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(!hm.containsKey(s1)){
                    hm.put(s1,1);
                }else
                    hm.put(s1,hm.get(s1)+1);
            }
        }
        int max =0;
        String s1="";
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            Integer value = stringIntegerEntry.getValue();
            if(value>max){
                s1 = stringIntegerEntry.getKey();
                max =stringIntegerEntry.getValue();
            }
        }
        return s1;
    }
}
