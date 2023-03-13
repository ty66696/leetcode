package leetcode.strings.simple;

public class test0389 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
    public static char findTheDifference(String s, String t) {
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            c[c1 - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char c1 = t.charAt(i);
            c[c1 - 'a'] --;
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=0){
                char i1 = (char)('a' + i);
                return i1;
            }
        }
        return t.charAt(0);
    }

}
