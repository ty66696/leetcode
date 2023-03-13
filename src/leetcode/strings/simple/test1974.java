package leetcode.strings.simple;

public class test1974 {
    public int minTimeToType(String word) {
        char[] chars = word.toCharArray();
        int res = Math.min(chars[0] - 'a' + 1, 26 - (chars[0] - 'a') + 1);
        for (int i = 1; i < chars.length; i++) {
            res += Math.min(Math.abs(chars[i] - chars[i - 1]) + 1, 27 - Math.abs(chars[i] - chars[i - 1]));
        }
        return res;
    }

}
