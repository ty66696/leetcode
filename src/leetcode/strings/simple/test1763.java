package leetcode.strings.simple;

public class test1763 {
    public static void main(String[] args) {
        String s = "YazaAay";
        longestNiceSubstring(s);
    }
    public static String longestNiceSubstring(String s) {
        int max = 0;
        String s1 ="";
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for(int j = i;j<s.length();j++){
                boolean flag = true;
                str =str+s.charAt(j);
                for (int i1 = 0; i1 < str.length(); i1++) {
                    if(!(str.contains((char)(str.charAt(i1)+32)+"")||str.contains((char)(str.charAt(i1)-32)+""))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    if(str.length()>max){
                        s1 = str;
                        max = str.length();
                    }
                }
            }
        }
        return s1;
    }
}
