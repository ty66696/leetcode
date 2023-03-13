package leetcode.strings.simple;

public class test1704 {
    public static void main(String[] args) {
        String s = "book";
        halvesAreAlike(s);
    }
    public static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        String str = "aeiouAEIOU";
        int index1=0,index2=0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(str.contains(c+""))
                index1++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(str.contains(c+""))
                index2++;
        }
        if(index1==index2)
            return true;
        else
            return false;
    }
}
