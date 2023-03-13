package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class test1002 {
    public static void main(String[] args) {
        String[] words = {"dbcdjbedfchcbhbecbadeaefefhcaagfghjaidaadeaabaaegj","ciacjdahajifafhbfbdaddbgbddedhjbbbdbbbfhcidfcbiijg"};


        System.out.println(commonChars(words));
    }
    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int num[][] = new int[words.length][26];
        for (int i = 0; i < words[0].length(); i++) {
            for (int j = 1; j < words.length; j++) {
                int index = words[j].indexOf(words[0].charAt(i), num[j][words[0].charAt(i) - 'a']);
                if(index!=-1){
                    num[j][words[0].charAt(i)-'a'] = index+1;
                }else
                    break;
                if(j==words.length-1)
                    list.add(words[0].charAt(i)+"");
            }
        }
        return list;
    }
}
