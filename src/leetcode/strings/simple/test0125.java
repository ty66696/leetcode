package leetcode.strings.simple;

public class test0125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s= s.replaceAll("[^A-Za-z0-9]","");
        s= s.toLowerCase().trim();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(sb);
        if(sb2.toString().equals(sb.reverse().toString())){
            return true;
        }else {
            return false;
        }
    }
}
