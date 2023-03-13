package leetcode.strings.simple;

public class test0058 {
    public static void main(String[] args) {
        String s = "a";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {
        int n = 0;
        String[] str = s.split(" ");
        for (int length = str.length-1; length >= 0; length--) {
            String s1 = str[length];
            while(s1!=" "){
                n = str[length].length();
                return n;
            }
        }
        return n;
    }
}
