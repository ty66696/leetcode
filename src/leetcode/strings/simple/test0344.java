package leetcode.strings.simple;

public class test0344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp;
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
