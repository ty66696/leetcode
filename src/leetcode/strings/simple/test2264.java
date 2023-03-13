package leetcode.strings.simple;

public class test2264 {
    public String largestGoodInteger(String num) {
        String s = num.charAt(0)+"";
        int m = 1;
        String max = "";
        for (int i = 1; i < num.length(); i++) {
            if(num.charAt(i)==num.charAt(i-1)){
                m++;
                s=s+num.charAt(i);
                if(m==3){
                    if(s.compareTo(max)>0){
                        max=s;
                    }
                }
            }else {
                s = num.charAt(i)+"";
                m=1;
            }
        }
        return max;
    }
}
