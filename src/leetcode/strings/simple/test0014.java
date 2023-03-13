package leetcode.strings.simple;

public class test0014 {
    public static void main(String[] args) {
        String []strs = new String[]{"c","acc","ccc"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        String s="";
        String str = strs[0];
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            s=s+chars[i];
            for (int i1 = 1; i1 < strs.length; i1++) {
                if(!strs[i1].startsWith(s)){
                    return s.substring(0,s.length()-1);
                }
            }

        }

        return s;
    }
}
