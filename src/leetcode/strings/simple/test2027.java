package leetcode.strings.simple;

public class test2027 {
    public static void main(String[] args) {
        String s = "OOOO";
        minimumMoves(s);
    }
    public static int minimumMoves(String s) {
        int num=0;
        for (int i = 0; i < s.length();) {
            while (s.charAt(i)=='O'){
                i++;
                if(i==s.length())
                    return num;
            }

            i=i+3;
            num++;
        }
        return num;
    }
}
