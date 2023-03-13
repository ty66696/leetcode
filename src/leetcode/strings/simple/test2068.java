package leetcode.strings.simple;

public class test2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            num1[c-'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            num2[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(Math.abs(num1[i]-num2[i])>3)
                return false;
        }
        return true;
    }
}
