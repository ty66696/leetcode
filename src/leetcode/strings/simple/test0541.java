package leetcode.strings.simple;

public class test0541 {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }
    public static String reverseStr(String s, int k) {

        String s1 = s.substring(0, k);
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        if(s.length()<2*k){
            return s2+s.substring(k);
        }
        String s5 = s.substring(k, 2 * k);
        String s4;
        if((s.length()-2*k)<k) {
            String s3 = s.substring(2 * k);
            StringBuilder sb2 = new StringBuilder(s3);
            s4 = sb2.reverse().toString();
        }else if((s.length()-2*k)<2*k&&(s.length()-2*k)>=k){
            String s3 = s.substring(2 * k,2*k+k);
            String s6 = s.substring(2 * k + k);
            StringBuilder sb2 = new StringBuilder(s3);
            s4 = sb2.reverse().toString()+s6;
        }else {
            s4 = s.substring(2 * k);
        }
        return s2+s5+s4;
    }
}
