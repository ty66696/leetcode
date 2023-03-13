package leetcode.strings.simple;

public class test2351 {
    public char repeatedCharacter(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c-'a']++;
            if(num[c-'a']==2)
                return c;
        }
        return ' ';
     }
}
