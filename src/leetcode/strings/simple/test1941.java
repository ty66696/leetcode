package leetcode.strings.simple;

public class test1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i)-'a']++;
        }
        int m = s.length() - s.replace(s.charAt(0) + "", "").length();
        for (int i1 = 0; i1 < num.length; i1++) {
            if(num[i1]>0&&num[i1]!=m)
                return false;
        }
        return true;
    }
}
