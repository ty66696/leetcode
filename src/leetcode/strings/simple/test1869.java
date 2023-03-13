package leetcode.strings.simple;

public class test1869 {
    public static void main(String[] args) {
        String s = "10";
        checkZeroOnes(s);
    }
    public static boolean checkZeroOnes(String s) {
        int m=0,n=0;
        if(s.charAt(0)=='0')
            n++;
        else
            m++;
        int sum=1;
        for (int i = 1; i < s.length(); i++) {
            while (i<s.length()&&s.charAt(i-1)==s.charAt(i)){
                sum=sum+1;
                i++;
            }
            if(s.charAt(i-1)=='0'){
                if(sum>n)
                    n=sum;
            }else
                if(sum>m)
                    m=sum;
            sum=1;
        }
        if(m>n)
            return true;
        else
            return false;
    }
}
