package leetcode.strings.simple;

public class test0680 {
    public static void main(String[] args) {
        String s = "deeee";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        if(s.equals(reserver(s)))
            return true;
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length()/2);
        s2=reserver(s2);
        String s3,s4;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                s3 = s1.substring(0,i)+s1.substring(i+1);
                s4 = s2.substring(0,i)+s2.substring(i+1);
                if((s3+reserver(s2)).equals(reserver(s3+reserver(s2)))|| (s1+reserver(s4)).equals(reserver(s1+reserver(s4))) )
                    return true;
                else
                    return false;
            }
        }
        return true;
    }

    public static String reserver(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        return s1;
    }

}
