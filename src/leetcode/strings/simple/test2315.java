package leetcode.strings.simple;

public class test2315 {
    public int countAsterisks(String s) {
        int n=0;
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='|'){
                n++;
                if(n==2)
                    n=0;
            }
            if(n==0){
                if(s.charAt(i)=='*')
                    sum++;
            }
        }
        return sum;
    }
}
