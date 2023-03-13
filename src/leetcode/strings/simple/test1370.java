package leetcode.strings.simple;

public class test1370 {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }
    public static String sortString(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            num[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        while (length>0){
            for (int i = 0; i < num.length; i++) {
                if(num[i]>0){
                    char c  = (char)(i + 'a');
                    num[i]--;
                    sb.append(c);
                    length--;
                }
            }
            for (int i = num.length-1; i >= 0; i--) {
                if(num[i]>0){
                    char c  = (char)(i + 'a');
                    num[i]--;
                    sb.append(c);
                    length--;
                }
            }
        }
        return sb.toString();
    }
}
