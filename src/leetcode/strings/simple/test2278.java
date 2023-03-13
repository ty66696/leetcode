package leetcode.strings.simple;

public class test2278 {
    public int percentageLetter(String s, char letter) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c - 'a']++;
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        int i = num[letter - 'a'];
        return i / sum;
    }
}
