package leetcode.strings.simple;

public class test2269 {
    public static void main(String[] args) {
        int num =240,k=2;
        divisorSubstrings(num,k);
    }
    public static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int m=0;
        for (int i = 0; i+k <= s.length(); i++) {
            String s1 = s.substring(i, i + k);
            int i1 = Integer.parseInt(s1);
            if(i1!=0&&num%i1==0)
                m++;
        }
        return m;
    }
}
