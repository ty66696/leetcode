package leetcode.strings.simple;

public class test1876 {
    public int countGoodSubstrings(String s) {
        int index = 0;
        for (int i = 0; i < s.length()-2; i++) {
            String s1 = s.substring(i, i + 3);
            if(s1.charAt(0)!=s1.charAt(1)&&s1.charAt(0)!=s1.charAt(2)&&s1.charAt(1)!=s1.charAt(2)){
                index++;
            }
        }
        return index;
    }
}
