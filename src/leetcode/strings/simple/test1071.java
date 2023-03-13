package leetcode.strings.simple;

public class test1071 {
    public static void main(String[] args) {
        String s1 ="ABABAB",s2="ABAB";
        gcdOfStrings(s1,s2);
    }
    public static String gcdOfStrings(String str1, String str2) {
        String s = "";
        String str ="";
        int len = 0;
        for (int i = 0; i < str1.length()/2; i++) {
            s=s+str1.charAt(i);
            if(str1.replace(s,"").equals("")){
                if(str2.replace(s,"").equals("")){
                    if(s.length()>len){
                        str = s;
                        len = s.length();
                    }
                }
            }
        }
        return str;
    }
}
