package leetcode.strings.simple;

public class test0434 {
    public static void main(String[] args) {
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s) {
        s = s.trim();
        if(s.length()==0)
            return 0;
        String[] s1 = s.split("\\s+");
        return s1.length;
    }
}
