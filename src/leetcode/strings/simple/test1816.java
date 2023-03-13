package leetcode.strings.simple;

public class test1816 {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        String s2 ="";
        for(int i = 0;i<k;i++){
            if(i==k-1)
                return s2+s1[i];
            s2=s2+s1[i]+" ";
        }
        return s2;
    }
}
