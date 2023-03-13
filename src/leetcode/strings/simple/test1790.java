package leetcode.strings.simple;

public class test1790 {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "dcba";
        areAlmostEqual(s1,s2);
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        char m,n;
        int i=0,j=s1.length()-1;
        while (i<s1.length()&&s1.charAt(i)==s2.charAt(i)){
            i++;
        }

        while (j>=0&&s1.charAt(j)==s2.charAt(j))
            j--;
        if(i<s1.length()&&j>=0&&s1.charAt(i)==s2.charAt(j)&&s1.charAt(j)==s2.charAt(i)){
            StringBuilder sb = new StringBuilder(s2);
            sb.setCharAt(i,s2.charAt(j));
            sb.setCharAt(j,s2.charAt(i));
            if(sb.toString().equals(s1))
                return true;
            else
                return false;
        }else
            return false;
    }
}
