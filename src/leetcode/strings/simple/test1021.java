package leetcode.strings.simple;

import java.util.ArrayList;
import java.util.List;

public class test1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        removeOuterParentheses(s);

    }
    public static String removeOuterParentheses(String s) {
        List<String> list = new ArrayList<>();
        int index = 1,j=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                index++;
            }else
                index--;
            if(index==0){
                String s1 = s.substring(j+1, i);
                list.add(s1);
                j = i+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s1 : list) {
            sb.append(s1);
        }
        return sb.toString();
    }
}
