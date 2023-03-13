package leetcode.strings.simple;

import java.util.HashSet;

public class test1805 {
    public static void main(String[] args) {
        String word ="a1b01c001";
        numDifferentIntegers(word);
    }
    public static int numDifferentIntegers(String word) {
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='0'&&word.charAt(i)<='9'){
                s=s+word.charAt(i);
            }else
                s= s+" ";
        }
        if(s.matches("\\s+"))
            return 0;
        String[] split = s.trim().split("\\s+");
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            split[i]=split[i].replaceFirst("^0*","");
            hs.add(split[i]);
        }
        return hs.size();
    }
}
