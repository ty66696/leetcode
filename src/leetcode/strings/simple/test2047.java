package leetcode.strings.simple;

import java.util.TreeMap;

public class test2047 {
    public static void main(String[] args) {
        String sentence = "q-,";
        System.out.println(countValidWords(sentence));
    }
    public static int countValidWords(String sentence) {
        int index=0;
        String[] split = sentence.trim().split("\\s+");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            int m=0;
            boolean flag = true;
            if(s.length()==1){
                if(Character.isDigit(s.charAt(0))||s.charAt(0)=='-')
                    continue;
            }else {
                if(!Character.isLetter(s.charAt(0)))
                    continue;
            }
            for (int i1 = 1; i1 < s.length(); i1++) {
                if(Character.isDigit(s.charAt(i1))) {
                    flag = false;
                    break;
                }
                if(s.charAt(i1)=='-'){
                    if(i1==s.length()-1) {
                        flag = false;
                        break;
                    }else {
                        if (m >= 1) {
                            flag = false;
                            break;
                        } else if(!Character.isLetter(s.charAt(i1+1))){
                            flag = false;
                            break;
                        }else {
                                m++;
                        }
                    }

                }
                if(s.charAt(i1)=='!'||s.charAt(i1)=='.'||s.charAt(i1)==','){
                    if(i1!=s.length()-1){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
                index++;
        }
        return index;
    }
}
