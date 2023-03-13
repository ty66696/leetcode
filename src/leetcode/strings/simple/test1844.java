package leetcode.strings.simple;

public class test1844 {
    public static void main(String[] args) {
        String s = "a1c1e1";
        replaceDigits(s);
    }
    public static String replaceDigits(String s) {
        char[] num = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                sb.append(s.charAt(i));
            }else {
                sb.append(num[s.charAt(i-1)-'a'+s.charAt(i)-'0']);
            }
        }
        return sb.toString();
    }
}
