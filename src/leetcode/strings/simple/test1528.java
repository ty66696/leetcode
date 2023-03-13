package leetcode.strings.simple;

public class test1528 {
    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = indices[i];
            str[index] = c;
        }
        return new String(str);
    }
}
