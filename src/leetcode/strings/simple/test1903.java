package leetcode.strings.simple;

public class test1903 {
    public String largestOddNumber(String num) {
        for (int length = num.length()-1; length >= 0; length--) {
            if(num.charAt(length)%2==1)
                return num.substring(0,length+1);
        }
        return "";
    }
}
