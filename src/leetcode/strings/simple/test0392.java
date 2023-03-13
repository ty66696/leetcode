package leetcode.strings.simple;

public class test0392 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if(index==-1)
                return false;
        }

        int length = s.length();
        int j = 0;
        if(length==0)
            return true;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            char c1 = s.charAt(j);
            if(c==c1){
                j++;
            }
            if(j==length)
                return true;
        }
        return false;
    }
}
