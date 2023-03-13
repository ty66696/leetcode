package leetcode.strings.simple;

public class test2490 {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            char c1 = s[i%s.length].charAt(s[i].length() - 1);
            char c2 = s[(i + 1) % (s.length)].charAt(0);
            if(c1!=c2)
                return false;
        }
        return true;
    }
}
